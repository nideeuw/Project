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
public class ProjectPemrograman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Program kartu pelajar
       String nama,tempat,bulan,kelamin,alamat,agama;
       int nisn,tanggal,tahun;
       
       Scanner scanner = new Scanner (System.in);
       
       
       System.out.print("Masukkan Nama: ");
       nama = scanner.nextLine();
       System.out.print("Masukkan Jenis Kelamin: ");
       kelamin = scanner.nextLine();
       System.out.print("Masukkan Alamat: ");
       alamat = scanner.nextLine();
       System.out.print("Masukkan Agama: ");
       agama = scanner.nextLine();
       System.out.print("Masukkan Tempat Lahir: ");
       tempat = scanner.next();
       System.out.print("Masukkan Tanggal Lahir: ");
       tanggal = scanner.nextInt();
       System.out.print("Masukkan Bulan Lahir: ");
       bulan = scanner.next();
       System.out.print("Masukkan Tahun Lahir: ");
       tahun = scanner.nextInt();
       System.out.print("Masukkan NISN: ");
       nisn = scanner.nextInt();
       System.out.println("---Proses---");
       System.out.println(" ");
       System.out.println("<<<SMK Telkom Malang>>>");
       System.out.println("Kartu Pelajar");
       System.out.println("-----------------------");
       System.out.println("Nama: "+nama);
       System.out.println("NISN: "+nisn);
       System.out.println("Tempat Tanggal Lahir: "+tempat+" "+tanggal+" "+bulan+" "+tahun);
       System.out.println("Jenis Kelamin: "+kelamin);
       System.out.println("Agama: "+agama);
       System.out.println("Alamat: "+alamat);
       
       
    }
    
}
