/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pabrikan_1302210127;
import java.time.LocalDateTime;

import kendaraan_1302210127.SepedaMotor_1302210127;

/**
 *
 * @author hp
 */
public class YamahaMoi_1302210127 extends SepedaMotor_1302210127{
    private String warnaMotor;
    private LocalDateTime waktuIsiBensin;
    
    public YamahaMoi_1302210127(String warna, String color){
        super(color);
        warnaMotor = warna;
        ukuranTangki = 5;
        waktuIsiBensin = null;
    }
    
    public void jalan_1302213089(){
        String habis = cekKapanHabis_1302213089();
        if (habis != ""){
            System.out.println("Sepeda motor sedang berjalan \nMotor Moi akan habis bensin pada " + habis);
        } else {
            System.out.println("Bensin habis, sepeda motor tidak dapat berjalan");
        }
    }
}