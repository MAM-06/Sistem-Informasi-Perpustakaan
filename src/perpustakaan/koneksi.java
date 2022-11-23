/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
/**
 *
 * @author Lenovo
 */
public class koneksi {
    private static Connection koneksi;
    public static Connection GetConnection()throws SQLException{
        if(koneksi==null){
            Driver driver = new Driver();
            koneksi = DriverManager.getConnection
        ("jdbc:mysql://localhost:3306/perpustakaan_dbd6","root","");
        }
        return koneksi;
    }
}
