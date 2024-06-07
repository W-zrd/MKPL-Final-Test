/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kendaraan_1302213089;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author hp
 */
public class SepedaMotor_1302213089 {
    private String warnaMotor;
    protected int ukuranTangki;
    private LocalDateTime waktuIsiBensin;
    
    public SepedaMotor_1302213089(String warna){
        warnaMotor = warna;
        ukuranTangki = 3;
        waktuIsiBensin = null;
    }
    
    public void isiTangkiFull_1302213089(){
        waktuIsiBensin = LocalDateTime.now();
    }
    
    public String cekKapanHabis_1302213089(){
        if (waktuIsiBensin != null){
            LocalDateTime waktuHabis = waktuIsiBensin.plusHours(ukuranTangki*1);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            return waktuHabis.format(formatter);
        }
        return "";
    }
    
    public void jalan_1302213089(){
        if (waktuIsiBensin == null){
            System.out.println("Bensin habis, sepeda motor tidak dapat berjalan");
        } else {
            String habis = cekKapanHabis_1302213089();
            System.out.println("Sepeda motor sedang berjalan \nakan habis bensin pada " + habis);
        }
    }
}
