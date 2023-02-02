
package utilidades;


public class UtilidadesNumericas {
    public static boolean esUnNumero( String  dato){
        boolean retorno= true;
        try {
            Float.parseFloat(dato);
        }
        catch (NumberFormatException e){
            retorno = false;
        }
        return retorno;
    }


public static boolean esUnNumeroEntero( String  dato){
        boolean retorno= true;
        try {
            Integer.parseInt(dato);
        }
        catch (NumberFormatException e){
            retorno = false;
        }
        return retorno;
    }

    
}
