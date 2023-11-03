/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.crud_instruktur;
import implement.implementinstruktur;
import java.util.List;
import javax.swing.JOptionPane;
import model.model_instruktur;
import model.modeltabel_instruktur;
/**
 *
 * @author ASUS
 */
public class controller_instruktur {
    crud_instruktur fremeMenus;
    implementinstruktur iminstruktu;
    List<model_instruktur> listanggotas;
    
    
    public controller_instruktur(crud_instruktur frameMenus){
        this.fremeMenus = frameMenus;
        iminstruktu = (implementinstruktur) new crud_instruktur();
        listanggotas = iminstruktu.getALLinstruktur();

    }
    
    public void isiTable(){
        listanggotas = iminstruktu.getALLinstruktur();
        modeltabel_instruktur mag = new modeltabel_instruktur(listanggotas); 
        fremeMenus.getTabelmodelinstruktur().setModel(mag);
    }
    
    public void insert(){
        if(!fremeMenus.getTxtid().getText().trim().isEmpty()&!fremeMenus.getTxtnama().getText().trim().isEmpty()&!fremeMenus.getTxtnama().getText().trim().isEmpty()&!fremeMenus.getTxtnamaruangan().getText().trim().isEmpty()){
            model_instruktur mag = new model_instruktur();
            mag.setId_instruktur(fremeMenus.getTxtid().getText());
            mag.setNama(fremeMenus.getTxtnama().getText());
            mag.setNama_ruangan(fremeMenus.getTxtnamaruangan().getText());
            mag.setTarian(fremeMenus.getCombotari().getSelectedItem().toString());
            

            
            iminstruktu.insert(mag);
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Simpan");
            
        } else {
            JOptionPane.showMessageDialog(fremeMenus, "Data Tidak Boleh Kosong");
        }      
    }
    
    public void delete(){
        if(!fremeMenus.getTxtid().getText().trim().isEmpty()){
            String ID =(fremeMenus.getTxtid().getText());
            iminstruktu.delete(ID);
            JOptionPane.showMessageDialog((null), "data berhasil dihapus");
        } else {
            JOptionPane.showMessageDialog(fremeMenus, "Sillahkan pilih data yg akan dihapus");
        }
    }
}
