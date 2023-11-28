package calculadora;

public class ClaseOperaciones {
    private String expresion;
    
    public ClaseOperaciones(String expresion) {
        this.expresion = expresion;
    }
    public double calcular() {
        return evaluarExpresion(expresion);
    }
    private double evaluarExpresion(String expresion) {
        expresion = expresion.replaceAll("\\s", "");
        
        while (expresion.contains("(")) {
            int idxApertura = expresion.lastIndexOf("(");
            int idxCierre = expresion.indexOf(")", idxApertura);
            
            String subexpresion = expresion.substring(idxApertura+1, idxCierre);
            double resultadoSubexpresion = evaluarExpresion(subexpresion);
            
            expresion = expresion.substring(0, idxApertura) + resultadoSubexpresion + expresion.substring(idxCierre+1);
        }
        
        String[] terminos = expresion.split("\\+");
        double resultado = 0;
        for (String termino : terminos) {
            if (termino.contains("-")) {
                String[] operandos = termino.split("-");
                double resultadoTermino = evaluarTermino(operandos[0]);
                for (int i = 1; i < operandos.length; i++) {
                    resultadoTermino -= evaluarTermino(operandos[i]);
                }
                resultado += resultadoTermino;
            } else {
                resultado += evaluarTermino(termino);
            }
        }
        
        return resultado;
    }
    private double evaluarTermino(String termino) {
        String[] factores = termino.split("\\*");
        double resultado = 1;
        for (String factor : factores) {
            resultado *= evaluarFactor(factor);
        }
        return resultado;
    }
    private double evaluarFactor(String factor) {
        if (factor.contains("/")) {
            String[] operandos = factor.split("/");
            double resultadoFactor = evaluarExpresion(operandos[0]);
            for (int i = 1; i < operandos.length; i++) {
                resultadoFactor /= evaluarExpresion(operandos[i]);
            }
            return resultadoFactor;
        } else {
            return Double.parseDouble(factor);
        }
    }
}
