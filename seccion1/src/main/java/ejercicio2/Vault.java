package ejercicio2;

public class Vault {
    private String metodoSeguridad; // Se usaria PIN, BIOMETRICO, LLAVE FISICA
    private Object credencial; // La credencial esperada

    public Vault(String metodoSeguridad, Object credencial) {
        this.metodoSeguridad = metodoSeguridad;
        this.credencial = credencial;
    }

    public Boolean abrir(Object credencial) {
        Boolean valido = false;

        switch (this.metodoSeguridad) {
            case "PIN", "LLAVE FISICA":
                if(this.credencial.equals(credencial)) {
                    valido = true;
                }
                break;
            case "BIOMETRICO":

                if(this.credencial.equals(credencial.toString().toLowerCase())) {
                    valido = true;
                }
                break;
            default:
                System.out.println("Metodo incorrecto. Intentalo nuevamente");
        }return  valido;
    }
}
