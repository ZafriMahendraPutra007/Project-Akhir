/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualanroti;

/**
 *
 * @author zafri
 */
public class bagian {
    
 public static void main (String args[]){
        
    PenjualanRoti user = new PenjualanRoti();
  user.setRoti ("~~Gulung~~");
  user.setJenis ("ROTI GULUNG");
  user.setHarga (15000000);
 System.out.println("==== Penjualan Roti ====");
  System.out.println("Roti : "+ user.getRoti ());
  System.out.println("Jenis : "+user.getJenis());
  System.out.println("Hatga : "+user.getHarga());
    }
}

