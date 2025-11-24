package ejercicio2;

public class Persona {
    private final String user;
    private final String password;
    private final Vault vault;

    public Persona(String user, String password, Vault vault) { // Creacion del usuario:D
        this.user = user;
        this.password = password;
        this.vault = vault;
    }

    public Vault getvault() {
        return this.vault;
    }
}
