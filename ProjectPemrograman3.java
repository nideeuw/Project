/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pemrograman;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class ProjectPemrograman3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Program perhitungan nilai ulangan
        int benar,salah,nilai;
        int total = 50;
        
        System.out.println("<<<ULANGAN BAHASA INGGRIS>>>");
        System.out.println(" ");
        System.out.println("Total Seluruh Soal: 50");
        Scanner input = new Scanner (System.in);
        System.out.print("Jumlah soal yang benar: ");
        benar = input.nextInt();
        salah = total-benar;
        System.out.println("Jumlah soal yang salah: "+salah);
        nilai = benar*2;
        System.out.println("Total nilai: "+nilai);
        
        if(nilai>=96){
            System.out.println("Selamat kamu mendapat Grade A+");
        }
        else if(nilai>=92){
            System.out.println("Selamat kamu mendapat Grade A");
        }
        else if(nilai>=86){
            System.out.println("Selamat kamu mendapat Grade B+");
        }
        else if(nilai>=80){
            System.out.println("Selamat kamu mendapat Grade B");
        }
        else if(nilai>=74){
            System.out.println("Selamat kamu mendapat Grade C");
        }else{
            System.out.println("Selamat kamu mendapat Grade D");
            System.out.println("Ditingkatkan lagi ya belajarnya!");
        }
    }
    
}
