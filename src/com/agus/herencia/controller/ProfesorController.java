package com.agus.herencia.controller;

import com.agus.herencia.model.entities.Profesor;
import com.agus.herencia.model.repository.TeacherRepository;
import com.agus.herencia.view.ConsoleOrApp;

public class ProfesorController {

    private TeacherRepository teacherRepository;
    private ConsoleOrApp consoleOrApp;

    public ProfesorController ()
    {

    }

    public ProfesorController (TeacherRepository teacherRepository, ConsoleOrApp consoleOrApp)
    {
        this.teacherRepository=teacherRepository;
        this.consoleOrApp=consoleOrApp;
    }

    public void addProfesorToList ()
    {
        Profesor profe = this.consoleOrApp.addTeacher();
        this.teacherRepository.addToListProfe(profe);
        this.teacherRepository.toString();
    }

    public void removeProfesorToList ()
    {
        String name = this.consoleOrApp.remove();
        Profesor profe = this.teacherRepository.buscarNombreEnLista(name);
        this.teacherRepository.removeToListProfe(profe);
        this.teacherRepository.toString();
    }

    public void modifyProfesor ()
    {
        String name = this.consoleOrApp.modificarTurnoProfe();
        Profesor profe = this.teacherRepository.buscarNombreEnLista(name);
        String turno = this.consoleOrApp.modificarTurno();
        this.teacherRepository.modificarTurno(profe,turno);
        this.teacherRepository.toString();
    }
}
