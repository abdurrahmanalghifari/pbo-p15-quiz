package org.pbo.p15.quiz;

import java.util.Scanner;

public class quiz2 {
    
    public static void main(String[] args) {
        String nama, nik, alamat, telp, pekerjaan, kantor, status, menikah, jumlah_anak, input;
        int sampah, keamanan, sumbangan;
        iuran iuran = new iuran();
        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("Pendataan dan Pembayaran Iuran Warga");
        System.out.println("====================================");
        System.out.println("1. Input Data Warga");
        System.out.println("2. Input Iuran Warga");
        System.out.println("");
        System.out.print("PILIHAN MENU : ");
        input = sc.nextLine();
        System.out.println("-------------------oOo------------------");
        if (input.equals("1")) {
            System.out.println("*** Data Warga ***");
            System.out.println("Masukan Nama");
            nama = sc.nextLine();
            System.out.println("Masukan NIK");
            nik = sc.nextLine();
            System.out.println("Masukan Alamat");
            alamat = sc.nextLine();
            System.out.println("Masukan No. Tlp");
            System.out.print("+62 ");
            telp = sc.nextLine();
            // simpan input di object data
            iuran.data(nama, nik, alamat, telp);
            // next step
            System.out.println("-------------------oOo------------------");
            System.out.println("*** Data Pekerjaan ***");
            System.out.println("Masukan Pekerjaan");
            pekerjaan = sc.nextLine();
            System.out.println("Masukan Alamat Kantor");
            kantor = sc.nextLine();
            // simpat input di object data
            iuran.data(pekerjaan, kantor);
            // next step
            System.out.println("-------------------oOo------------------");
            System.out.println("*** Data Status ***");
            System.out.println("Masukan Status");
            status = sc.nextLine();
            System.out.println("Masukan Nama Suami/Istri");
            menikah = sc.nextLine();
            System.out.println("Masukan Jumlah Anak");
            jumlah_anak = sc.nextLine();
            // simpan input di object data
            iuran.data(status, menikah, jumlah_anak);
            // next step
            System.out.println("Lanjut Bayar Iuran ?");
            input = sc.nextLine();
            if (input.equalsIgnoreCase("ya")||input.equalsIgnoreCase("y")) {
                System.out.println("-------------------oOo------------------");
                System.out.println("*** Data Iuran Pokok ***");
                System.out.println("NIK => " + iuran.nik);
                System.out.println("Masukan Iuran Sampah");
                sampah = Integer.parseInt(sc.nextLine());
                System.out.println("Masukan Iuran Keamanan");
                keamanan = Integer.parseInt(sc.nextLine());
                System.out.println("");
                System.out.println("*** Data Iuran Sekunder ***");
                System.out.println("Masukan Sumbangan");
                sumbangan = Integer.parseInt(sc.nextLine());
                System.out.println("Lanjutkan Bayar Iuran ?");
                input = sc.nextLine();
                if (input.equalsIgnoreCase("tidak")) {
                    System.out.println("");
                    String format = "||%1$-30s||%2$-20s\n";
                    System.out.format(format," NIK"," "+iuran.nik);
                    // hitung jumlah total
                    System.out.format(format," Total Pembayaran Iuran Warga"," Rp. "+iuran.data(sampah, keamanan, sumbangan));
                    System.out.println("Terimakasih " + iuran.nama + " Iuran Anda Sudah di Bayarkan");
                } else {
                }

            }
        }
    }
}
