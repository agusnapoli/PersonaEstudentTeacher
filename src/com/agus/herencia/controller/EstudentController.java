package com.agus.herencia.controller;

import com.agus.herencia.model.entities.Estudiante;
import com.agus.herencia.model.repository.EstudentRepository;
import com.agus.herencia.view.ConsoleOrApp;

public class EstudentController {

    private EstudentRepository estudentRepository;
    private ConsoleOrApp consoleOrApp;
    public EstudentController ()
    {
    }

    public EstudentController (EstudentRepository estudentRepository, ConsoleOrApp consoleOrApp)
    {
        this.estudentRepository= estudentRepository;
        this.consoleOrApp= consoleOrApp;
    }

    public void createEstudent ()
    {
        Estudiante estudiante = this.consoleOrApp.addEstudent();
        this.estudentRepository.addToList(estudiante);
        this.estudentRepository.toString();
    }

    public void removeEstudent ()
    {
        String name = this.consoleOrApp.remove();
        Estudiante estudiante = this.estudentRepository.buscarNombreEnLista(name);
        this.estudentRepository.deleteToList(estudiante);
        this.estudentRepository.toString();
    }

    public void modifyEstudent ()
    {
        String name = this.consoleOrApp.modificarEstudent();
        Estudiante estudiante = this.estudentRepository.buscarNombreEnLista(name);
        Double prom = this.consoleOrApp.modificarPromedio();
        this.estudentRepository.modificarLista(estudiante,prom);
        this.estudentRepository.toString();
    }


}
