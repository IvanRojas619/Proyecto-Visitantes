/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Config.Conexion;
import Interfaces.CRUD_VISITANTE_PPL;
import Modelo.Visitante_Ppl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ivan
 */
public class Visitante_PplDAO implements CRUD_VISITANTE_PPL {
    
     
    Conexion cn=new Conexion();
    Connection  con;
    PreparedStatement ps;
    ResultSet rs;
    
    Visitante_Ppl visitante_ppl= new Visitante_Ppl();

    @Override
    public List listar() {
    
                  ArrayList<Visitante_Ppl> list=new ArrayList<>();
       
       String sql="select * from visitantes_ppls";
       
       try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                
                
                Visitante_Ppl visitante_ppl= new Visitante_Ppl();
                visitante_ppl.setId_visita(rs.getInt("Id_visita"));
                visitante_ppl.setId_visitante(rs.getInt("Id_visitante"));
                visitante_ppl.setId_ppl(rs.getInt("Id_ppl"));
                visitante_ppl.setParentesco(rs.getString("parentesco"));
             
                list.add(visitante_ppl);
                
            }
            
           
       }catch(Exception e){
           
           
       }
      
       
       return list;
    }

    @Override
    public Visitante_Ppl list(int id) {
         String sql="select * from visitantes_ppls where Id_visita="+id;
       
       try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                
                
                visitante_ppl.setId_visita(rs.getInt("Id_visita"));
                visitante_ppl.setId_visitante(rs.getInt("Id_visitante"));
                visitante_ppl.setId_ppl(rs.getInt("Id_ppl"));
                visitante_ppl.setParentesco(rs.getString("parentesco"));
        
                
                
            }
            
           
       }catch(Exception e){
           
           
       }
       
       return visitante_ppl;
    }

    
    @Override
    public boolean add(Visitante_Ppl visitante_ppl) {
     
              String sql ="INSERT INTO visitantes_ppls (Id_visita,Id_visitante,Id_ppl,parentesco) VALUES('"+visitante_ppl.getId_visita()+"','"+visitante_ppl.getId_visitante()+"','"+visitante_ppl.getId_ppl()+"','"+visitante_ppl.getParentesco()+"')";
        
        try{
            
        con=cn.getConnection();
        ps=con.prepareStatement(sql);
        ps.executeUpdate();
            
        }catch(Exception e){
            
            
        }
       
        return false;
        
    }

    @Override
    public boolean edit(Visitante_Ppl visitante_ppl) {
       String sql ="UPDATE visitantes_ppls SET Id_visita='"+visitante_ppl.getId_visita()+"',Id_visitante='"+visitante_ppl.getId_visitante()+"',Id_ppl='"+visitante_ppl.getId_ppl()+"',parentesco='"+visitante_ppl.getParentesco()+"'WHERE Id_visita="+visitante_ppl.getId_visita();
    try{
        con=cn.getConnection();
        ps=con.prepareStatement(sql);
        ps.executeUpdate();
        
        
    }catch(Exception e){
        
        
    }
    return false;
    }

    @Override
    public boolean eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
