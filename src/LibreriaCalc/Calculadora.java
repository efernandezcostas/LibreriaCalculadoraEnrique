package LibreriaCalc;

import javax.swing.*;

public class Calculadora {
    final static int SUMA=1;
    final static int RESTA=2;
    final static int MULTIPLICACION=3;
    final static int DIVISION=4;
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
            default:
                resultado=null;
        }
        return resultado;
    }
}