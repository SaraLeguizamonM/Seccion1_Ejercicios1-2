package ejercicio2;

public class Errores {
    public static void denegar(String credencialGuar, String credencialEnv) throws Exception { // Metodo para denegar el acceso si la credencial no es correcta
        if(!credencialGuar.equals(credencialEnv)){// Si las credenciales no coinciden
            throw new Exception("AccesoDenegadoException");
        }
    }
    public static void controlPIN(String credencial)  throws Exception {// Metodo para controlar que el pin sea valido
        if (credencial.trim().isEmpty()){// Si el pin esta vacio
            throw new Exception("El pin no puede estar vacio");
        } else if (credencial.length() <4) {// Si el pin es menor a 4 digitos
            throw new Exception("El pin no puede ser menor de 4 digitos");
        }
    }
}
