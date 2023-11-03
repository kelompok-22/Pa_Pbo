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
public class modeltabel_instruktur  extends AbstractTableModel{
    List<model_instruktur> listInstruktur;
    
    public modeltabel_instruktur(List<model_instruktur> listinstruktur){
        this.listInstruktur = listinstruktur;
    }
    
    @Override
    public int getRowCount(){
        return listInstruktur.size();
    }
    
    @Override
    public int getColumnCount(){
        return 4;
    }
    
    @Override
    public String getColumnName(int column){
        switch (column){
            case 0:
                return "id_instruktur";
            case 1:
                return "nama";   
            case 2:
                return "nama_ruangan";
            case 3:
                return "tarian";
            default:
                return null;
            
        }
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        switch (column){
            case 0:
                return listInstruktur.get(row).getId_instruktur();
            case 1:
                return listInstruktur.get(row).getNama(); 
            case 2:
                return listInstruktur.get(row).getNama_ruangan();
            case 3:
                return listInstruktur.get(row).getTarian();
            default:
                return null;
        }
    }
}
