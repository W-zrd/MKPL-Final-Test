/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp_mod_06_1302213089_muhammadvikhanmuharram;
import kendaraan_1302213089.SepedaMotor_1302213089;
import pabrikan_1302213089.HandoBaet_1302213089;
import pabrikan_1302213089.YamahaMoi_1302213089;

/**
 *
 * @author hp
 */
public class TP_MOD_06_1302213089_MUHAMMADVIKHANMUHARRAM {

    public static void main(String[] args) {
        SepedaMotor_1302213089 motor = new SepedaMotor_1302213089("merah");
        motor.jalan_1302213089();
        motor.isiTangkiFull_1302213089();
        System.out.println(motor.cekKapanHabis_1302213089());
        motor.jalan_1302213089();
        System.out.println("\n");
        HandoBaet_1302213089 baet = new HandoBaet_1302213089("Hijau", "");
        baet.jalan_1302213089();
        baet.isiTangkiFull_1302213089();
        System.out.println(baet.cekKapanHabis_1302213089());
        baet.jalan_1302213089();
        System.out.println("\n");       
        YamahaMoi_1302213089 moi = new YamahaMoi_1302213089("Hijau", "");
        moi.jalan_1302213089();
        moi.isiTangkiFull_1302213089();
        System.out.println(moi.cekKapanHabis_1302213089());
        moi.jalan_1302213089();
    }
}
