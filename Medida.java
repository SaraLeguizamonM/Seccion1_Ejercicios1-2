import java.util.Scanner;

public class Medida {

    public static void unidadPorDefecto(Scanner sc) {
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
                Tools.categoriaLongitud(sc);
                sc.nextLine();
                break;
            case "2":
                System.out.println(" ");
                Tools.categoriaMasa(sc);
                sc.nextLine();
                break;
            case "3":
                System.out.println(" ");
                Tools.categoriaTemperatura(sc);
                sc.nextLine();
                break;
            case "4":
                System.out.println(" ");
                Tools.categoriaVolumen(sc);
                sc.nextLine();
                break;
            case "5":
                System.out.println(" ");
                Tools.categoriaTiempo(sc);
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
        }
    }

    public static void unidadValor(Scanner sc) {
    }




}