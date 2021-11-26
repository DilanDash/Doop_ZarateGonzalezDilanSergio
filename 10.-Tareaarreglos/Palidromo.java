
/*
Elabora un programa que nos ayude a saber
si un numero es palidromo
*/

import java.util.Scanner;

public class palidromo{
    public static void main(String[] args){
        String palabra = "sometemos";

        System.out.println("la palabra" + palabra + "es palidromo?:" + esPalidromo(palabra));


    }
    public static void main(String[] args){
        palabra = palabra.toLowerCase();

        for (int i = 0; j = palabra.length() -i; j++){
            if (palabra.chartAt(i) != palabra.chartAt(j)){
                return false;

            }
        }
        return true;
    }
}