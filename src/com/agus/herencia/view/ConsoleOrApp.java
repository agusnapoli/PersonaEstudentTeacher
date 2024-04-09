package com.agus.herencia.view;

import com.agus.herencia.model.entities.Estudiante;
import com.agus.herencia.model.entities.Profesor;

import java.util.Scanner;

public class ConsoleOrApp {

    /*String eleccion;
   public void menu () {
        do {

            System.out.println("Ingrese la opcion desedaa");



        }
    }*/

    public Estudiante addEstudent() {
        String nombre;
        String apellido;
        Integer edad;
        Integer legajo;
        Double promedio;
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese nombre del estudiante");
        nombre = scan.nextLine();
        System.out.println("Ingrese apellido  del estudiante");
        apellido = scan.nextLine();
        System.out.println("Ingrese edad del estudiante");
        edad = scan.nextInt();
        System.out.println("Ingrese legajo del estudiante");
        legajo = scan.nextInt();
        System.out.println("Ingrese promedio del estudiante");
        promedio = scan.nextDouble();

        Estudiante estudiante = new Estudiante(nombre, apellido, edad, legajo, promedio);
        return estudiante;
    }

    public String remove() {
        Scanner scan = new Scanner(System.in);
        String name;

        System.out.println("Ingrese el nombre de la persona a eliminar");
        name = scan.nextLine();

        return name;
    }

    public String modificarEstudent() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante al que va a modificarle el promedio");
        String name;
        name = scan.nextLine();

        return name;
    }

    public Double modificarPromedio() {
        System.out.println("Ingrese el nuevo promedio");
        Scanner scan = new Scanner(System.in);
        double prom = scan.nextDouble();

        return prom;
    }

    public Profesor addTeacher() {
        String nombre;
        String apellido;
        Integer edad;
        String materia;
        String turno;
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese nombre del estudiante");
        nombre = scan.nextLine();
        System.out.println("Ingrese apellido  del estudiante");
        apellido = scan.nextLine();
        System.out.println("Ingrese edad del estudiante");
        edad = scan.nextInt();
        System.out.println("Ingrese materia del estudiante");
        materia = scan.nextLine();
        System.out.println("Ingrese turno del estudiante");
        turno = scan.nextLine();

        Profesor profe = new Profesor(nombre, apellido, edad, materia, turno);
        return profe;

    }

    public String modificarTurnoProfe() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el nombre del profesor al que va a modificarle el turno");
        String name;
        name = scan.nextLine();

        return name;
    }

    public String modificarTurno() {
        System.out.println("Ingrese el nuevo turno");
        Scanner scan = new Scanner(System.in);
        String turno = scan.nextLine();

        return turno;
    }

}







