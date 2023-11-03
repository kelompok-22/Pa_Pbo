/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menucrud;

import database.databases;
import implement.implementinstruktur;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.*;
import model.model_daftaranggota;
import model.model_instruktur;

/**
 *
 * @author ASUS
 */
public class instruktur implements implementinstruktur{
    Connection connection;
    final String insert = "INSERT INTO instruktur_tari (id_instruktur, nama, nama_ruangan, tarian) VALUES (?,?,?,?)";
    final String delete = "DELETE FROM instruktur where id_instruktur=?";
    final String update = "UPDATE bukti_daftar SET nama=?, nama_ruangan=?, tarian=? WHERE instruktur_tari = ?";
    final String select = "SELECT * FROM instruktur_tari";
    final String cariInstruktur = "SELECT * FROM instruktur where nama like ?";
    
    
    public instruktur(){
        connection = databases.configDB();
    }
    
    @Override
    public void insert(model_instruktur p) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert);
            statement.setString(1, p.getId_instruktur());
            statement.setString(2, p.getNama());
            statement.setString(3, p.getNama_ruangan());
            statement.setString(4, p.getTarian());
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
    public void update(model_instruktur p) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(update);
            statement.setString(1, p.getNama());
            statement.setString(2, p.getNama_ruangan());
            statement.setString(3, p.getTarian());
            statement.setString(4, p.getId_instruktur());
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
    public List<model_instruktur> getALLinstruktur() {
        java.util.List<model_instruktur> lb = null;
        try {
            lb = new ArrayList<model_instruktur>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                model_instruktur P = new model_instruktur();
                P.setId_instruktur(rs.getString("id_instruktur"));
                P.setNama(rs.getString("nama"));
                P.setNama_ruangan(rs.getString("nama_ruangan"));
                P.setTarian(rs.getString("tarian"));
                
                lb.add(P);
            }
        } catch (SQLException ex) {
            Logger.getLogger(instruktur.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lb;
        
    }

    @Override
    public List<model_instruktur> getCariNama(String nama) {
        List<model_instruktur> lb = null;
        try {
            lb = new ArrayList<model_instruktur>();
            PreparedStatement st = connection.prepareStatement(cariInstruktur);
            st.setString(1, "%"+ nama + "+");
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                model_instruktur I = new model_instruktur();
                I.setId_instruktur(rs.getString("id_instruktur"));
                I.setNama(rs.getString("nama"));
                I.setNama_ruangan(rs.getString("nama_ruangan"));
                I.setTarian(rs.getString("tarian"));
                lb.add(I);
            }
        } catch (SQLException ex) {
            Logger.getLogger(instruktur.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lb;
    }
    
    @Override
    public void delete (String id_instruktur){
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(delete);
            statement.setString(1, id_instruktur);
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
    
    
}
