package ejercicio1;

public class Errores {
    // Manejo de errores de cada categoria
    // Longitud
    public static void tipoLongitud(String tipoLongitud) throws Exception{
        if(tipoLongitud.isEmpty()){
            throw new Exception("No puede ser vacio");
        }

        if(!Tools.convertirNuevaUnidad(tipoLongitud).equals("Longitud")){
            throw new Exception("No se encontro esa unidad, use una de las unidades mencionadas anteriormente.");
        }
    }
    // Masa
    public static void tipoMasa(String tipoMasa) throws Exception{
        if(tipoMasa.isEmpty()){
            throw new Exception("No puede ser vacio");
        }
        if(!Tools.convertirNuevaUnidad(tipoMasa).equals("Masa")){
            throw new Exception("No se encontro esa unidad, use una de las unidades mencionadas anteriormente.");
        }
    }
    // Temperatura
    public static void tipoTemperatura(String tipoTemperatura) throws Exception{
        if(tipoTemperatura.isEmpty()){
            throw new Exception("No puede ser vacio");
        }
        if(!Tools.convertirNuevaUnidad(tipoTemperatura).equals("Temperatura")){
            throw new Exception("No se encontro esa unidad, use una de las unidades mencionadas anteriormente.");
        }
    }
    // Volumen
    public static void tipoVolumen(String tipoVolumen) throws Exception{
        if(tipoVolumen.isEmpty()){
            throw new Exception("No puede ser vacio");
        }
        if(!Tools.convertirNuevaUnidad(tipoVolumen).equals("Volumen")){
            throw new Exception("No se encontro esa unidad, use una de las unidades mencionadas anteriormente.");
        }
    }
    // Tiempo
    public static void tipoTiempo(String tipoTiempo) throws Exception{
        if(tipoTiempo.isEmpty()){
            throw new Exception("No puede ser vacio");
        }
        if(!Tools.convertirNuevaUnidad(tipoTiempo).equals("Tiempo")){
            throw new Exception("No se encontro unidad, use una de las unidades mencionadas anteriormente.");
        }
    }

    //Main - control
    public static void controlStrings(String controlString) throws Exception{
        if(Tools.convertirNuevaUnidad(controlString).equals(" ")){
            throw new Exception("Esa opcion no es valida.\n");
        }
    }

}