package ejercicio1;
import java.util.Scanner;

public class Main {
    public static String unidad;
    public static String valor;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al Convertidor de Unidades Avanzadas ");
        System.out.println("Elige la opcion que desees ejecutar: ");
        String opcion = " ";
        do {
            System.out.println("1. Ingresar el valor y la unidad");
            System.out.println("2. Ingresar solamente el valor");
            System.out.println("0. Salir");
            System.out.println(" ");
            opcion = sc.nextLine();
            switch ((opcion)) {
                case "1":
                    boolean stringValido = false;
                    while (!stringValido) {
                        try {
                            System.out.println("Ingresa una unidad que desea convertir: ");
                            unidad = sc.nextLine().trim();
                            Errores.controlStrings(unidad);
                            System.out.println(" ");
                            stringValido = true;

                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                    boolean doubleValido = false;
                    while (!doubleValido) {
                        try{
                            System.out.println("Ahora ingresa su valor: ");
                            valor = sc.nextLine().trim();
                            Medida.unidadValor(unidad, Double.parseDouble(valor));
                            System.out.println(" ");
                            doubleValido = true;

                        }catch (Exception e){
                            System.out.println("Error: Esa opcion no es valida.");
                        }
                    }
                    break;
                case "2":
                    System.out.println(" ");
                    System.out.println("Ingrese su valor: ");
                    valor = sc.nextLine();
                    Medida.unidadPorDefecto(Double.parseDouble(valor));
                    break;
                case "0":
                    System.out.println("Gracias por usar el Convertidor de Unidades Avanzadas. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion no reconocida, porfavor intentelo de nuevo");
                    opcion = "1";
            }
        } while (!opcion.equals("0") );
    }
}