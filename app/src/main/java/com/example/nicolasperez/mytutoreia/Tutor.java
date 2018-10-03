package com.example.nicolasperez.mytutoreia;
import java.io.Serializable;
import java.util.*;
public class Tutor extends Usuario implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = -1535218147975970287L;

    //Constructor
    public Tutor(String nombre, String apellido, String nombreCuenta, String password, String correo,
                 String telefono,LinkedList<Materia> materias,String nivel,String horario) {
        super(nombre, apellido, nombreCuenta, password, correo);
        // TODO Auto-generated constructor stub
        this.telefono=telefono;
        this.materias=materias;
        this.nivel=nivel;
    }

    //Atributos
    private String telefono;
    private LinkedList<Materia> materias;
    private String nivel;

    //Getters y setters
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }



    public LinkedList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(LinkedList<Materia> materias) {
        this.materias = materias;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    //Metodos
    public void agregarMateria(Materia m) {
        materias.add(m);
    }

    public Materia buscarMateria(Materia m) {
        int i=0;
        while(i<materias.size() && materias.get(i).equals(m)) {
            i++;
        }
        return (i<materias.size())? materias.get(i):null;
    }

    @Override
    public String toString() {
        return "Tutor";
    }




}