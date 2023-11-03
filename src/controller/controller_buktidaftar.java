/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import implement.implemenbuktidaftar;
import view.bukti_daftar;
import model.model_daftaranggota;
import java.util.List;
import menucrud.bukti_daftar1;
import model.modeltabel_daftar;
import javax.swing.JOptionPane;
import model.model_daftaranggota;
/**
 *
 * @author ASUS
 */
public class controller_buktidaftar {
    bukti_daftar fremeMenus;
    implemenbuktidaftar imBuktiDaftar;
    List<model_daftaranggota> listanggotas;
    
    public controller_buktidaftar(bukti_daftar fremeMenus){
        this.fremeMenus = fremeMenus;
        imBuktiDaftar = new bukti_daftar1();
        listanggotas= imBuktiDaftar.getALLBuktidaftar();

    }
    
    public void reset(){
        fremeMenus.getTxtkode().setText("");
        fremeMenus.getTxttanggal().setText("");
        fremeMenus.getTxtnama().setText("");
        fremeMenus.getTxttelpon().setText("");
        fremeMenus.getCombo_tarian().setSelectedItem("---TARI---");
    }
    
    public void isiTable(){
        listanggotas = imBuktiDaftar.getALLBuktidaftar();
        modeltabel_daftar mag = new modeltabel_daftar(listanggotas); 
        fremeMenus.getTabelmenu().setModel(mag);
    }
    public void insert(){
        if(!fremeMenus.getTxtkode().getText().trim().isEmpty()&!fremeMenus.getTxttanggal().getText().trim().isEmpty()&!fremeMenus.getTxtnama().getText().trim().isEmpty()&!fremeMenus.getTxttelpon().getText().trim().isEmpty()){
            model_daftaranggota mag = new model_daftaranggota();
            mag.setTanggal_mendaftar(fremeMenus.getTxttanggal().getText());
            mag.setKode_pendaftaran(fremeMenus.getTxtkode().getText());
            mag.setNamaanggota(fremeMenus.getTxtnama().getText());
            mag.setNo_telpon(fremeMenus.getTxttelpon().getText());
            mag.setTarian(fremeMenus.getCombo_tarian().getSelectedItem().toString());
            

            
            imBuktiDaftar.insert(mag);
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Simpan");
            
        } else {
            JOptionPane.showMessageDialog(fremeMenus, "Data Tidak Boleh Kosong");
        }      
    }
    public void update(){
        if(!fremeMenus.getTxtkode().getText().trim().isEmpty()){
            model_daftaranggota mag = new model_daftaranggota();
            mag.setKode_pendaftaran(fremeMenus.getTxtkode().getText());
            mag.setTanggal_mendaftar(fremeMenus.getTxttanggal().getText());
            mag.setNamaanggota(fremeMenus.getTxtnama().getText());
            mag.setNo_telpon(fremeMenus.getTxttelpon().getText());
            mag.setTarian(fremeMenus.getCombo_tarian().getSelectedItem().toString());
            imBuktiDaftar.update(mag);
            JOptionPane.showMessageDialog(null, "DATA BERHASIL DI UPDATE");
        }else {
            JOptionPane.showMessageDialog(fremeMenus, "SILAHKAN PILIH DATA YG AKAN DI UPDATE");
        }
    }
}   
