package com.example.nicolasperez.mytutoreia;
import java.io.Serializable;
import java.util.*;
public class Tutor extends Usuario implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = -1535218147975970287L;

    //Constructor
    public Tutor(String nombre, String nombreCuenta, String password, String correo,
                 String telefono,String materias,String nivel,String horario) {
        super(nombre, nombreCuenta, password, correo);
        // TODO Auto-generated constructor stub
        this.telefono=telefono;
        this.materias = materias;
        this.nivel=nivel;
    }

    //Atributos
    private String telefono;
    private String nivel;
    private String materias;

    //Getters y setters
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }



    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }


    @Override
    public String toString() {
        return "Tutor";
    }




}