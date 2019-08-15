package komunitas.koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksi {
    private static Connection con;
    public koneksi(){
    
    }
    public static Connection getConnection(){
         try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/islc","root","");
         }
         catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Terjadi Gagal Koneksi");
         }
    return con;
    }
}

