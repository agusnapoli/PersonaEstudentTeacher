package com.agus.herencia.model.repository;

import com.agus.herencia.model.entities.Estudiante;
import com.agus.herencia.model.entities.Persona;

import java.util.ArrayList;

public class EstudentRepository {

    private ArrayList<Estudiante> lista = new ArrayList<>();

    public EstudentRepository ()
    {
        this.lista = new ArrayList<>();
    }

    public void addToList (Estudiante estudiante) {
        this.lista.add(estudiante);
    }

    public Estudiante buscarNombreEnLista (String nombre)
    {
        for (int i = 0; i<this.lista.size(); i++)
        {
            if (lista.get(i).getName().equals(nombre))
            {
                return lista.get(i);
            }
        }
        return null;
    }

    public void deleteToList (Estudiante estudiante)
    {
        this.lista.remove(estudiante);
    }

    public void modificarLista (Estudiante estudiante, Double prom)
    {
        estudiante.setPromedio(prom);
    }


    /*@Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("EstudentRepository {");

        // Mostrar atributos de la clase padre
        stringBuilder.append(super.toString());

        // Mostrar atributos de la clase hija
        for (Estudiante estudiante : lista) {
            stringBuilder.append(", Legajo: ").append(estudiante.getLegajo());
            stringBuilder.append(", Promedio: ").append(estudiante.getPromedio());
        }

        stringBuilder.append("\n}");
        return stringBuilder.toString();
    }*/


}

