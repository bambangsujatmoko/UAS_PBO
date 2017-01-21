/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author MalingerS Media
 */
public class koneksi {
    public Statement state;
    private Connection connect;
    String namaDatabase = "jdbc:mysql://localhost/db_uas_15312632";
    
    public void koneksiDatabase(){
        try {
            connect = DriverManager.getConnection(namaDatabase,"root","");
            state = connect.createStatement();
            System.out.println("Koneksi Terhubung");
        } catch (SQLException e) {
            System.err.println("Terjadi Galat :  "+e);
        }
    }
    
}
