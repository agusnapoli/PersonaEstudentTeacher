package com.agus.herencia.model.repository;

import com.agus.herencia.model.entities.Estudiante;
import com.agus.herencia.model.entities.Profesor;

import java.util.ArrayList;

public class TeacherRepository {

    private ArrayList<Profesor> lista = new ArrayList<>();

    public TeacherRepository ()
    {
        this.lista= new ArrayList<>();
    }

    public void addToListProfe (Profesor profe)
    {
        this.lista.add(profe);
    }

    public Profesor buscarNombreEnLista (String nombre)
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
    public void removeToListProfe (Profesor profe)
    {
        this.lista.remove(profe);
    }

    public void modificarTurno (Profesor profesor, String turno)
    {
        profesor.setTurno(turno);
    }



    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        // Mostrar atributos de la clase padre
        stringBuilder.append(super.toString());

        // Mostrar atributos de la clase hija
        stringBuilder.append("\nPROFESORES:");
        for (Profesor profe : lista) {
            stringBuilder.append(", Materia: ").append(profe.getMateria());
            stringBuilder.append(", Turno: ").append(profe.getTurno());
        }

        stringBuilder.append("\n}");
        return stringBuilder.toString();
    }
}
