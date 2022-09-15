/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Ivan
 */
public class Visitante {
    
    int id_visitante;
    String Nombre;
     String apellido_paterno;
    String apellido_materno;
    int edad;
    String Sexo;
    
    public Visitante(){
        
        
    }

    public Visitante(int id_visitante, String Nombre, String apellido_paterno, String apellido_materno, int edad, String Sexo) {
        this.id_visitante = id_visitante;
        this.Nombre = Nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.edad = edad;
        this.Sexo = Sexo;
    }

   
   

    public int getId_visitante() {
        return id_visitante;
    }

    public void setId_visitante(int id_visitante) {
        this.id_visitante = id_visitante;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
   
    
    
    
}
