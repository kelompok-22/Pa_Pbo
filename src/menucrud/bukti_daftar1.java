/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menucrud;

import database.databases;
import implement.implemenbuktidaftar;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import java.util.logging.*;
/**
 *
 * @author ASUS
 */
import model.model_daftaranggota;

public class bukti_daftar1 implements implemenbuktidaftar{
    Connection connection;
    final String insert = "INSERT INTO bukti_daftar (kode_pendaftaran, tanggal_mendaftar, namaanggota, no_telpon,tarian ) VALUES (?, ?, ?, ?, ?)";
    final String update = "UPDATE bukti_daftar SET tanggal_mendaftar=?, namaanggota=?, no_telpon=?, tarian=? WHERE kode_pendaftaran = ?";
    final String select = "SELECT * FROM bukti_daftar";

    public bukti_daftar1(){
        connection = databases.configDB();
    }

    @Override
    public void insert(model_daftaranggota b) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert);
            statement.setString(1, b.getKode_pendaftaran());
            statement.setString(2, b.getTanggal_mendaftar());
            statement.setString(3, b.getNamaanggota());
            statement.setString(4, b.getNo_telpon());
            statement.setString(5, b.getTarian());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void update(model_daftaranggota b) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(update);
            statement.setString(1, b.getTanggal_mendaftar());
            statement.setString(2, b.getNamaanggota());
            statement.setString(3, b.getNo_telpon());
            statement.setString(4, b.getTarian());
            statement.setString(5, b.getKode_pendaftaran());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    /**
     *
     * @return
     */
    @Override
    public java.util.List<model_daftaranggota> getALLBuktidaftar() {
        java.util.List<model_daftaranggota> lb = null;
        try {
            lb = new ArrayList<model_daftaranggota>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                model_daftaranggota B = new model_daftaranggota();
                B.setKode_pendaftaran(rs.getString("kode_pendaftaran"));
                B.setTanggal_mendaftar(rs.getString("tanggal_mendaftar"));
                B.setNamaanggota(rs.getString("namaanggota"));
                B.setNo_telpon(rs.getString("no_telpon"));
                B.setNo_telpon(rs.getString("tarian"));
                lb.add(B);
            }
        } catch (SQLException ex) {
            Logger.getLogger(bukti_daftar1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lb;
    }
}
    
