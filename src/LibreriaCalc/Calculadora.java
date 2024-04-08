package LibreriaCalc;

import javax.swing.*;

public class Calculadora {
    public final static int SUMA=1;
    public final static int RESTA=2;
    public final static int MULTIPLICACION=3;
    public final static int DIVISION=4;
    public final static int RAIZ=5;
    /**
     *
     * @param num1 Primer numero con el que se va a realizar la operación
     * @param num2 Segundo número para la operación
     * @param op  operacion que se va a realizar dependiendo del numero que se meta
     * @return el resultado de la operacion o null en caso de error
     */
    public static Float calculadora(float num1,float num2,Integer op) {
        Float resultado = 0.0f;
        switch (op) {
            case SUMA:
                resultado = num1 + num2;
                break;
            case RESTA:
                resultado = num1 - num2;
                break;
            case MULTIPLICACION:
                resultado = num1 * num2;
                break;
            case DIVISION:
                try {
                    resultado = num1 / num2;
                }catch (ArithmeticException e){
                    JOptionPane.showMessageDialog(null,"No se puede dividir por cero");
                }finally{
                    break;
                }
            case RAIZ:
                float indice = num2;
                if (indice == 2)        resultado = (float) (Math.sqrt(num1));
                else if (indice == 3)   resultado = (float) (Math.cbrt(num1));
                else                    resultado = null;
            default:
                resultado=null;
        }
        return resultado;
    }
}