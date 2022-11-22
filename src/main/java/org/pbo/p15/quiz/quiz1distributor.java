package org.pbo.p15.quiz;

import java.text.DecimalFormat;
import java.util.Scanner;

abstract class Barang implements quiz1hitung {
    protected String setNama, setNIK;
    protected int modalAwal = 20000000;
    DecimalFormat df = new DecimalFormat("###,###,##0.00");
    quiz1user user = new quiz1user();
    
    public abstract void list();

    public abstract void data();

}

class barangMasuk extends Barang {
    int masuk, pilihan, total;

    public void hitung() {
        barangKeluar keluar = new barangKeluar();
        Scanner sc = new Scanner(System.in);
        int harga;
        System.out.println("---------------------------------------------------------------------------");
        System.out.print("Pilihan Anda : ");
        pilihan = Integer.parseInt(sc.nextLine());
        if (pilihan == 0) {
            System.out.println("Selesai");
            System.out.println("Total Pemasukan => Rp. " + df.format(total));
            System.out.println("");
            System.out.println("Total Kas       => Rp. " + df.format((modalAwal += total)));
            System.out.println("");
            System.out.println("");
            keluar.list();
            keluar.hitung();
            System.exit(0);
        } else {
            System.out.print("Banyaknya Barang Yang Masuk : ");
            masuk = Integer.parseInt(sc.nextLine());
            System.out.println("Data Tersimpan");
            switch (pilihan) {
                case 1:
                    harga = masuk * 45000;
                    total += harga;
                    System.out.println("Harga Sebesar Rp. " + df.format(harga));
                    System.out.println("---------------------------------------------------------------------------");
                    System.out.println("");
                    hitung();
                    break;
                case 2:
                    harga = masuk * 50000;
                    total += harga;
                    System.out.println("Harga Sebesar Rp. " + df.format(harga));
                    System.out.println("---------------------------------------------------------------------------");
                    System.out.println("");
                    hitung();
                    break;
                case 3:
                    harga = masuk * 40000;
                    total += harga;
                    System.out.println("Harga Sebesar Rp. " + df.format(harga));
                    System.out.println("---------------------------------------------------------------------------");
                    System.out.println("");
                    hitung();
                    break;
                case 4:
                    harga = masuk * 38000;
                    total += harga;
                    System.out.println("Harga Sebesar Rp. " + df.format(harga));
                    System.out.println("---------------------------------------------------------------------------");
                    System.out.println("");
                    hitung();
                    break;
                case 5:
                    harga = masuk * 32000;
                    total += harga;
                    System.out.println("Harga Sebesar Rp. " + df.format(harga));
                    System.out.println("---------------------------------------------------------------------------");
                    System.out.println("");
                    hitung();
                    break;
            }

        }

    }

    @Override
    public void list() {
        System.out.println("");
        System.out.println("           *** Pendataan Barang Masuk PT. Garuda Abadi Group ***");
        System.out.println("---------------------------------------------------------------------------");
        String format1 = "||%1$-15s||%2$-20s||%3$-10s||%4$-20s||\n";
        System.out.format(format1, " Jenis Barang ","     Nama Barang ", "  Jumlah ","       Harga ");
        System.out.println("---------------------------------------------------------------------------");
        String format2 = "||%1$-15s||%2$-20s||%3$-10s||%4$-20s||\n";
        System.out.format(format2, " 1. Buku", " Buku Tulis", " 1 Pak"," Rp. 45.000");
        System.out.format(format2, " 2. Buku", " Buku Gambar", " 1 Pak"," Rp. 50.000");
        System.out.format(format2, " 3. Kertas", " Kertas A4", " 1 Rim"," Rp. 40.000");
        System.out.format(format2, " 4. Bulpen", " Bulpen Biru", " 1 Pak"," Rp. 38.000");
        System.out.format(format2, " 5. Pensil", " Pensil Raut", " 1 Pak"," Rp. 32.000");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("");
    }

    @Override
    public void data() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Silahkan Masukkan Data Anda");
        System.out.println("============================");
        System.out.print("Nama Admin : ");
        setNama = sc.nextLine();
        System.out.print("NIK Admin : ");
        setNIK = sc.nextLine();
        System.out.println("");

    }

}

class barangKeluar extends Barang {
    int pilihan, keluar, total;

    public void hitung() {
        Scanner sc = new Scanner(System.in);
        int harga;
        
        System.out.println("---------------------------------------------------------------------------");
        System.out.print("Pilihan Anda : ");
        pilihan = Integer.parseInt(sc.nextLine());
        if (pilihan == 0) {
            System.out.println("Selesai");
            System.out.println("Total Pengeluaran => Rp. " + df.format(total));
            System.out.println("");
            System.out.println("Sisa Kas dari Total Pengeluaran : Rp. " + df.format((modalAwal -= total)));
            System.out.println("Administrasi Persediaan Barang Distibutor PT. Garuda Abadi Group");
            System.out.println("Cek, Data, dan Antar, Ketelitian Anda dalam Administrasi Sangat Di Utamakan (*_*)");
            System.exit(0);
        } else {
            System.out.print("Banyaknya Barang Yang Keluar : ");
            keluar = Integer.parseInt(sc.nextLine());
            System.out.println("Data Tersimpan");
            switch (pilihan) {
                case 1:
                    harga = keluar * 45000;
                    total += harga;
                    System.out.println("Harga Sebesar Rp. " + df.format(harga));
                    System.out.println("---------------------------------------------------------------------------");
                    System.out.println("");
                    hitung();
                    break;
                case 2:
                    harga = keluar * 50000;
                    total += harga;
                    System.out.println("Harga Sebesar Rp. " + df.format(harga));
                    System.out.println("---------------------------------------------------------------------------");
                    System.out.println("");
                    hitung();
                    break;
                case 3:
                    harga = keluar * 40000;
                    total += harga;
                    System.out.println("Harga Sebesar Rp. " + df.format(harga));
                    System.out.println("---------------------------------------------------------------------------");
                    System.out.println("");
                    hitung();
                    break;
                case 4:
                    harga = keluar * 38000;
                    total += harga;
                    System.out.println("Harga Sebesar Rp. " + df.format(harga));
                    System.out.println("---------------------------------------------------------------------------");
                    System.out.println("");
                    hitung();
                    break;
                case 5:
                    harga = keluar * 32000;
                    total += harga;
                    System.out.println("Harga Sebesar Rp. " + df.format(harga));
                    System.out.println("---------------------------------------------------------------------------");
                    System.out.println("");
                    hitung();
                    break;
            }

        }

    }

    @Override
    public void list() {
        System.out.println("");
        System.out.println("           *** Pendataan Barang Keluar PT. Garuda Abadi Group ***");
        System.out.println("---------------------------------------------------------------------------");
        String format1 = "||%1$-15s||%2$-20s||%3$-10s||%4$-20s||\n";
        System.out.format(format1, " Jenis Barang ","     Nama Barang ", "  Jumlah ","       Harga ");
        System.out.println("---------------------------------------------------------------------------");
        String format2 = "||%1$-15s||%2$-20s||%3$-10s||%4$-20s||\n";
        System.out.format(format2, " 1. Buku", " Buku Tulis", " 1 Pak"," Rp. 45.000");
        System.out.format(format2, " 2. Buku", " Buku Gambar", " 1 Pak"," Rp. 50.000");
        System.out.format(format2, " 3. Kertas", " Kertas A4", " 1 Rim"," Rp. 40.000");
        System.out.format(format2, " 4. Bulpen", " Bulpen Biru", " 1 Pak"," Rp. 38.000");
        System.out.format(format2, " 5. Pensil", " Pensil Raut", " 1 Pak"," Rp. 32.000");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("");
    }

    @Override
    public void data() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Silahkan Masukkan Data Anda");
        System.out.println("===========================");
        System.out.print("Nama Admin : ");
        setNama = sc.nextLine();
        System.out.print("NIK Admin : ");
        setNIK = sc.nextLine();
        System.out.println("");

    }

}

