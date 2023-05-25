/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexaoSql;


import java.sql.*;

/**
 *
 * @author grazi
 */


public class Conexao {
    
    public static void main(String[] args) {
        Connection conexao = conector();
        desconectar(conexao);
        
    }
    public static Connection conector(){
        
        //java.sql.
        
        Connection conexao = null;
        
        String driver = "com.mysql.cj.jdbc.Driver";
        
        String url = "jdbc:mysql://localhost:3306/mercasol";
        String user ="root";
        String password = "";
        
        // Estabelecer a conexão
        
        try{
            
           Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
            
        } catch (Exception e){
            System.out.println(e);  
            return null;
        }
    }
    
      
    public static void desconectar(Connection conexao) {
        if (conexao != null){
            try {
                conexao.close();
            } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao acessar o banco de dados" + ex.getMessage());
           }
        }
    }
    
}

   