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
public class ProjectPemrograman2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Program penjualan laptop (ada diskon)
        String[] laptop = {"Macbook","Asus","Lenovo","Samsung"};
        int[] harga = {550000, 350000, 146000, 225000};
        double total=0,total1=0,diskon=0,bayar=0,kembalian;
        
        System.out.println("<<<TOKO ELEKTRONIK SEMESTA>>");
        System.out.println("--Selamat Datang Selamat Berbelanja--");
        System.out.println("--PEMBELIAN LEBIH DARI 2 AKAN MENDAPATKAN DISKON--");
        System.out.println("Silahkan memilih belanjaan anda");
        for (int a=0; a<laptop.length; a++){
            System.out.println(a+"."+laptop[a]+" dengan harga "+harga[a]);
        }
        System.out.print("Pilihan belanjaan anda: ");
        Scanner input = new Scanner (System.in);
        int pilihan = input.nextInt();
        System.out.println("Input Pilihan: "+laptop[pilihan]);
        System.out.print("Jumlah barang yang dibeli:");
        int jumlah = input.nextInt();
        
        // pertama pengecekan apakah user dapat diskon atau tidak
        
        // lalu get input user untuk pembayaran
        // pengecekan apakah pembayaran user sudah sesuai atau tidak
        
        if (jumlah>2){
            total = harga[pilihan]*jumlah;
            System.out.println("Total belanja: Rp "+total);
            System.out.println("-SELAMAT ANDA MENDAPATKAN DISKON 20%-");
            diskon = 0.2*total;
            total1 = total-diskon;
            System.out.println("Total setelah diskon: Rp "+total1);
            System.out.print("Masukkan nominal pembayaran anda: Rp ");
            bayar = input.nextInt();
            kembalian = bayar-total1;
            System.out.println("Kembalian Anda: Rp "+kembalian);
            System.out.println("--TERIMAKASIH TELAH BERBELANJA DI TOKO KAMI--");
            if ((bayar > total1)) {
                System.out.println("Maaf Nominal Pembayaran Tidak Cukup");
                System.out.println("Nominal Anda Kurang: Rp "+(total1-bayar));
                System.out.println("--TERIMAKASIH TELAH BERBELANJA DI TOKO KAMI--");
            }        
        } else if(jumlah>4){
            total = harga[pilihan]*jumlah;
            System.out.println("Total belanja: Rp "+total);
            System.out.println("-SELAMAT ANDA MENDAPATKAN DISKON 50%-");
            diskon = 0.5*total;
            total1 = total-diskon;
            System.out.println("Total setelah diskon: Rp "+total1);
            System.out.print("Masukkan nominal pembayaran anda: Rp ");
            bayar = input.nextInt();
            kembalian = bayar-total1;
            System.out.println("Kembalian Anda: Rp "+kembalian);
            System.out.println("--TERIMAKASIH TELAH BERBELANJA DI TOKO KAMI--");
            if ((bayar > total1)) {
                 System.out.println("Maaf Nominal Pembayaran Tidak Cukup");
                 System.out.println("Nominal Anda Kurang: Rp "+(total1-bayar));
                 System.out.println("--TERIMAKASIH TELAH BERBELANJA DI TOKO KAMI--");
             }
        } else {
            total = harga[pilihan]*jumlah;
            System.out.println("Total belanja: Rp "+total);
            System.out.println("-MAAF ANDA TIDAK MENDAPATKAN DISKON-");
            System.out.print("Masukkan nominal pembayaran anda: Rp ");
            bayar = input.nextInt();
            kembalian = bayar-total;
            System.out.println("Kembalian Anda: Rp "+kembalian);
            System.out.println("--TERIMAKASIH TELAH BERBELANJA DI TOKO KAMI--");
            if ((bayar > total)) {
                 System.out.println("Maaf Nominal Pembayaran Tidak Cukup");
                 System.out.println("Nominal Anda Kurang: Rp "+(total-bayar));
                 System.out.println("--TERIMAKASIH TELAH BERBELANJA DI TOKO KAMI--");
             }
        }
    }
}
    

