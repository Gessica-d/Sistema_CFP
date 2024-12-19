package DAO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Géssica
 */

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConexaoDAO {
    public Connection conectaDB(){
        Connection conn = null;
        try{
            
            String url = "jdbc:mysql://localhost:3306/Sistema_CPF?user=root&password=Glima3010!&useTimezone=true&serverTimezone=America/Sao_Paulo";


            conn = DriverManager.getConnection(url);
            
        } catch (SQLException erro
                
                ){
             JOptionPane.showMessageDialog(null, "ConexaoDAO" + erro.getMessage());
                    }
        return conn;
    }
}
