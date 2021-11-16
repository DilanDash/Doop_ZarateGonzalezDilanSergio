/*

para poder hacer el programa de la suma de dos numeros

debemos de entender el algoritmo de la suma

declarar variables

num1 num2 resultado
1.- solo una vez se sume?
2.- voy a querer que se sumen los numeros y que se repita?
 */

 //es necesario utilizxar librerias dentro de java para algunos procesos
 //vamos a ocupar la libreria Scanner que nos sirve para optener la entrada de datos

 import java.util.Scanner;

 class sumadedosnumeros{

public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int num1, num2;
        int resultado;

        do{
            System.out.println("introduce el primer numero a sumar: ");

            num1 = entrada.nextInt();
            System.out.println("introduce el segundo numero: ");
            num2 = entrada.nextInt();
    
            resultado = num1 + num2;

        }while(num1 !=0);    

        System.out.println("el resultado de la suma es: " + resultado);

    }
 }