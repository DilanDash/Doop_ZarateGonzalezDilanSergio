/*
Elabore un programa que lea 10 números enteros por teclado y 
los guarde en un array. Calcula y muestre el promedio de
 los números que estén en las posiciones pares del array.
 */

 import java.util.Scanner;

 public class Arrys{
     public static void main(String[] args){
         Scanner entrada = new Scanner(System.in);
         int i;
         int numeros[] = new int[10];
         double media = 0;

         System.out.println("Elementos del Array: ");
         for (i = 0; i < 10; i++){
             System.out.println("numeros[" + i + "]= ");
             numeros[i] = entrada.nextInt();
         }

         for (i = 0; i < 10; i++){
             if (i % 2 == 0){
                 media = media + numeros[i];
             }
         }
         System.out.println("Media de los valores que se encuentran en posiciones pares:"+ media/5);
     }
 }