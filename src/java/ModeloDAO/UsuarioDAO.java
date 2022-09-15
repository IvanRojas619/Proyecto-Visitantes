/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Config.Conexion;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Ivan
 */
public class UsuarioDAO {
    
    Conexion cn=new Conexion();     
    Connection  con;
    PreparedStatement ps;
    ResultSet rs;
    
   
    
    public Usuario validar(String user,String password){
        
         Usuario usuario= new Usuario();
         String sql="SELECT * FROM usuarios WHERE username=? and contraseña=?";
         
         try{
             
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, password);
            rs=ps.executeQuery();
            
            while(rs.next()){
                
                usuario.setId(rs.getInt("Id"));
                usuario.setUserName(rs.getString("username"));
                usuario.setPassword(rs.getString("contraseña"));
                
                
            }
         
         }catch(Exception e){
             
             
         }
         
         return usuario;
         
    }
    
    
}
