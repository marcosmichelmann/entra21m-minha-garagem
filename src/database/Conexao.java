/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class Conexao {

    private static Connection conexao;
    private static String DRIVER = "com.mysql.jdbc.Driver";
    private static String HOST = "jdbc:mysql://localhost/minha_garagem";
    private static String USUARIO = "root";
    private static String SENHA = "";

    public static Connection conectar() {
        try {
            Properties propriedades = new Properties();
            propriedades.setProperty("user", USUARIO);
            propriedades.setProperty("pasword", SENHA);

            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(HOST, propriedades);
            return conexao;
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle.getMessage());
            return null;
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }

    public static void desconectar() {
        if (conexao != null) {
            try {
                conexao.close();
            } catch (SQLException sqle) {
                System.out.println(sqle.getMessage());
            }
        }
    }
    
    public static void truncate() {
        conectar();
        if(conexao!= null) {
            
            try{
                Statement st = conexao.createStatement();
                st.addBatch("SET FOREIGN_KEY_CHECKS = 0;");
                st.addBatch("TRUNCATE TABLE carros;");
                st.addBatch("TRUNCATE TABLE categorias;");
                st.addBatch("TRUNCATE TABLE avioes;");
                st.addBatch("SET FOREIGN_KEY_CHECKS = 1;");
                st.executeBatch();
            }catch(SQLException e){
                e.printStackTrace();
            }finally{
                desconectar();
            }
        }
    }

}



// Garbage Collector

// Quando o método não é estático ou seja ele pertence ao objeto
// Conexao conexao = new Conexao();
// conexao.conectar();

// Quando o método é estático
// Conexao.conectar();