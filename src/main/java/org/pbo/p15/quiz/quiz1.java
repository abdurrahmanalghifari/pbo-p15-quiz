package org.pbo.p15.quiz;

import java.util.Scanner;

public class quiz1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pilih, userID;
        quiz1user user = new quiz1user();
        Boolean ok;
        
        System.out.println("\t--- Distributor PT. Garuda Abadi Group ---");
        System.out.println("\t==========================================");
        System.out.println("");
        System.out.println("Silahkan Masukkan ID Anda");
        System.out.println("=========================");

        do{
            System.out.print("ID : ");
            userID = sc.nextLine();
            ok = user.cekID( userID );
            System.out.println("");
            System.out.println("Pilih Cek Data Barang");
            System.out.println("1. Barang Masuk");
            System.out.println("2. Barang Keluar");
            System.out.println("");
            System.out.print("Masukkan Pilihan Data : ");
            pilih = sc.nextLine();
            System.out.println("=========================");
            System.out.println("");

            if (pilih.equals("1")) {
                barangMasuk masuk = new barangMasuk();
                masuk.data();
                masuk.list();
                masuk.hitung();

            } else if (pilih.equals("2")) {
                barangKeluar keluar = new barangKeluar();
                keluar.data();
                keluar.list();
                keluar.hitung();
            }
            }while(ok == false);
    }
}
