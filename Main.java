import java.util.Scanner;


public class Main {
    public static String unidad;
    public static double valor;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Bienvenido al Convertidor de Unidades Avanzadas ");
            System.out.println("Elige la opcion que desees ejecutar: ");
            System.out.println("1. Ingresar el valor y la unidad");
            System.out.println("2. Ingresar solamente el valor");
            System.out.println("0. Salir");
            switch(sc.nextInt()) {
                case 1:
                    System.out.println(" ");
                    System.out.println("Ingresa una unidad que desea convertir: ");
                    sc.nextLine();
                    unidad = sc.nextLine();
                    System.out.println("Ahora ingresa su valor: ");
                    valor = sc.nextInt();
                    Medida.unidadValor(unidad,valor);

                    break;
                case 2:
                    System.out.println(" ");
                    Medida.unidadPorDefecto(valor); //
                    sc.nextLine();
                    break;
                case 0:
                    sc.close();
                    return;
                default:
                    System.out.println("Opcion no reconocida, porfavor intentelo de nuevo");
                    System.out.println(" ");
            }
        }while (true);
    }
}