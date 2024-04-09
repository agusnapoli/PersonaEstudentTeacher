package com.agus.herencia.model.entities;

public  abstract class Persona {

    private String name;
    private String adress;
    private Integer age;

    public Persona ()
    {

    }

    public Persona (String name, String adress, Integer age)
    {
        this.name = name;
        this.adress=adress;
        this.age = age;
    }

    public void setName (String name)
    {
        this.name=name;
    }

    public String getName ()
    {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setAge (Integer age)
    {
        this.age=age;
    }

    public Integer getAge ()
    {
        return age;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", age=" + age +
                '}';
    }
}
