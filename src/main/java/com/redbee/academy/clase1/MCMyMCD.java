package com.redbee.academy.clase1;

public class MCMyMCD {


    /**
     * Generar un algoritmo que resuelva el mínimo común múltiplo entre 2 números
     *
     * @param num1
     * @param num2
     * @return
     */
    public static Integer mcm(int num1, int num2) {
        Integer mcd = MCMyMCD.mcd(6, 9);
        Integer result = (num1*num2)/mcd;
        return result;
    }

    /**
     * Generar un algoritmo que resuelva el máximo común divisor entre 2 números
     *
     * @param num1
     * @param num2
     * @return
     */
    public static Integer mcd(int num1, int num2) {
        int resg;//Para no perder b - algoritmo de Euclides
        while (num2 != 0) {
            resg = num2;
            num2 = num1 % num2;
            num1 = resg;
        }
        return num1;
    }
}
