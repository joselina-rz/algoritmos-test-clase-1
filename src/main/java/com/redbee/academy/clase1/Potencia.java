package com.redbee.academy.clase1;

public class Potencia {

    /**
     * Generar un algoritmo para elevar un número (base) a una potencia dada
     *
     * @param base
     * @param potencia
     * @return
     */
    public static Integer resolver(Integer base, Integer potencia) {
        int result = base;
        if (potencia==0){
            result=1;
        }else {
            for (int i=1; i < potencia; i++){
                result = result * base;
            }
        }

        return result;
    }
}
