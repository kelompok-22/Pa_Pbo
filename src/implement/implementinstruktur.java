/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package implement;

import java.util.List;
import model.model_instruktur;

/**
 *
 * @author ASUS
 */
public interface implementinstruktur {
    public void insert(model_instruktur I);
    public void update(model_instruktur I);
    public void delete(String id_instruktur);
    
    
    List<model_instruktur> getALLinstruktur();
    List<model_instruktur> getCariNama(String nama);
}
