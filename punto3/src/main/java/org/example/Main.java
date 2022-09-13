package org.example;
/*La biblioteca de Alejandría necesita de sus servicios para registrar
libros en su sistema de cómputo (NOMBRE LIBRO, CÓDIGO, NUMERO
DE PÁGINAS, NUMERO DE EJEMPLARES, AUTOR). Se debe poder
consultar la información de un libro en cualquier momento y modificar el
número de ejemplares.*/
import clases.Libros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Libros libros=new Libros();
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite el nombre del libro: ");
        libros.setNombre(sc.nextLine());
        System.out.println("Digite el Codigo del libro: ");
        libros.setCodigo(sc.next());
        System.out.println("Digite Numero de paginas  del libro: ");
        libros.setPaginas(sc.next());
        System.out.println("Digite numero de ejemplares del libro: ");
        libros.setEjemplares(sc.nextInt());
        System.out.println("Digite el autor del libro: ");
        libros.setAutor(sc.next());

        System.out.println("Nombre del libro "+libros.getNombre());
        System.out.println("Codigo del libro "+libros.getCodigo());
        System.out.println("Numero de Paginas "+libros.getPaginas());
        System.out.println("Numero de ejemplares "+libros.getEjemplares());
        System.out.println("Autor "+libros.getAutor());

    }
}