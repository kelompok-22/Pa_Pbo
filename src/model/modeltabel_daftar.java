/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author ASUS
 */
public class modeltabel_daftar extends AbstractTableModel{
    List<model_daftaranggota> listdaftar;
    
    public modeltabel_daftar(List<model_daftaranggota> listdaftar){
        this.listdaftar = listdaftar;
    }
    
    @Override
    public int getRowCount(){
        return listdaftar.size();
    }
    
    @Override
    public int getColumnCount(){
        return 5;
    }
    
    @Override
    public String getColumnName(int column){
        switch (column){
            case 0:
                return "kode_daftar";
            case 1:
                return "tanggal_mendaftar";   
            case 2:
                return "namaanggota";
            case 3:
                return "no_telpon";
            case 4:
                return "tarian";
            default:
                return null;
            
        }
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        switch (column){
            case 0:
                return listdaftar.get(row).getKode_pendaftaran();
            case 1:
                return listdaftar.get(row).getTanggal_mendaftar(); 
            case 2:
                return listdaftar.get(row).getNamaanggota();
            case 3:
                return listdaftar.get(row).getNo_telpon();
            case 4:
                return listdaftar.get(row).getTarian();
            default:
                return null;
        }
    }
}

    
