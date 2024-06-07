/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp_mod_06_1302210127_haikal;
import kendaraan_1302210127.SepedaMotor_1302210127;
import pabrikan_1302210127.HandoBaet_1302210127;
import pabrikan_1302210127.YamahaMoi_1302210127;

/**
 *
 * @author w333zard.
 */
public class main {

    public static void main(String[] args) {
        SepedaMotor_1302210127 motor = new SepedaMotor_1302210127("merah");
        motor.jalan_1302213089();
        motor.isiTangkiFull_1302213089();
        System.out.println(motor.cekKapanHabis_1302213089());
        motor.jalan_1302213089();
        System.out.println("\n");
        HandoBaet_1302210127 baet = new HandoBaet_1302210127("Hijau", "");
        baet.jalan_1302213089();
        baet.isiTangkiFull_1302213089();
        System.out.println(baet.cekKapanHabis_1302213089());
        baet.jalan_1302213089();
        System.out.println("\n");       
        YamahaMoi_1302210127 moi = new YamahaMoi_1302210127("Hijau", "");
        moi.jalan_1302213089();
        moi.isiTangkiFull_1302213089();
        System.out.println(moi.cekKapanHabis_1302213089());
        moi.jalan_1302213089();
    }
}
