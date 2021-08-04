package com.redbee.academy.clase1;

public class CamelCase {


    /**
     * Generar un algoritmo que cuente la cantidad de palabras que hay en un texto teniendo en cuenta que está escrito
     * en notación camelCase.
     * <p>
     * Por ejemplo:
     * hoyVoyAlCine tiene 4 palabras:
     * - hoy
     * - Voy
     * - Al
     * - Cine
     *
     * @param
     * @return
     */
    public static Integer resolver(String texto) {
        int cont=1;
        for (int i=0;i<texto.length(); i++){
            if (Character.isUpperCase(texto.charAt(i))) {
                cont++;
            }
        }
        return cont;
    }
}
