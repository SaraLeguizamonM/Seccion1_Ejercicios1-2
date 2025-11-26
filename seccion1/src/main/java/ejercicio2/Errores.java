package ejercicio2;

public class Errores {
    public static void denegar(String credencialGuar, String credencialEnv) throws Exception {
        if(!credencialGuar.equals(credencialEnv)){
            throw new Exception("AccesoDenegadoException");
        }
    }
    public static void controlPIN(String credencial)  throws Exception {
        if (credencial.trim().isEmpty()){
            throw new Exception("El pin no puede estar vacio");
        } else if (credencial.length() <4) {
            throw new Exception("El pin no puede ser menor de 4 digitos");
        }
    }
}
