/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelo.Visitante_Ppl;
import java.util.List;

/**
 *
 * @author Ivan
 */
public interface CRUD_VISITANTE_PPL {
    
       public List listar();
    
   public Visitante_Ppl list(int id);
   public boolean add(Visitante_Ppl visitante_ppl);
   public boolean edit(Visitante_Ppl visitante_ppl);
   public boolean eliminar(int id);
    
    
}
