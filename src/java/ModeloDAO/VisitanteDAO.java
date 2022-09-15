/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Config.Conexion;
import Interfaces.CRUDVISITANTE;
import Modelo.Visitante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ivan
 */
public class VisitanteDAO implements CRUDVISITANTE {
    
    Conexion cn=new Conexion();
    Connection  con;
    PreparedStatement ps;
    ResultSet rs;
    
    Visitante visitante= new Visitante();

    @Override
    public List listar() {
        
          ArrayList<Visitante> list=new ArrayList<>();
       
       String sql="select * from visitantes";
       
       try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                
                Visitante visitante= new Visitante();
                visitante.setId_visitante(rs.getInt("Id_visitante"));
                visitante.setNombre(rs.getString("Nombre"));
                visitante.setApellido_paterno(rs.getString("ApellidoPaterno"));
                visitante.setApellido_materno(rs.getString("ApellidoMaterno"));
                visitante.setEdad(rs.getInt("Edad"));
                visitante.setSexo(rs.getString("Sexo"));
                list.add(visitante);
                
            }
            
           
       }catch(Exception e){
           
           
       }
      
       
       return list;
    }

    @Override
    public Visitante list(int id) {
        
         String sql="select * from visitantes where Id_visitante="+id;
       
       try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                
                
                visitante.setId_visitante(rs.getInt("Id_visitante"));
                visitante.setNombre(rs.getString("Nombre"));
                visitante.setApellido_paterno(rs.getString("ApellidoPaterno"));
                visitante.setApellido_materno(rs.getString("ApellidoMaterno"));
                visitante.setEdad(rs.getInt("Edad"));
                visitante.setSexo(rs.getString("Sexo"));
                
                
            }
            
           
       }catch(Exception e){
           
           
       }
       
       return visitante;
    }

    @Override
    public boolean add(Visitante visitante) {
      
      String sql ="INSERT INTO visitantes (Id_visitante,Nombre,ApellidoPaterno,ApellidoMaterno,Edad,Sexo) VALUES('"+visitante.getId_visitante()+"','"+visitante.getNombre()+"','"+visitante.getApellido_materno()+"','"+visitante.getApellido_paterno()+"','"+visitante.getEdad()+"','"+visitante.getSexo()+"')";
        
        try{
            
        con=cn.getConnection();
        ps=con.prepareStatement(sql);
        ps.executeUpdate();
            
        }catch(Exception e){
            
            
        }
       
        return false;
    }

    @Override
    public boolean edit(Visitante visitante) {
       
         String sql ="UPDATE visitantes SET Id_visitante='"+visitante.getId_visitante()+"',Nombre='"+visitante.getNombre()+"',ApellidoMaterno='"+visitante.getApellido_materno()+"',ApellidoPaterno='"+visitante.getApellido_paterno()+"',Edad='"+visitante.getEdad()+"',Sexo='"+visitante.getSexo()+"'WHERE Id_visitante="+visitante.getId_visitante();
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
        
              String sql="DELETE FROM visitantes WHERE Id_visitante="+id;
      
      try{
          
          con=cn.getConnection();
          ps=con.prepareStatement(sql);
          ps.executeUpdate();
          
          
          
      }catch(Exception e){
          
          
      }
      
      return false;
    }
    
    
    
}
