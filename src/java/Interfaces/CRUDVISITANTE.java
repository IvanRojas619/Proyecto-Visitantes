/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelo.Visitante;
import java.util.List;


/**
 *
 * @author Ivan
 */
public interface CRUDVISITANTE {
    
    public List listar();
    
   public Visitante list(int id);
   public boolean add(Visitante visitante);
   public boolean edit(Visitante visitante);
   public boolean eliminar(int id);
    
    
}
