
/*
Elabore un programa que lea 10 números enteros por teclado y los
 guarde en un array. Calcula y muestre el promedio de los números 
 que estén en las posiciones pares del array.
*/

import java.util.Scanner;

public class Array{
    public static void main(String[] args){
        Scanner entrada =  new Scanner(System.in);
        int i;
        int pos = 0, neg = 0;
        int numeros[] = new int[10];
        double sumaPos = 0, sumaneg = 0;
        
        System.out.println("Lesctura de los elementos del Array: ");
        for (i = 0; i < 10; i++){
            System.out.println("numeros[" + 1 + "]= ");
            numeros[i] = entrada.nextInt();
        }
        for (i = 0; i < 10; i++){
            if (numeros[i] > 0){
                sumaPos += numeros[i];
                pos++;
            } 
            else if (numeros[i] < 0){
                sumaneg += numeros[i];
                neg++;
            }
        }
        
        if(pos != 0){
            System.out.println("Media de los valores positivos: " + sumaPos / pos);
        } 
        else{
            System.out.println("no a introducido numeros positivos");

        }
        if (neg != 0){
            System.out.println("Media de los valores negativos: " + sumaneg / neg);
        } 
        else {
            System.out.println("No ha introducido numeros negativos");

        }
    }
}