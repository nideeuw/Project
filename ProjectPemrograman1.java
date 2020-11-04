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
public class ProjectPemrograman1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Program Pembelian Tiket kereta api
        Scanner input = new Scanner(System.in);
        
        System.out.println("<<<PT KAI INDONESIA>>>");
        System.out.println(" ");
        System.out.println("Selamat datang!");
        System.out.println("Silahkan memilih tujuan anda terlebih dahulu");
        System.out.println("Tujuan yang tersedia: ");
        System.out.println("1. Malang-Jakarta");
        System.out.println("2. Surabaya-Yogyakarta");
        System.out.println("3. Blitar-Malang");
        System.out.println("4. Bandung-Solo");
        System.out.print("=> ");
        String pilihan = input.next();
        
        switch (pilihan) {
            case "1":
                System.out.println("Selamat Datang di tujuan Malang-Jakarta");
                
                    System.out.println("Waktu keberangkatan yang tersedia: ");
                    String[]waktu = {"08:25","13:10","15:25"};
                    for (int i=0; i<waktu.length; i++){
                        System.out.println(i+" "+waktu[i]);
                    }
                        System.out.print("Pilihan waktu anda: ");
                        int pilihwaktu = input.nextInt();
                        System.out.println("Input Pilihan: "+waktu[pilihwaktu]);
                        
                    System.out.println(" ");
                    System.out.println("Jenis Kereta: ");
                    String[]kereta = {"Gajayana","Bima","Argo Wilis"};
                    for (int a=0; a<kereta.length; a++){
                        System.out.println(a+" "+kereta[a]);
                    }
                        System.out.print("Pilihan kereta anda: ");
                        int pilihkereta = input.nextInt();
                        System.out.println("Input Pilihan: "+kereta[pilihkereta]);
                        
                    System.out.println(" ");    
                    System.out.println("Jenis Kelas: ");
                    String[]kelas = {"Eksekutif","Bisnis","Ekonomi"};
                    for (int b=0; b<kelas.length; b++){
                        System.out.println(kelas[b]);
                    }
                        System.out.print("Pilihan kelas anda: ");
                        String jawaban = input.next();
                        
                        if (jawaban.equalsIgnoreCase("Eksekutif")){
                            int harga = 65000;
                            System.out.println("Harga Tiket: Rp "+harga);
                            System.out.print("Jumlah tiket yang dibeli: ");
                            int jumlah = input.nextInt();
                            int total = jumlah*harga;
                            System.out.println("Total yang harus dibayar: Rp "+total);
                            System.out.print("Masukkan nominal pembayaran: Rp ");
                            int bayar = input.nextInt();
                            int kembalian = bayar-total;
                            System.out.println("Kembalian anda: Rp "+kembalian);
                            if ((bayar<total)){
                                System.out.println("Maaf nominal pembayaran yang anda masukkan kurang");
                                System.out.println("Nominal anda kurang: Rp "+(total-bayar));
                            }
                            
                            System.out.println("TERIMAKASIH");
                            System.out.println("--Selamat Menikmati Perjalanan Anda--");
                        }
                        if (jawaban.equalsIgnoreCase("Bisnis")){
                            int harga = 35000;
                            System.out.println("Harga Tiket: Rp "+harga);
                            System.out.print("Jumlah tiket yang dibeli: ");
                            int jumlah = input.nextInt();
                            int total = jumlah*harga;
                            System.out.println("Total yang harus dibayar: Rp "+total);
                            System.out.print("Masukkan nominal pembayaran: Rp ");
                            int bayar = input.nextInt();
                            int kembalian = bayar-total;
                            System.out.println("Kembalian anda: Rp "+kembalian);
                            if ((bayar<total)){
                                System.out.println("Maaf nominal pembayaran yang anda masukkan kurang");
                                System.out.println("Nominal anda kurang: Rp "+(total-bayar));
                            }
                            
                            System.out.println("TERIMAKASIH");
                            System.out.println("--Selamat Menikmati Perjalanan Anda--");
                        }
                        if (jawaban.equalsIgnoreCase("Ekonomi")){
                            int harga = 25000;
                            System.out.println("Harga Tiket: Rp "+harga);
                            System.out.print("Jumlah tiket yang dibeli: ");
                            int jumlah = input.nextInt();
                            int total = jumlah*harga;
                            System.out.println("Total yang harus dibayar: Rp "+total);
                            System.out.print("Masukkan nominal pembayaran: Rp ");
                            int bayar = input.nextInt();
                            int kembalian = bayar-total;
                            System.out.println("Kembalian anda: Rp "+kembalian);
                            if ((bayar<total)){
                                System.out.println("Maaf nominal pembayaran yang anda masukkan kurang");
                                System.out.println("Nominal anda kurang: Rp "+(total-bayar));
                            }
                            
                            System.out.println("TERIMAKASIH");
                            System.out.println("--Selamat Menikmati Perjalanan Anda--");
                        }
                        break;  
            case "2":
                System.out.println("Selamat Datang di tujuan Surabaya-Yogyakarta");
                
                    System.out.println("Waktu keberangkatan yang tersedia: ");
                    String[]waktu1 = {"08:00","12:10","16:15"};
                    for (int i=0; i<waktu1.length; i++){
                        System.out.println(i+" "+waktu1[i]);
                    }
                        System.out.print("Pilihan waktu anda: ");
                        int pilihwaktu1 = input.nextInt();
                        System.out.println("Input Pilihan: "+waktu1[pilihwaktu1]);
                        
                    System.out.println(" ");
                    System.out.println("Jenis Kereta: ");
                    String[]kereta1 = {"Argo Lawu","Bima","Argo Wilis"};
                    for (int a=0; a<kereta1.length; a++){
                        System.out.println(a+" "+kereta1[a]);
                    }
                        System.out.print("Pilihan kereta anda: ");
                        int pilihkereta1 = input.nextInt();
                        System.out.println("Input Pilihan: "+kereta1[pilihkereta1]);
                        
                    System.out.println(" ");    
                    System.out.println("Jenis Kelas: ");
                    String[]kelas1 = {"Eksekutif","Bisnis","Ekonomi"};
                    for (int b=0; b<kelas1.length; b++){
                        System.out.println(kelas1[b]);
                    }
                        System.out.print("Pilihan kelas anda: ");
                        String jawaban1 = input.next();
                        
                        if (jawaban1.equalsIgnoreCase("Eksekutif")){
                            int harga = 60000;
                            System.out.println("Harga Tiket: "+harga);
                            System.out.print("Jumlah tiket yang dibeli: ");
                            int jumlah = input.nextInt();
                            int total = jumlah*harga;
                            System.out.println("Total yang harus dibayar: Rp "+total);
                            System.out.print("Masukkan nominal pembayaran: Rp ");
                            int bayar = input.nextInt();
                            int kembalian = bayar-total;
                            System.out.println("Kembalian anda: Rp "+kembalian);
                            
                            System.out.println("TERIMAKASIH");
                            System.out.println("--Selamat Menikmati Perjalanan Anda--");
                        }
                        if (jawaban1.equalsIgnoreCase("Bisnis")){
                            int harga = 35500;
                            System.out.println("Harga Tiket: "+harga);
                            System.out.print("Jumlah tiket yang dibeli: ");
                            int jumlah = input.nextInt();
                            int total = jumlah*harga;
                            System.out.println("Total yang harus dibayar: Rp "+total);
                            System.out.print("Masukkan nominal pembayaran: Rp ");
                            int bayar = input.nextInt();
                            int kembalian = bayar-total;
                            System.out.println("Kembalian anda: Rp "+kembalian);
                            
                            System.out.println("TERIMAKASIH");
                            System.out.println("--Selamat Menikmati Perjalanan Anda--");
                        }
                        if (jawaban1.equalsIgnoreCase("Ekonomi")){
                            int harga = 245000;
                            System.out.println("Harga Tiket: "+harga);
                            System.out.print("Jumlah tiket yang dibeli: ");
                            int jumlah = input.nextInt();
                            int total = jumlah*harga;
                            System.out.println("Total yang harus dibayar: Rp "+total);
                            System.out.print("Masukkan nominal pembayaran: Rp ");
                            int bayar = input.nextInt();
                            int kembalian = bayar-total;
                            System.out.println("Kembalian anda: Rp "+kembalian);
                            
                            System.out.println("TERIMAKASIH");
                            System.out.println("--Selamat Menikmati Perjalanan Anda--");
                        }
                    
                        break;                 
            case "3":
                System.out.println("Selamat Datang di tujuan Blitar-Malang");
                
                    System.out.println("Waktu keberangkatan yang tersedia: ");
                    String[]waktu2 = {"07:40","18:10","20:00"};
                    for (int i=0; i<waktu2.length; i++){
                        System.out.println(i+" "+waktu2[i]);
                    }
                        System.out.print("Pilihan waktu anda: ");
                        int pilihwaktu2 = input.nextInt();
                        System.out.println("Input Pilihan: "+waktu2[pilihwaktu2]);
                        
                    System.out.println(" ");
                    System.out.println("Jenis Kereta: ");
                    String[]kereta2 = {"Gajayana","Argo Jati","Argo Wilis"};
                    for (int a=0; a<kereta2.length; a++){
                        System.out.println(a+" "+kereta2[a]);
                    }
                        System.out.print("Pilihan kereta anda: ");
                        int pilihkereta2 = input.nextInt();
                        System.out.println("Input Pilihan: "+kereta2[pilihkereta2]);
                        
                    System.out.println(" ");    
                    System.out.println("Jenis Kelas: ");
                    String[]kelas2 = {"Eksekutif","Bisnis","Ekonomi"};
                    for (int b=0; b<kelas2.length; b++){
                        System.out.println(kelas2[b]);
                    }
                        System.out.print("Pilihan kelas anda: ");
                        String jawaban2 = input.next();
                        
                        if (jawaban2.equalsIgnoreCase("Eksekutif")){
                            int harga = 55000;
                            System.out.println("Harga Tiket: Rp "+harga);
                            System.out.print("Jumlah tiket yang dibeli: ");
                            int jumlah = input.nextInt();
                            int total = jumlah*harga;
                            System.out.println("Total yang harus dibayar: Rp "+total);
                            System.out.print("Masukkan nominal pembayaran: Rp ");
                            int bayar = input.nextInt();
                            int kembalian = bayar-total;
                            System.out.println("Kembalian anda: Rp "+kembalian);
                            
                            System.out.println("TERIMAKASIH");
                            System.out.println("--Selamat Menikmati Perjalanan Anda--");
                        }
                        if (jawaban2.equalsIgnoreCase("Bisnis")){
                            int harga = 25000;
                            System.out.println("Harga Tiket: Rp "+harga);
                            System.out.print("Jumlah tiket yang dibeli: ");
                            int jumlah = input.nextInt();
                            int total = jumlah*harga;
                            System.out.println("Total yang harus dibayar: Rp "+total);
                            System.out.print("Masukkan nominal pembayaran: Rp ");
                            int bayar = input.nextInt();
                            int kembalian = bayar-total;
                            System.out.println("Kembalian anda: Rp "+kembalian);
                            
                            System.out.println("TERIMAKASIH");
                            System.out.println("--Selamat Menikmati Perjalanan Anda--");
                        }
                        if (jawaban2.equalsIgnoreCase("Ekonomi")){
                            int harga = 18000;
                            System.out.println("Harga Tiket: Rp "+harga);
                            System.out.print("Jumlah tiket yang dibeli: ");
                            int jumlah = input.nextInt();
                            int total = jumlah*harga;
                            System.out.println("Total yang harus dibayar: Rp "+total);
                            System.out.print("Masukkan nominal pembayaran: Rp ");
                            int bayar = input.nextInt();
                            int kembalian = bayar-total;
                            System.out.println("Kembalian anda: Rp "+kembalian);
                            
                            System.out.println("TERIMAKASIH");
                            System.out.println("--Selamat Menikmati Perjalanan Anda--");
                        }
                    
                        break;          
            case "4":
                System.out.println("Selamat Datang di tujuan Bandung-Solo");
                
                    System.out.println("Waktu keberangkatan yang tersedia: ");
                    String[]waktu3 = {"06:25","14:10","19:05"};
                    for (int i=0; i<waktu3.length; i++){
                        System.out.println(i+" "+waktu3[i]);
                    }
                        System.out.print("Pilihan waktu anda: ");
                        int pilihwaktu3 = input.nextInt();
                        System.out.println("Input Pilihan: "+waktu3[pilihwaktu3]);
                        
                    System.out.println(" ");
                    System.out.println("Jenis Kereta: ");
                    String[]kereta3 = {"Argo Dwipangga","Bima","Argo Wilis"};
                    for (int a=0; a<kereta3.length; a++){
                        System.out.println(a+" "+kereta3[a]);
                    }
                        System.out.print("Pilihan kereta anda: ");
                        int pilihkereta3 = input.nextInt();
                        System.out.println("Input Pilihan: "+kereta3[pilihkereta3]);
                        
                    System.out.println(" ");    
                    System.out.println("Jenis Kelas: ");
                    String[]kelas3 = {"Eksekutif","Bisnis","Ekonomi"};
                    for (int b=0; b<kelas3.length; b++){
                        System.out.println(kelas3[b]);
                    }
                        System.out.print("Pilihan kelas anda: ");
                        String jawaban3 = input.next();
                        
                        if (jawaban3.equalsIgnoreCase("Eksekutif")){
                            int harga = 65500;
                            System.out.println("Harga Tiket: Rp "+harga);
                            System.out.print("Jumlah tiket yang dibeli: ");
                            int jumlah = input.nextInt();
                            int total = jumlah*harga;
                            System.out.println("Total yang harus dibayar: Rp "+total);
                            System.out.print("Masukkan nominal pembayaran: Rp ");
                            int bayar = input.nextInt();
                            int kembalian = bayar-total;
                            System.out.println("Kembalian anda: Rp "+kembalian);
                            
                            System.out.println("TERIMAKASIH");
                            System.out.println("--Selamat Menikmati Perjalanan Anda--");
                        }
                        if (jawaban3.equalsIgnoreCase("Bisnis")){
                            int harga = 41000;
                            System.out.println("Harga Tiket: Rp "+harga);
                            System.out.print("Jumlah tiket yang dibeli: ");
                            int jumlah = input.nextInt();
                            int total = jumlah*harga;
                            System.out.println("Total yang harus dibayar: Rp "+total);
                            System.out.print("Masukkan nominal pembayaran: Rp ");
                            int bayar = input.nextInt();
                            int kembalian = bayar-total;
                            System.out.println("Kembalian anda: Rp "+kembalian);
                            
                            System.out.println("TERIMAKASIH");
                            System.out.println("--Selamat Menikmati Perjalanan Anda--");
                        }
                        if (jawaban3.equalsIgnoreCase("Ekonomi")){
                            int harga = 27000;
                            System.out.println("Harga Tiket: Rp "+harga);
                            System.out.print("Jumlah tiket yang dibeli: ");
                            int jumlah = input.nextInt();
                            int total = jumlah*harga;
                            System.out.println("Total yang harus dibayar: Rp "+total);
                            System.out.print("Masukkan nominal pembayaran: Rp ");
                            int bayar = input.nextInt();
                            int kembalian = bayar-total;
                            System.out.println("Kembalian anda: Rp "+kembalian);
                            
                            System.out.println("TERIMAKASIH");
                            System.out.println("--Selamat Menikmati Perjalanan Anda--");
                        }
                    
                        break;
            default:
                System.out.println("Maaf pilihan anda tidak tersedia");
                System.out.println("Silahkan memilih ulang dengan pilihan yang tersedia");
                break;
        }
}
}