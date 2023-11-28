package calculadora;

import java.util.Stack;

public class ClaseVerificacion {
    private boolean VerificarNumero(String operacion){
        boolean bandera=true;
        int i, cont=0;
        char m;
        for(i=0; i<operacion.length(); i++){
            m=operacion.charAt(i);
            if(m=='.'){cont++;}
            if(cont>1 ||operacion.charAt(0)=='.'||(m!='0'&&m!='1'&&m!='2'&&m!='3'&&m!='4'&&m!='5'&&m!='6'&&m!='7'
                    &&m!='8'&&m!='9'&&m!='.'&&m!='('&&m!=')'&&m!='+'&&m!='-'&&m!='/'&&m!='*')){
                bandera=false;
                break;
            }
        }
        return bandera;
    }
    private boolean verificarParentesis(String cadena) {
        Stack<Character> pila = new Stack<Character>();
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter == '(') {
                pila.push(caracter);
            } 
            else if (caracter == ')') {
                if (pila.empty()) {
                    return false;
                } else {
                    pila.pop();
                }
            }
        }
        return pila.empty();
    }
    public boolean Verificacion(String operacion){
        return(VerificarNumero(operacion)==verificarParentesis(operacion));
    }
}
