package ejercicio1;
import java.util.Scanner;

public class Medida {
    public static Scanner sc = new Scanner(System.in);

    // Unidad con valor y unidad 
    public static void unidadValor(String unidad, double valor) {
        if (Tools.convertirNuevaUnidad(unidad).equals("Longitud")) {
            Tools.categoriaLongitud(unidad, valor); // Desde aqui se llama a la categoria correspondiente
        }
        if (Tools.convertirNuevaUnidad(unidad).equals("Masa")) {
            Tools.categoriaMasa(unidad, valor); // Desde aqui se llama a la categoria correspondiente
        }
        if (Tools.convertirNuevaUnidad(unidad).equals("Temperatura")) {
            Tools.categoriaTemperatura(unidad, valor); // Desde aqui se llama a la categoria correspondiente
        }
        if (Tools.convertirNuevaUnidad(unidad).equals("Volumen")) {
            Tools.categoriaVolumen(unidad, valor); // Desde aqui se llama a la categoria correspondiente
        }
        if (Tools.convertirNuevaUnidad(unidad).equals("Tiempo")) {
            Tools.categoriaTiempo(unidad, valor); // Desde aqui se llama a la categoria correspondiente
        }
    }

    // Unidad por defecto
    public static void unidadPorDefecto(double valor) {
        System.out.println("Le recordamos que solo se permite la conversion entre unidades de la misma categoria ");
        System.out.println("Categorias disponibles: ");
        System.out.println("1. Longitud (km, m, cm, mm, µm, mi, yd, ft, in) ");
        System.out.println("2. Masa (kg, g, mg, lb, ton) ");
        System.out.println("3. Temperatura (C, K, F) ");
        System.out.println("4. Volumen (m3, L, mL, cm3, kL, qt, pt, oz, bbl) ");
        System.out.println("5. Tiempo (s, min, h, d, a, ms, µs) ");
        System.out.println("0. Volver al menu principal ");

        System.out.print("Seleccione la categoria de unidades que desea convertir (1-5): ");
        
        switch (sc.nextLine()) {
            case "1":
                System.out.println(" ");
                Main.unidad = "m"; // Unidad por defecto
                Tools.categoriaLongitud(Main.unidad, valor); // Desde aqui se llama a la categoria correspondiente
                break;
            case "2":
                System.out.println(" ");
                Main.unidad = "kg"; // Unidad por defecto
                Tools.categoriaMasa(Main.unidad, valor);
                break;
            case "3":
                System.out.println(" ");
                Main.unidad = "C"; // Unidad por defecto
                Tools.categoriaTemperatura(Main.unidad, valor); // Desde aqui se llama a la categoria correspondiente
                break;
            case "4":
                System.out.println(" ");
                Main.unidad = "L"; // Unidad por defecto
                Tools.categoriaVolumen(Main.unidad, valor); // Desde aqui se llama a la categoria correspondiente
                break;
            case "5":
                System.out.println(" ");
                Main.unidad = "s"; // Unidad por defecto
                Tools.categoriaTiempo(Main.unidad, valor); // Desde aqui se llama a la categoria correspondiente
                break;
            case "0":
                System.out.println("¡Hasta luego!");
                System.out.println(" ");
                Main.main(null); // Volver al menu principal
                break;
            default:
                System.out.println("Opcion no reconocida, porfavor intentelo de nuevo");
                System.out.println(" ");
                unidadPorDefecto(valor);
        }
    }
}