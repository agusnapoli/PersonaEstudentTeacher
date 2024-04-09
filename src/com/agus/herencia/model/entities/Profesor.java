package com.agus.herencia.model.entities;

public class Profesor extends Persona{

    private String materia;
    private String turno;


    public Profesor (String name, String adress, Integer age, String materia, String turno)
    {
        super (name,adress,age);
        this.materia=materia;
    }

    public void setMateria (String materia)
    {
        this.materia=materia;
    }

    public String getMateria ()
    {
        return materia;
    }


    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }


}
