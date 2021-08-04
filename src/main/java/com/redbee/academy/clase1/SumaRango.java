package com.redbee.academy.clase1;

public class SumaRango {

    /**
     * Generar un algoritmo que sume todos los valores en el rango de num1 y num2 inclusives.
     * <p>
     * En caso que num1 > num2, devolver 0.
     *
     * @param num1
     * @param num2
     * @return
     */
    public static Integer resolver(Integer num1, Integer num2) {
        int result=0; int cont;
        if (num1 > num2){
            result = 0;
        }else{
            cont = num1;
            while(cont <= num2) {
                result = result + cont;
                cont++;
            }
        }
        return result;
    }

    /**
     * Generar un algoritmo que sume todos los valores enteros PARES que se encuentren en el rango de num1 y num2 inclusives.
     * <p>
     * En caso que num1 > num2, devolver 0.
     *
     * @param num1
     * @param num2
     * @return
     */
    public static Integer resolverPares(Integer num1, Integer num2) {
        int result=0; int cont;
        if (num1 > num2){
            result = 0;
        }else{
            cont = num1;
            while(cont <= num2) {
                if ((cont % 2) == 0){
                    result = result + cont;
                }
                cont++;
            }
        }
        return result;
    }

    /**
     * Generar un algoritmo que sume todos los valores enteros IMPARES que se encuentren en el rango de num1 y num2 inclusives.
     * <p>
     * En caso que num1 > num2, devolver 0.
     *
     * @param num1
     * @param num2
     * @return
     */
    public static Integer resolverImpares(Integer num1, Integer num2) {
        int result=0; int cont;
        if (num1 > num2){
            result = 0;
        }else{
            cont = num1;
            while(cont <= num2) {
                if ((cont%2) != 0){
                    result = result + cont;
                }
                cont++;
            }
        }
        return result;
    }
}
