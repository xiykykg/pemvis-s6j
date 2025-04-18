package Koneksi;
import java.sql.*;

//author: reza

public class koneksi {
    private Connection koneksi;
    public Connection connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Koneksi Berhasil");
        }
        catch(ClassNotFoundException ex) {
            System.out.println("koneksi Gagal"+ex);
        }
        String url = "jdbc:mysql://localhost/materi"; 
        try {
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/penjualan", "root", "");

            System.out.println("Database berhasil terkoneksi");
        }
        catch (SQLException ex) {
            System.out.println("Database gagal terkoneksi");
        }
        return koneksi;
    }
}