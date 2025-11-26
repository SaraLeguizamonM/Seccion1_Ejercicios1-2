package ejercicio2;

public class Persona {
    private final String user; 
    private final String password;
    private final Vault vault;

    public Persona(String user, String password, Vault vault) { // Constructor de la clase Persona (creacion del usuario:D)
        this.user = user;
        this.password = password;
        this.vault = vault;
    }

    public Vault getvault() { // Nos permite obtener la caja fuerte de la persona
        return this.vault;
    }

    public String getUser() { // Nos permite obtener el nombre de usuario
        return user;
    }
    public String getPassword() { // Nos permite obtener la contraseña
        return password;
    }
}
