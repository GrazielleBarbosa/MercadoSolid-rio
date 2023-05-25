/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DocView;

/**
 *
 * @author grazi
 */

import static ConexaoSql.Conexao.conector;
import static ConexaoSql.Conexao.desconectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Cadastro {
    
     
            
    public static void inserir(
            String nomeFantasia, 
            String razaoSocial, 
            int cnpj,
            int celular,
            int telefone,
            String email,
            String senha,
            String endereco,
            String bairro,
            int cep,
            String cidade
    ){
        try {
            
         Connection conexao = conector();
       
           String sql = "INSERT INTO mercasol.usuario(nm_fantasia, rz_social, cnpj, celular, telefone, `e-mail`,"
            + " senha, endereco, bairro, cep, cidade) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?)";
     
            PreparedStatement pst = conexao.prepareStatement(sql);
          
            pst.setString(1, nomeFantasia);
            pst.setString(2, razaoSocial);
            pst.setInt(3, cnpj);
            pst.setInt(4, celular);
            pst.setInt(5, telefone);
            pst.setString(6, email);
            pst.setString(7, senha);
            pst.setString(8, endereco);
            pst.setString(9, bairro);
            pst.setInt(10, cep);
            pst.setString(11, cidade);
            
            pst.execute();
            
            desconectar(conexao);
        } catch (SQLException ex){
            System.out.println("Ocorreu um erro ao acessar o banco de dados " + ex.getMessage());
        }
    }
    
}
