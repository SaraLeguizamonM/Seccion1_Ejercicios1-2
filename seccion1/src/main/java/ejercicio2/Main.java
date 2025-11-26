package ejercicio2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de caja fuerte");

        String opcionInterna = " ";
        String opcionExterna = " ";
        do{
            System.out.println("Que desea hacer?");
            System.out.println("1. Iniciar sesion");
            System.out.println("2. Crear cuenta");
            System.out.println("3. Salir");
            opcionExterna = sc.nextLine();
            switch(opcionExterna){
                case "1":
                    break;
                case "2":
                    System.out.println("Que usuario desea tener?");
                    String usuario = sc.nextLine();
                    System.out.println("Cual es su contraseña?");
                    String contraseña = sc.nextLine();

                    System.out.println("¿Qué tipo de seguridad le gustaria usar para su caja fuerte?");
                    System.out.println("Puedes usar:");
                    System.out.println("1. PIN.");
                    System.out.println("2. BIOMÉTRICO.");
                    System.out.println("3. LLAVE FISICA. ");
                    opcionInterna = sc.nextLine();

                    String credencial;

                    switch (opcionInterna){
                        case "1":
                            System.out.println("¿Que contraseña quieres usar? le recordamos que minimo debes usar 4 digitos.");
                            credencial = sc.nextLine();
                            Vault vault1 = new Vault("PIN", credencial);

                            break;
                        case "2":
                            String permisos = " ";
                            do{
                                System.out.println("En estos momentos requerimos permisos de la camara para indentificarlo");
                                System.out.println("1. Permitir");
                                System.out.println("2. Denegar");
                                permisos = sc.nextLine();
                                switch (permisos){
                                    case "1":
                                        System.out.println("Encendidendo camara...");
                                        System.out.println(" ");
                                        System.out.println("Rostro guardado:)");
                                        credencial = "1";
                                        Vault vault2 = new Vault("BIOMETRICO", credencial);
                                        break;

                                    case "2":
                                        System.out.println("⚠ Permiso negado... Se te redirigira al menu.");
                                        break;
                                    default:
                                        System.out.println("Opcion no reconocida, porfavor intentelo de nuevo");
                                }
                            }while(!permisos.equals("1") && !permisos.equals("2"));
                            break;

                        case "3":
                            System.out.println("Se te va a asignar una llave de acceso");
                            break;
                        default:
                            System.out.println("Opcion no reconocida, porfavor intentelo de nuevo");
                            opcionInterna = "1";
                    }
                    break;
                case "3":
                    break;
            }
        }while(!opcionExterna.equals("0") );
    }
}