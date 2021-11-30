/*

41 - 60

Las funciones de la biblioteca 

prestamo de libros

*/ 

import java.util.Scanner;
import java.util.*;
import javax.swing.*;

public class Biblioteca{

    //vamos a crear un objeto para poder introducir los datos
    Scanner entrada = new Scanner(System.in);

    /*
    Vamos a realizar el 
    Variables
    Autor, Titutlo, ISBN, Genero, 
    Ejemplares, Costo del prestamo
    //metodos
    prestamo de libros
    Devolucion de libros
    */

    String titulo, autor, isbn, genero;
    int ejemplares;
    double costo_prestamo, total;


    public void Libros(){
        //menu para el prestamo del libro

        //agregar el try catch para el manejo de errores
        //identificar si son variables publicas o privadas para el manejo de los datos
        String text;

        text = JOptionPane.showInputDialog("Elija la funcion que desea ejecutar: "
                                + "\n 1.- Prestamo del libro"
                                + "\n 2.- Devolucion del libro");

        int opcion;

        opcion = Integer.parseInt(text);

        switch (opcion) {
            case 1:

                Prestamo();
                
                break;

            case 2:

                Devolucion();

                break;
            default:

                JOptionPane.showInputDialog("Gracias por usar el programa de Prestamos de Libros");
                break;
        }
    }

    public void Prestamo(){
        
        Int Libro drama = new Libro("Osito Carpintero");
        Int Libro Accion =new Libro("Avengers")
    }

    public void Devolucion(){

      
    }
}

