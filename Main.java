import java.util.Scanner;

public class Main {
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
                    Medida.unidadValor(sc);
                    sc.nextLine();
                    break;
                case 2:
                    System.out.println(" ");
                    Medida.unidadPorDefecto(sc);
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