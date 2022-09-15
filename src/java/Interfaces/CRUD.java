/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelo.Ppl;
import java.util.List;

/**
 *
 * @author Ivan
 */
public interface CRUD {
    
    
   public List listar();
   public Ppl list(int id);
   public boolean add(Ppl ppl);
   public boolean edit(Ppl ppl);
   public boolean eliminar(int id);
   
   
   
    
}
