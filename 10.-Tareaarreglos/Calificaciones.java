
import java.util.Scanner;

/*
    Realice un programa que permita leer 10 calificaciones de una asignatura y los guarde en un array para que muestre: 

Imprimir todas las calificaciones. 

Promedio de las calificaciones. 

La calificación más alta y la más baja. 

El número de calificaciones superiores al promedio. 

La cantidad de alumnos aprobados y reprobados. 

*/

public class Calificaciones{
    
    public static void main(String[] args){


        Scanner entrada = new Scanner(System.in);
        int i;
        int calificaciones[] = new int[10];
        double promedio = 0, total = 0;

        System.out.println("Calificaciones");
        for (i = 1; i < 10; i++){
            System.out.println("calificaciones" + 1 + "=");
            calificaciones[i] = entrada.nextInt();
            total = total + calificaciones [i];
            promedio = total/10;
        }

        System.out.println("Total: " +total);
        System.out.println("Promedio: " + promedio);

    }
  }