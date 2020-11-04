/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119053.latihan34.oo.kalkulator;

import java.util.Scanner;
import kalkulator.Kalkulator;
/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * Kelas : PBOIF2
 * NIM   : 10119053
 * Deskripsi Program : Program ini berisi program kalkulator
 */
public class PBOIF210119053Latihan34OOKalkulator {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Kalkulator kal = new Kalkulator();
        
        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan Angka ke-1 : ");
        kal.value1 = input.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        kal.value2 = input.nextDouble();
        System.out.println("");
        
        System.out.println("Hasil Pertambahan : " + kal.tambahBilangan());
        System.out.println("Hasil Pengurangan : " + kal.kurangBilangan());
        System.out.println("Hasil Perkalian : " + kal.kaliBilangan());
        System.out.println("Hasil Pembagian : " + kal.bagiBilangan());
        System.out.println("Hasil Sisa : " + kal.sisaBilangan());
    }
    
}
