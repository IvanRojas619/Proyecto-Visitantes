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
public class Ppl {
    
    
    int id_ppl;
    String nombre;
    String apellido_paterno;
    String apellido_materno;
    int edad;
    String sexo;

    public Ppl() {
    }

    public Ppl(int id_ppl, String nombre, String apellido_paterno, String apellido_materno, int edad, String sexo) {
        this.id_ppl = id_ppl;
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.edad = edad;
        this.sexo = sexo;
    }

    public int getId_ppl() {
        return id_ppl;
    }

    public void setId_ppl(int id_ppl) {
        this.id_ppl = id_ppl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    
    
}
