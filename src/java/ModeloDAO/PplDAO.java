/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Config.Conexion;
import Interfaces.CRUD;
import Modelo.Ppl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ivan
 */
public class PplDAO implements CRUD {
    
    Conexion cn=new Conexion();
    Connection  con;
    PreparedStatement ps;
    ResultSet rs;
    
    Ppl ppl= new Ppl();
    
    
    

    @Override
    public List listar() {
        
       ArrayList<Ppl> list=new ArrayList<>();
       
       String sql="select * from ppl";
       
       try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                
                Ppl ppl= new Ppl();
                ppl.setId_ppl(rs.getInt("Id_ppl"));
                ppl.setNombre(rs.getString("Nombre"));
                ppl.setApellido_paterno(rs.getString("ApellidoPaterno"));
                ppl.setApellido_materno(rs.getString("ApellidoMaterno"));
                ppl.setEdad(rs.getInt("Edad"));
                ppl.setSexo(rs.getString("Sexo"));
                list.add(ppl);
                
            }
            
           
       }catch(Exception e){
           
           
       }
      
       
       return list;
    }

    @Override
    public Ppl list(int id) {
        
         String sql="select * from ppl where Id_ppl="+id;
         
       
       try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                
                
                ppl.setId_ppl(rs.getInt("Id_ppl"));
                ppl.setNombre(rs.getString("Nombre"));
                ppl.setApellido_paterno(rs.getString("ApellidoPaterno"));
                ppl.setApellido_materno(rs.getString("ApellidoMaterno"));
                ppl.setEdad(rs.getInt("Edad"));
                ppl.setSexo(rs.getString("Sexo"));
                
                
            }
            
           
       }catch(Exception e){
           
           
       }
       
       return ppl;
    }

    @Override
    public boolean add(Ppl ppl) {
        
        String sql ="INSERT INTO ppl (Id_ppl,Nombre,ApellidoPaterno,ApellidoMaterno,Edad,Sexo) VALUES('"+ppl.getId_ppl()+"','"+ppl.getNombre()+"','"+ppl.getApellido_materno()+"','"+ppl.getApellido_paterno()+"','"+ppl.getEdad()+"','"+ppl.getSexo()+"')";
        
        try{
            
        con=cn.getConnection();
        ps=con.prepareStatement(sql);
        ps.executeUpdate();
            
        }catch(Exception e){
            
            
        }
       
        return false;
    }

    @Override
    public boolean edit(Ppl ppl) {
       String sql ="UPDATE ppl SET Id_ppl='"+ppl.getId_ppl()+"',Nombre='"+ppl.getNombre()+"',ApellidoMaterno='"+ppl.getApellido_materno()+"',ApellidoPaterno='"+ppl.getApellido_paterno()+"',Edad='"+ppl.getEdad()+"',Sexo='"+ppl.getSexo()+"'WHERE Id_ppl="+ppl.getId_ppl();
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
      String sql="DELETE FROM ppl WHERE Id_ppl="+id;
      
      try{
          
          con=cn.getConnection();
          ps=con.prepareStatement(sql);
          ps.executeUpdate();
          
          
          
      }catch(Exception e){
          
          
      }
      
      return false;
    }
    
    
    
}
