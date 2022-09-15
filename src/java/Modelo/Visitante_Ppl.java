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
public class Visitante_Ppl {
    
    
    int id_visita;
    int id_visitante;
    int id_ppl;
    String parentesco;

    public Visitante_Ppl() {
    }

    public Visitante_Ppl(int id_visita, int id_visitante, int id_ppl, String parentesco) {
        this.id_visita = id_visita;
        this.id_visitante = id_visitante;
        this.id_ppl = id_ppl;
        this.parentesco = parentesco;
    }

    public int getId_visita() {
        return id_visita;
    }

    public void setId_visita(int id_visita) {
        this.id_visita = id_visita;
    }

    public int getId_visitante() {
        return id_visitante;
    }

    public void setId_visitante(int id_visitante) {
        this.id_visitante = id_visitante;
    }

    public int getId_ppl() {
        return id_ppl;
    }

    public void setId_ppl(int id_ppl) {
        this.id_ppl = id_ppl;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }
    
    
    
}
