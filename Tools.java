import java.util.Scanner;

public class Tools {
    public static Scanner sc = new Scanner(System.in);

    // Categorias de Unidades
    public static void categoriaLongitud() {
        System.out.println("A que tipo de unidad desea convertir?");

        boolean longitudValida = false;
        while (!longitudValida) {
            try {
                System.out.println("Se le recuerda al usuario que solo esta permitido: km, m, cm, mm, µm, mi, yd, ft, in");
                String tipo = sc.nextLine().trim(); // Elimina espacios en blanco al inicio y al final de la cadena.
                tipo = tipo.toLowerCase(); // Para que no haya problemas con las mayusculas
                tipoLongitud(tipo); // Verifica con el metodo de control de errores
                longitudValida = true;
            }catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
    public static void categoriaMasa() {
        System.out.println("A que tipo de unidad desea convertir?");

        boolean masaValida = false;
        while (!masaValida) {
            try {
                System.out.println("Se le recuerda al usuario que solo esta permitido: kg, g, mg, t, lb, oz, ton");
                String tipo = sc.nextLine().trim(); // Elimina espacios en blanco al inicio y al final de la cadena.
                tipo = tipo.toLowerCase(); // Para que no haya problemas con las mayusculas
                tipoMasa(tipo); // Verifica con el metodo de control de errores
                masaValida = true;
            }catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }

    }
    public static void categoriaTemperatura() {
        System.out.println("A que tipo de unidad desea convertir?");

        boolean temperaturaValida = false;
        while (!temperaturaValida) {
            try {
                System.out.println("Se le recuerda al usuario que solo esta permitido: C, K, F, R");
                String tipo = sc.nextLine().trim(); // Elimina espacios en blanco al inicio y al final de la cadena.
                tipo = tipo.toUpperCase(); // Para que no haya problemas con las mayusculas
                tipoTemperatura(tipo); // Verifica con el metodo de control de errores
                temperaturaValida = true;
            }catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }

    }
    public static void categoriaVolumen() {
        System.out.println("A que tipo de unidad desea convertir?");

        boolean volumenValido = false;
        while (!volumenValido) {
            try {
                System.out.println("Se le recuerda al usuario que solo esta permitido: m3, L, mL, cm3, kL, gal, qt, pt, oz, bbl");
                String tipo = sc.nextLine().trim(); // Elimina espacios en blanco al inicio y al final de la cadena.
                tipoVolumen(tipo); // Verifica con el metodo de control de errores
                volumenValido = true;
            }catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }

    }
    public static void categoriaTiempo() {
        System.out.println("A que tipo de unidad desea convertir?");
        boolean tiempoValido = false;
        while (!tiempoValido) {
            try {
                System.out.println("Se le recuerda al usuario que solo esta permitido: s, min, h, d, a, ms, µs");
                String tipo = sc.nextLine().trim(); // Elimina espacios en blanco al inicio y al final de la cadena.
                tipo = tipo.toLowerCase(); // Para que no haya problemas con las mayusculas
                tipoTiempo(tipo); // Verifica con el metodo de control de errores
                tiempoValido = true;
            }catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }

    }

    // Manejo de excepciones de cada categoria
    // Longitud
    public static void tipoLongitud(String tipoLongitud) throws Exception{
        if(tipoLongitud.isEmpty()){
            throw new Exception("No puede ser vacio");
        }
        String[] unidades = {"km", "m", "cm", "mm", "µm", "mi", "yd", "ft", "in"}; // Nos permite validar desde una base, asi evitamos numeros o caracteres especiales
        boolean encontrado = false;
        for(int i = 0; i < unidades.length; i++){
            if(unidades[i].equals(tipoLongitud)){
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            throw new Exception("No se encontro unidad, use una de las unidades mencionadas anteriormente.");
        }
    }
    // Masa
    public static void tipoMasa(String tipoMasa) throws Exception{
        if(tipoMasa.isEmpty()){
            throw new Exception("No puede ser vacio");
        }
        String[] unidades = {"kg", "g", "mg", "t", "lb", "oz", "ton"}; // Nos permite validar desde una base, asi evitamos numeros o caracteres especiales
        boolean encontrado = false;
        for(int i = 0; i < unidades.length; i++){
            if(unidades[i].equals(tipoMasa)){
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            throw new Exception("No se encontro unidad, use una de las unidades mencionadas anteriormente.");
        }
    }
    // Temperatura
    public static void tipoTemperatura(String tipoTemperatura) throws Exception{
        if(tipoTemperatura.isEmpty()){
            throw new Exception("No puede ser vacio");
        }
        String[] unidades = {"C", "K", "F", "R"}; // Nos permite validar desde una base, asi evitamos numeros o caracteres especiales
        boolean encontrado = false;
        for(int i = 0; i < unidades.length; i++){
            if(unidades[i].equals(tipoTemperatura)){
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            throw new Exception("No se encontro unidad, use una de las unidades mencionadas anteriormente.");
        }
    }
    // Volumen
    public static void tipoVolumen(String tipoVolumen) throws Exception{
        if(tipoVolumen.isEmpty()){
            throw new Exception("No puede ser vacio");
        }
        String[] unidades = {"m3", "L", "mL", "cm3", "kL", "gal", "qt", "pt", "oz", "bbl"}; // Nos permite validar desde una base, asi evitamos numeros o caracteres especiales
        boolean encontrado = false;
        for(int i = 0; i < unidades.length; i++){
            if(unidades[i].equals(tipoVolumen)){
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            throw new Exception("No se encontro unidad, use una de las unidades mencionadas anteriormente.");
        }
    }
    // Tiempo
    public static void tipoTiempo(String tipoTiempo) throws Exception{
        if(tipoTiempo.isEmpty()){
            throw new Exception("No puede ser vacio");
        }
        String[] unidades = {"s", "min", "h", "d", "a", "ms", "µs"}; // Nos permite validar desde una base, asi evitamos numeros o caracteres especiales
        boolean encontrado = false;
        for(int i = 0; i < unidades.length; i++){
            if(unidades[i].equals(tipoTiempo)){
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            throw new Exception("No se encontro unidad, use una de las unidades mencionadas anteriormente.");
        }
    }

}