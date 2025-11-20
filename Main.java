import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do { 
            System.out.println("Bienvenido al Convertidor de Unidades Avanzadas ");
            System.out.println("Le recordamos que solo se permite la conversion entre unidades de la misma categoria ");
            System.out.println("Categorias disponibles: ");
            System.out.println("1. Longitud (km, m, cm, mm, µm, mi, yd, ft, in) ");
            System.out.println("2. Masa (kg, g, mg, t, lb, oz, ton) ");
            System.out.println("3. Temperatura (C, K, F, R) ");
            System.out.println("4. Volumen (m3, L, mL, cm3, kL, gal, qt, pt, oz, bbl) ");
            System.out.println("5. Tiempo (s, min, h, d, a, ms, µs) ");
            System.out.println("0. Salir ");
        
            System.out.print("Seleccione la categoria de unidades que desea convertir (1-5): ");
            switch (sc.nextLine()) {
                case "1":
                    
                    break;
                case "2":   
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "0":
                    System.out.println("Gracias por usar el Convertidor de Unidades Avanzadas. ¡Hasta luego!");
                    sc.close();
                    return;
                default:
                    
            }

        } while (true);
    }
}