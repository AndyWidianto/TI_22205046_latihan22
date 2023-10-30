/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package saldo.ti_22205046_latihan28;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author HP
 */
/**
 * Nama : Andy Widianto
 * nim  : 22205046
 * prody: TEKNIK INFORMATIKA
 * @author HP
 */
public class TI_22205046_latihan22 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        double diameter;
        double jarijari, luas, keliling;
        DecimalFormat df = new DecimalFormat("0.00");
     
        
            System.out.println("======Perhitungan Lingkaran======");
            while (true){
            try {
                System.out.print("Masukkan Nilai Diameter Lingkaran : ");
                diameter = scanner.nextDouble();

                if (diameter <= 0) {
                    System.out.println("Nilai diameter tidak sesuai. Diameter harus lebih dari 0.");
                } else {
                    System.out.println("======Hasil Perhitungan Lingkaran======");

                    jarijari = diameter / 2.0;
                    luas = Math.PI * jarijari * jarijari;
                    keliling = Math.PI * diameter;

                    // Menampilkan hasil
                    System.out.println("Jari-jari Lingkaran adalah: " + (int) jarijari + "cm");
                    System.out.println("Luas Lingkaran adalah: " + df.format(luas) + "cm");
                    System.out.println("Keliling Lingkaran adalah: " + df.format(keliling) + "cm\n");
                    break;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Nilai diameter tidak sesuai. Masukkan angka yang valid.");
                scanner.nextLine(); // Membersihkan input yang salah
            }
        }
    }
    
    }

