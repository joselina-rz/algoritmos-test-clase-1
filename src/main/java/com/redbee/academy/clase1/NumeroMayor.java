package com.redbee.academy.clase1;

public class NumeroMayor {

    public static Integer resolver(Integer num1, Integer num2) {
        int mayor = 0;
        if (num1 > num2){
            mayor = num1;
        }else {
            mayor = num2;
        }
        return mayor;
    }
}
