package org.pbo.p15.quiz;

/**
 *
 * @author 
 */

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Math.abs;

public class quiz1 {

    public static void main(String[] args) {
       ArrayList<distributor> p = new ArrayList();
       Scanner sc = new Scanner(System.in);
       Integer pilihan = 0;
        
       System.out.println("     ---- Distributor PT. Garuda Abadi Group ----");
       System.out.println("     ============================================");
       System.out.println("Silakan Masukkan ID Anda");
       System.out.println("========================");
       
       String cekID, userID;
       Boolean ok;
       
        do {
          
          System.out.print("ID : ");
          userID = sc.nextLine();
          ok = cekID( userID );
          do{
                    /*
                    jika pilih 1, maka input data, 
                    jika 2, maka tampilkan data
                    jika 0 maka keluar sistem
                    */

                    System.out.println("");
                    System.out.println("Pilih Cek Data Barang :");
                    System.out.println("1. Barang Masuk");
                    System.out.println("2. Barang Keluar");
                    System.out.println("0. Exit");
                
                    System.out.print("Masukkan Pilihan data : ");
                    pilihan = sc.nextInt();
                    System.out.println("==========================");
                    System.out.println("");

                    if(pilihan == 1 ){
                        p = barangMasuk ( p );
                    }else if(pilihan == 2){
                        p = barangKeluar ( p );
                    }
                    }while (pilihan != 0);
                     System.out.println("Terimakasih");
                     System.exit(0);
          
        }while(ok == false);
    }
    
    public static ArrayList<distributor> barangMasuk( ArrayList<distributor> p ){ 
        Scanner sc = new Scanner(System.in);
        String nama, nik;
        Integer harga, qty;
        Boolean ok;

        
        System.out.println("Silakan Masukkan Data Anda");
        System.out.println("==========================");
        do{
            System.out.print( "Nama Admin: " );
            nama = sc.nextLine();
            ok = cekNamaAdmin( nama );
//            System.out.println("nama diinput "+nama);
        }while(ok == false);

        
        do{
            System.out.print( "NIK Admin: " );
            nik = sc.nextLine();
            ok = cekNikAdmin( nik );
//            System.out.println("nik diinput "+nik);
        }while(ok == false);
        System.out.println("");
        System.out.println("           *** Pendataan Barang Masuk PT. Garuda Abadi Group ***");
        System.out.println("---------------------------------------------------------------------------");
        String format1 = "||%1$-15s||%2$-20s||%3$-10s||%4$-20s||\n";
        System.out.format(format1, "  Jenis Barang ","     Nama Barang ", "   Jumlah ","       Harga ");
        System.out.println("---------------------------------------------------------------------------");
        String format2 = "||%1$-15s||%2$-20s||%3$-10s||%4$-20s||\n";
        System.out.format(format2, " 1. Buku", " Buku Tulis", " 1 Pak"," Rp. 45.000");
        System.out.format(format2, " 2. Buku", " Buku Gambar", " 1 Pak"," Rp. 10.000");
        System.out.format(format2, " 3. Kertas", " Kertas A4", " 1 Rim"," Rp. 40.000");
        System.out.format(format2, " 4. Bolpen", " Bolpen Biru", " 1 Pak"," Rp. 38.0000");
        System.out.format(format2, " 5. Pensil", " Pensil Raut", " 1 Pak"," Rp. 32.0000");
         System.exit(0);
                
        System.out.print("Harga: ");
        harga = sc.nextInt();
                
        do{
            System.out.print( "Qty: " );
            qty = sc.nextInt();
            ok = cekQty( qty ); //qty method
        }while(ok == false);

        p.add( new distributor( nama, harga, qty ) );

        return p;

    }

    private static boolean cekID (String n){
        boolean ok = false;
        if (n.equalsIgnoreCase("admin123")){
            ok=true;
        } else {
            System.out.println("");
            System.out.println("ID Anda salah -> " + n );
            System.out.println("");
            System.out.println("Administrasi Persediaan Barang Distributor PT. Garuda Abadi Group");
            System.out.println("Cek, Data dan Antar, Ketelitian Anda dalam Administrasi di Utamakan (*_*)");
            System.exit(0);
        }
        return ok;
    }
    
    private static boolean cekNamaAdmin (String n){
        boolean ok = false;
        if (n.equalsIgnoreCase("Anisa")||n.equalsIgnoreCase("test")){
            ok=true;
        } else {
            System.out.println("Nama admin tidak terdaftar");
        }
        return ok;
    }
    
    private static boolean cekNikAdmin (String n){
        boolean ok = false;
        if (n.equalsIgnoreCase("30023509")||n.equalsIgnoreCase("123")){
            ok=true;
        } else {
            System.out.println("NIK admin tidak terdaftar");
        }
        return ok;
    }

    
    private static boolean cekQty (int QtyTotal) {
        boolean ok = false; 
        int minQty = 1;
        if ( QtyTotal >= minQty ){
            ok = true;
        } else {
            System.out.println("Minimal Order QTY : 1");
        }
        return ok;
    }

    private static boolean cekBayar(int total, int bayar) {
        boolean ok = false; 
        
        if ( bayar >= total ){
            ok = true;
        } else {
            System.out.println("Maap duitnya kurang");
        }
        
        return ok;
    }
    
    private static ArrayList<distributor> barangKeluar ( ArrayList<distributor> p ){
        Scanner sc = new Scanner(System.in);
        String nama, tipe, gula;
        Integer harga, qty, total, jumlah, bayar; 
        Boolean ok;        
        total = 0;
        jumlah=0;
        //tampilkan data 
        System.out.println("Jumlah data: "+ p.size()); 
        System.out.println("-----------------------------------------------");
        System.out.printf("| %-3s | %-10s | %-7s | %-3s  | %-7s |", 
                "No",
                "Nama",
                "Harga",
                "Qty",
                "Jumlah");
        System.out.println();
        System.out.println("-----------------------------------------------");
        int n = 1;
        for(int i = 0; i < p.size(); i++ ){

            jumlah =  p.get( i ).getQty() * p.get(i).getHarga();

            System.out.printf("| %-3s | %-10s | %-7s | %-3s  | %-7s |", 
                n++,
                p.get(i).getNama(),
                p.get(i).getHarga(),
                p.get(i).getQty(),
                (p.get(i).getHarga() * p.get(i).getQty()));
            
            total += jumlah;
            System.out.println();
            }
            System.out.println("-----------------------------------------------");
            System.out.println("Total Bayar: "+ total);

            do{
                System.out.print("Bayar: ");
                bayar = sc.nextInt();
                ok = cekBayar( total, bayar );
            }while(ok == false);
    
            p.clear();
    
            System.out.println("Kembalian: "+ abs(jumlah - bayar) );
            System.out.println("Orderan selesai, Terimakasih!!!");
            sc.nextLine();
            

        System.out.println("Tekan enter untuk lanjut...");
        sc.nextLine();
    
        return p;
    }
}

