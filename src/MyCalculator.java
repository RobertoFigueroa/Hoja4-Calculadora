/**
 * Esta clase permite crear una calculadora para realizar operaciones aritemticas básicas.
 * Esta clase implementa la iterfaz Calculadora
 * @author Roberto Figueroa , Steven Chan
 *
 * */
public class MyCalculator implements Calculator {

    /**
     * Calcula para dos numeros cualquier operación aritméitca simple definida por un signo de operación
     * @param num1 Primer numero entero
     * @param num2 Segundo numero entero
     * @param op Signo para la operación
     * @return Brinda la operación dada entro los dos numero y el signo aritémtico correspondiente
     * */
    @Override
    public int calculate(int num1, int num2, String op){
        if(op.equals("+")){
            return num1+num2;
        }
        else if(op.equals("-")){
            return num2-num1;
        }
        else if(op.equals("*")){
            return num1*num2;
        }
        else {
            return num2/num1;
        }
    }
}