/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author lndra
 */
public class Identitas {
    String Nama, Alamat, Tahun;
    public Identitas(){}
    
    public Identitas (String nm, String almat, String thn){
        setData (nm, almat, thn);        
    }

    Identitas(String idNama, String idAlamat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Identitas(String idTahun) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        private void setData (String nm, String almat, String thn){
            Nama = nm;
            Alamat = almat;
            Tahun = thn;
        }
       
}
