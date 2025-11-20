import java.util.Scanner;

public class Medida {
    public static Scanner sc = new Scanner(System.in);

    public static void unidadPorDefecto(double valor) {
        System.out.println("Le recordamos que solo se permite la conversion entre unidades de la misma categoria ");
        System.out.println("Categorias disponibles: ");
        System.out.println("1. Longitud (km, m, cm, mm, µm, mi, yd, ft, in) ");
        System.out.println("2. Masa (kg, g, mg, t, lb, oz, ton) ");
        System.out.println("3. Temperatura (C, K, F, R) ");
        System.out.println("4. Volumen (m3, L, mL, cm3, kL, gal, qt, pt, oz, bbl) ");
        System.out.println("5. Tiempo (s, min, h, d, a, ms, µs) ");
        System.out.println("0. Volver al menu principal ");

        System.out.print("Seleccione la categoria de unidades que desea convertir (1-5): ");

        switch (sc.nextLine()) {
            case "1":
                System.out.println(" ");
                Tools.categoriaLongitud("m", valor);

                break;
            case "2":
                System.out.println(" ");
                Tools.categoriaMasa("kg", valor);

                break;
            case "3":
                System.out.println(" ");
                Tools.categoriaTemperatura("C", valor);

                break;
            case "4":
                System.out.println(" ");
                Tools.categoriaVolumen("L", valor);
                sc.nextLine();
                break;
            case "5":
                System.out.println(" ");
                Tools.categoriaTiempo("s", valor);
                sc.nextLine();
                break;
            case "0":
                System.out.println("Gracias por usar el Convertidor de Unidades Avanzadas. ¡Hasta luego!");
                System.out.println(" ");
                Main.main(null);
                break;
            default:
                System.out.println("Opcion no reconocida, porfavor intentelo de nuevo");
                System.out.println(" ");
                unidadPorDefecto(valor);
        }
    }

    public static void unidadValor(String unidad, double valor) {
        String[] unidadlongitud = {"km", "m", "cm", "mm", "µm", "mi", "yd", "ft", "in"}; // Nos permite validar desde una base, asi evitamos numeros o caracteres especiales
        for(int i = 0; i < unidadlongitud.length; i++){
            if(unidadlongitud[i].equals(unidad)){
                Tools.categoriaLongitud(unidad, valor);
                break;
            }
        }
        String[] unidadMasa = {"kg", "g", "mg", "t", "lb", "oz", "ton"}; // Nos permite validar desde una base, asi evitamos numeros o caracteres especiales
        for(int i = 0; i < unidadMasa.length; i++){
            if(unidadMasa[i].equals(unidad)){
                Tools.categoriaMasa(unidad, valor);
                break;
            }
        }
        String[] unidadTemperatura = {"C", "K", "F", "R"}; // Nos permite validar desde una base, asi evitamos numeros o caracteres especiales
        for(int i = 0; i < unidadTemperatura.length; i++){
            if(unidadTemperatura[i].equals(unidad)){
                Tools.categoriaTemperatura(unidad, valor);
                break;
            }
        }
        String[] unidadVolumen = {"m3", "L", "mL", "cm3", "kL", "gal", "qt", "pt", "oz", "bbl"}; // Nos permite validar desde una base, asi evitamos numeros o caracteres especiales
        for(int i = 0; i < unidadVolumen.length; i++){
            if(unidadVolumen[i].equals(unidad)){
                Tools.categoriaVolumen(unidad, valor);
                break;
            }
        }
        String[] unidadTiempo = {"s", "min", "h", "d", "a", "ms", "µs"}; // Nos permite validar desde una base, asi evitamos numeros o caracteres especiales
        for(int i = 0; i < unidadTiempo.length; i++){
            if(unidadTiempo[i].equals(unidad)){
                Tools.categoriaTiempo(unidad, valor);
                break;
            }
        }
    }




}