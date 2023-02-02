
package utilidades;

import javax.swing.JTextField;


public class UtilidadesDeCadenas {
    public static boolean esUnNombre(String dato){
        boolean retorno = true;
        if (!dato.isEmpty()){
            for (int i=0; i < dato.length();i++){
                char elcaracter = dato.charAt(i);
                if (esInvalido(elcaracter, 1))
                {
                    retorno = false;
                    break;
                }
                
            }
        }
        return retorno;
    }
    
    public static boolean esInvalido (char c, int tpatron){
        boolean retorno = true;
        char patron1 [];
        
        
        patron1 = new char [4];
        patron1 [0]= 'ñ'; 
        patron1 [1]= 'Ñ';
        patron1 [2]= ' ';
        patron1 [3]= 'ˊ';
        
        if (c >= 'a' && c <= 'z' ){
            retorno = false;
        }
        else {
                if (c >= 'A' && c <= 'Z' ){
                    retorno = false;
            }
                else {
                    for (char a : patron1){
                        if (c == a){
                            retorno = false;
                        }
                    }
                }  
                
        } 
        
        return retorno;
    }

    public void esUnNombre(JTextField txtNombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
