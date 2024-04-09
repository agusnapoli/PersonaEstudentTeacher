package com.agus.herencia.model.entities;

public class Estudiante extends Persona{

    private Integer legajo;

    private Double promedio;

    public Estudiante (String name, String adress, Integer age, Integer legajo,Double promedio)
    {
        super (name,adress,age);
        this.legajo=legajo;
        this.promedio=promedio;
    }

    public void setLegajo (Integer legajo)
    {
        this.legajo=legajo;
    }

    public Integer getLegajo()
    {
        return legajo;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }
}
