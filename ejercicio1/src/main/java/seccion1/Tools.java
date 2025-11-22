package seccion1;
import java.util.Scanner;

public class Tools {
    public static Scanner sc = new Scanner(System.in);

    // Categorias de Unidades
    public static void categoriaLongitud(String unidad, double valor) {
        System.out.println("A que tipo de unidad desea convertir?");

        boolean longitudValida = false;
        while (!longitudValida) {
            try {
                System.out.println("Se le recuerda al usuario que solo esta permitido: km, m, cm, mm, µm, mi, yd, ft, in");
                String tipo = sc.nextLine().trim(); // Elimina espacios en blanco al inicio y al final de la cadena.
                tipo = tipo.toLowerCase(); // Para que no haya problemas con las mayusculas
                Errores.tipoLongitud(tipo); // Verifica con el metodo de control de errores
                convertirEnumUnidad(tipo, String.valueOf(valor));
                System.out.println(" ");
                longitudValida = true;
            }catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
    public static void categoriaMasa(String unidad, double valor) {
        System.out.println("A que tipo de unidad desea convertir?");

        boolean masaValida = false;
        while (!masaValida) {
            try {
                System.out.println("Se le recuerda al usuario que solo esta permitido: kg, g, mg, lb, ton");
                String tipo = sc.nextLine().trim(); // Elimina espacios en blanco al inicio y al final de la cadena.
                tipo = tipo.toLowerCase(); // Para que no haya problemas con las mayusculas
                Errores.tipoMasa(tipo); // Verifica con el metodo de control de errores
                convertirEnumUnidad(tipo, String.valueOf(valor));
                System.out.println(" ");
                masaValida = true;
            }catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }

    }
    public static void categoriaTemperatura(String unidad, double valor) {
        System.out.println("A que tipo de unidad desea convertir?");

        boolean temperaturaValida = false;
        while (!temperaturaValida) {
            try {
                System.out.println("Se le recuerda al usuario que solo esta permitido: C, K, F");
                String tipo = sc.nextLine().trim(); // Elimina espacios en blanco al inicio y al final de la cadena.
                tipo = tipo.toUpperCase(); // Para que no haya problemas con las mayusculas
                Errores.tipoTemperatura(tipo); // Verifica con el metodo de control de errores
                convertirEnumUnidad(tipo, String.valueOf(valor));
                System.out.println(" ");
                temperaturaValida = true;
            }catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }

    }
    public static void categoriaVolumen(String unidad, double valor) {
        System.out.println("A que tipo de unidad desea convertir?");

        boolean volumenValido = false;
        while (!volumenValido) {
            try {
                System.out.println("Se le recuerda al usuario que solo esta permitido: m3, L, mL, cm3, kL, qt, pt, oz, bbl");
                String tipo = sc.nextLine().trim(); // Elimina espacios en blanco al inicio y al final de la cadena.
                Errores.tipoVolumen(tipo); // Verifica con el metodo de control de errores
                convertirEnumUnidad(tipo, String.valueOf(valor));
                System.out.println(" ");
                volumenValido = true;
            }catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }

    }
    public static void categoriaTiempo(String unidad, double valor) {
        System.out.println("A que tipo de unidad desea convertir?");
        boolean tiempoValido = false;
        while (!tiempoValido) {
            try {
                System.out.println("Se le recuerda al usuario que solo esta permitido: s, min, h, d, a, ms, µs");
                String tipo = sc.nextLine().trim(); // Elimina espacios en blanco al inicio y al final de la cadena.
                tipo = tipo.toLowerCase(); // Para que no haya problemas con las mayusculas
                Errores.tipoTiempo(tipo); // Verifica con el metodo de control de errores
                convertirEnumUnidad(tipo, String.valueOf(valor));
                System.out.println(" ");
                tiempoValido = true;
            }catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }

    }

    // Convertir

    public static void convertirEnumUnidad(String unidad, String enumUnidad) {
        String tipo = convertirNuevaUnidad(unidad);
        if (tipo.equals("Longitud")) {
            convertirLongitud(unidad, Double.parseDouble(enumUnidad));
        }
        if (tipo.equals("Masa")) {
            convertirMasa(unidad, Double.parseDouble(enumUnidad));
        }
        if (tipo.equals("Temperatura")) {
            convertirTemperatura(unidad, Double.parseDouble(enumUnidad));
        }
        if (tipo.equals("Volumen")) {
            convertirVolumen(unidad, Double.parseDouble(enumUnidad));
        }
        if (tipo.equals("Tiempo")) {
            convertirTiempo(unidad, Double.parseDouble(enumUnidad));

        }

    }

    public static void convertirLongitud(String unidad, double longitud) {
        // Pasar a metros
        if (Main.unidad.equals("km")) {
            longitud = longitud * 1000;
        }
        if (Main.unidad.equals("cm")) {
            longitud = longitud * 0.01;
        }
        if (Main.unidad.equals("mm")) {
            longitud = longitud * 0.001;
        }
        if (Main.unidad.equals("µm")) {
            longitud = longitud * 0.000001;
        }
        if (Main.unidad.equals("mi")) {
            longitud = longitud * 1609.344;
        }
        if (Main.unidad.equals("yd")) {
            longitud = longitud * 0.9144;
        }
        if (Main.unidad.equals("ft")) {
            longitud = longitud * 0.3048;
        }
        if (Main.unidad.equals("in")) {
            longitud = longitud * 0.0254;
        }

        // Pasar de metros a la unidad que requerimos
        if (unidad.equals("km")) {
            longitud = longitud / 1000;
        }
        if (unidad.equals("cm")) {
            longitud = longitud * 100;
        }
        if (unidad.equals("mm")) {
            longitud = longitud * 1000;
        }
        if (unidad.equals("µm")) {
            longitud = longitud * 1000000;
        }
        if (unidad.equals("mi")) {
            longitud = longitud / 1609.344;
        }
        if (unidad.equals("yd")) {
            longitud = longitud / 0.9144;
        }
        if (unidad.equals("ft")) {
            longitud = longitud / 0.3048;
        }
        if (unidad.equals("in")) {
            longitud = longitud / 0.0254;
        }
        System.out.println( "Tu resultado es: " + longitud + unidad);
    }
    public static void convertirMasa(String unidad, double masa) {
        // Pasar a kilogramos
        if (Main.unidad.equals("g")) {
            masa = masa * 0.001;
        }
        if (Main.unidad.equals("mg")) {
            masa = masa * 0.000001;
        }
        if (Main.unidad.equals("lb")) {
            masa = masa * 0.45359237;
        }
        if (Main.unidad.equals("ton ")) {
            masa = masa * 907.18474;
        }

        // Pasar de kilogramos a la medida que requerimos
        if (unidad.equals("g")) {
            masa = masa * 1000;
        }
        if (unidad.equals("mg")) {
            masa = masa * 1000000;
        }
        if (unidad.equals("lb")) {
            masa = masa / 0.45359237;
        }
        if (unidad.equals("ton ")) {
            masa = masa / 907.18474;
        }
        System.out.println( "Tu resultado es: " + masa + unidad);
    }
    public static void convertirTemperatura(String unidad, double temperatura) {
        if (Main.unidad.equals("C")) {

            if (unidad.equals("K")) {
                temperatura = temperatura + 273.15;
            }
            if (unidad.equals("F")) {
                temperatura = (temperatura * 1.8) + 32;
            }
        }
        if (Main.unidad.equals("K")) {
            if (unidad.equals("C")) {
                temperatura = temperatura - 273.15;
            }
            if (unidad.equals("F")) {
                temperatura = (temperatura -  273.15) * 1.8 + 32;
            }
        }
        if (Main.unidad.equals("F")) {
            if (unidad.equals("C")) {
                temperatura = (temperatura - 32) * 1.8;
            }
            if (unidad.equals("K")) {
                temperatura = (temperatura - 32) * 1.8 + 273.15;
            }
        }
        System.out.println( "Tu resultado es: " + temperatura + unidad);

    }
    public static void convertirVolumen(String unidad, double volumen) {
        // Pasar a litros
        if (Main.unidad.equals("m3")) {
            volumen = volumen * 1000;
        }
        if (Main.unidad.equals("mL")) {
            volumen = volumen * 0.001;
        }
        if (Main.unidad.equals("cm3")) {
            volumen = volumen * 0.001;
        }
        if (Main.unidad.equals("kL")) {
            volumen = volumen * 1000;
        }
        if (Main.unidad.equals("qt")) {
            volumen = volumen * 0.946353;
        }
        if (Main.unidad.equals("pt")) {
            volumen = volumen * 0.473176;
        }
        if (Main.unidad.equals("oz")) {
            volumen = volumen * 0.0295735295625;
        }
        if (Main.unidad.equals("bbl")) {
            volumen = volumen * 158.987294928;
        }

        // Pasar de kilogramos a la medida que requerimos
        if (unidad.equals("m3")) {
            volumen = volumen / 1000;
        }
        if (unidad.equals("mL")) {
            volumen = volumen * 1000;
        }
        if (unidad.equals("cm3")) {
            volumen = volumen * 1000;
        }
        if (unidad.equals("kL")) {
            volumen = volumen / 1000;
        }
        if (unidad.equals("qt")) {
            volumen = volumen / 0.946353;
        }
        if (unidad.equals("pt")) {
            volumen = volumen / 0.473176;
        }
        if (unidad.equals("oz")) {
            volumen = volumen / 0.0295735295625;
        }
        if (unidad.equals("bbl")) {
            volumen = volumen / 158.987294928;
        }
        System.out.println( "Tu resultado es: " + volumen + unidad);
    }
    public static void convertirTiempo(String unidad, double tiempo) {
        // Pasar a Segundos
        if (Main.unidad.equals("min")) {
            tiempo = tiempo * 60;
        }
        if (Main.unidad.equals("h")) {
            tiempo = tiempo * 3600;
        }
        if (Main.unidad.equals("d")) {
            tiempo = tiempo * 86400;
        }
        if (Main.unidad.equals("a")) {
            tiempo = tiempo * 31536000;
        }
        if (Main.unidad.equals("ms")) {
            tiempo = tiempo * 0.001;
        }
        if (Main.unidad.equals("µs")) {
            tiempo = tiempo * 0.000001;
        }

        // Pasar de segundos a la medida que requerimos
        if (unidad.equals("min")) {
            tiempo = tiempo / 60;
        }
        if (unidad.equals("h")) {
            tiempo = tiempo / 3600;
        }
        if (unidad.equals("d")) {
            tiempo = tiempo / 86400;
        }
        if (unidad.equals("a")) {
            tiempo = tiempo / 31536000;
        }
        if (unidad.equals("ms")) {
            tiempo = tiempo * 1000;
        }
        if (unidad.equals("µs")) {
            tiempo = tiempo * 1000000;
        }
        System.out.println( "Tu resultado es: " + tiempo + unidad);
    }



    // Filtro
    public static String convertirNuevaUnidad(String nuevaUnidad) {
        String identificadorTipo = " ";
        String[] unidadlongitud = {"km", "m", "cm", "mm", "µm", "mi", "yd", "ft", "in"}; // Nos permite validar desde una base, asi evitamos numeros o caracteres especiales
        for(int i = 0; i < unidadlongitud.length; i++){
            if(unidadlongitud[i].equals(nuevaUnidad)){
                identificadorTipo = "Longitud";

                break;
            }
        }
        String[] unidadMasa = {"kg", "g", "mg", "lb", "ton"}; // Nos permite validar desde una base, asi evitamos numeros o caracteres especiales
        for(int i = 0; i < unidadMasa.length; i++){
            if(unidadMasa[i].equals(nuevaUnidad)){
                identificadorTipo = "Masa";
                break;
            }
        }
        String[] unidadTemperatura = {"C", "K", "F"}; // Nos permite validar desde una base, asi evitamos numeros o caracteres especiales
        for(int i = 0; i < unidadTemperatura.length; i++){
            if(unidadTemperatura[i].equals(nuevaUnidad)){
                identificadorTipo = "Temperatura";
                break;
            }
        }
        String[] unidadVolumen = {"m3", "L", "mL", "cm3", "kL", "qt", "pt", "oz", "bbl"}; // Nos permite validar desde una base, asi evitamos numeros o caracteres especiales
        for(int i = 0; i < unidadVolumen.length; i++){
            if(unidadVolumen[i].equals(nuevaUnidad)){
                identificadorTipo  = "Volumen";
                break;
            }
        }
        String[] unidadTiempo = {"s", "min", "h", "d", "a", "ms", "µs"}; // Nos permite validar desde una base, asi evitamos numeros o caracteres especiales
        for(int i = 0; i < unidadTiempo.length; i++){
            if(unidadTiempo[i].equals(nuevaUnidad)){
                identificadorTipo = "Tiempo";
                break;
            }
        } return identificadorTipo;
    }
}

