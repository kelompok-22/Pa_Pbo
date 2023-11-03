/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package implement;


import java.util.List;
import model.model_daftaranggota;
/**
 *
 * @author ASUS
 */
public interface implemenbuktidaftar {
    public void insert(model_daftaranggota A);
    public void update(model_daftaranggota A);
    
    
    List<model_daftaranggota> getALLBuktidaftar();
    
    
}
