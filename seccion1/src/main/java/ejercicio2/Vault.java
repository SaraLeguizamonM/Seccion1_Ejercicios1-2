package ejercicio2;

public class Vault {
    private String metodoSeguridad; // Se usaria PIN, BIOMETRICO, LLAVE FISICA
    private Object credencial; // La credencial esperada

    public Vault(String metodoSeguridad, Object credencial) {// Constructor de la clase Vault
        this.metodoSeguridad = metodoSeguridad;
        this.credencial = credencial;
    }

    public Boolean abrir(Object credencial) {// Metodo para abrir la caja fuerte
        Boolean valido = false;

        switch (this.metodoSeguridad) { 
            case "PIN", "LLAVE FISICA": 
                try{
                    if(this.credencial.equals(credencial)) {// Si la credencial coincide
                        valido = true;
                    }
                    Errores.denegar(this.credencial.toString(), credencial.toString());// Verificamos si la credencial es correcta

                }catch (Exception e){
                    System.out.println("Error: " + e.getMessage());
                }

                break;
            case "BIOMETRICO":

                if(this.credencial.equals(credencial.toString().toLowerCase())) {// Simulamos el reconocimiento biometrico
                    valido = true;
                }
                break;
            default:
                System.out.println("Metodo incorrecto. Intentalo nuevamente"); // Metodo de seguridad no reconocido
        }return  valido;
    }
}
