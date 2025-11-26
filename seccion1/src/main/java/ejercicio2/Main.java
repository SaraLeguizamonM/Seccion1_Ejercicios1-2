package ejercicio2;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        ArrayList<Persona> personas = new ArrayList<>();

        String usuario;
        String contraseña;

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
                    Boolean encontrado = false;
                    System.out.println("Ingrese su nombre de usuario: ");
                    usuario = sc.nextLine();
                    System.out.println("Ingrese su contraseña: ");
                    contraseña = sc.nextLine();

                    for(Persona persona : personas){
                        if(persona.getUser().equals(usuario) && persona.getPassword().equals(contraseña)){
                            System.out.println("¡Bienvenido " + usuario + "!");
                            System.out.println("Recuerda que para ingresar al vault es necesario usar \nla credencial correspondiente al metodo de seguridad elegido");

                            for(int i = 3; i >= 0; i--){
                                if(persona.getvault().abrir(sc.nextLine())){
                                    System.out.println("Bienvenido a su caja fuerte:D");
                                    encontrado = true;
                                    break;
                                }else{
                                    System.out.println("Te quedan: " + i + "de intentos.");
                                }
                            }
                            if(!encontrado){
                                System.out.println("AlertaDeManipulacionException");
                            }
                        }
                    }

                    break;
                case "2":
                    String metodoDeSeguridad = "";
                    String credencial = "";
                    do{
                        System.out.println("Que usuario desea tener?");
                        usuario = sc.nextLine();
                        System.out.println("Cual es su contraseña?");
                        contraseña = sc.nextLine();

                        System.out.println("¿Qué tipo de seguridad le gustaria usar para su caja fuerte?");
                        System.out.println("Puedes usar:");
                        System.out.println("1. PIN.");
                        System.out.println("2. BIOMÉTRICO.");
                        System.out.println("3. LLAVE FISICA. ");
                        opcionInterna = sc.nextLine();

                        switch (opcionInterna){
                            case "1":
                                metodoDeSeguridad = "PIN";

                                boolean pinValido = false;
                                while(!pinValido){
                                    try{
                                        System.out.println("¿Que contraseña quieres usar? le recordamos que minimo debes usar 4 digitos.");
                                        credencial = sc.nextLine();
                                        Errores.controlPIN(credencial);
                                        pinValido = true;

                                    }catch (Exception e){
                                        System.out.println("Error: " + e.getMessage());
                                    }
                                }
                                break;
                            case "2":
                                metodoDeSeguridad = "BIOMETRICO";
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
                                            System.out.println("Recuerda que al iniciar sesion sera necesario que escribas (activar camara)\npara que el proceso sea autoamtico");
                                            credencial = "activar camara";
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
                                metodoDeSeguridad = "LLAVE FISICA";
                                System.out.println("Se te va a asignar una llave de acceso");
                                credencial = String.valueOf(rand.nextInt(1000,9999));
                                System.out.println("Se a generado correctamente tu llave de acceso:" + credencial);
                                break;
                            default:
                                System.out.println("Opcion no reconocida, porfavor intentelo de nuevo");
                                opcionExterna = "2";
                        }
                    } while(!opcionInterna.equals("1") && !opcionInterna.equals("2") && !opcionInterna.equals("3"));
                    personas.add(new Persona(usuario, contraseña, new Vault(metodoDeSeguridad, credencial)));
                    System.out.println(personas);
                    break;
                case "3":
                    opcionExterna = "0";
                    break;
            }
        }while(!opcionExterna.equals("0") );
    }
}