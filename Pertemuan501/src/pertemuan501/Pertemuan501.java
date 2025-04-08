/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan501;

/**
 *
 * @author Thesa Dahat
 * TGL : 08-04-2025
 */
public class Pertemuan501 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        jajan pancong = new jajan ();
        //pancong.bentuk = "bulat";
        pancong.setBentuk("bulat");
        pancong.rasa = "tiramisu";
        pancong.harga = 5000;
        pancong.warna = "merah";
        
        System.out.println("Bentuknya: "+pancong.getBentuk());
           
        
    }
    
}

class jajan {
    private String bentuk;
    String warna;
    float harga;
    String rasa;
    
    public void setBentuk(String bnt){
        this.bentuk = bnt;
    }
    public String getBentuk(){
        return this.bentuk; 
    }
}
