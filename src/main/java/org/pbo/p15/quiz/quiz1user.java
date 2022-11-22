package org.pbo.p15.quiz;

public class quiz1user {
    
        private String n = "admin123";
//        private String nAdmin = "Anisa";
//        private String nNik = "3003509";
        
        boolean ok = false;
        
        boolean cekID (String n){
        if (this.n.equals(n)){
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
        
//        boolean setNama (String nAdmin){
//        if (this.nAdmin.equals(nAdmin)){
//            ok=true;
//        } else {
//            System.out.println("");
//            System.out.println("Nama Admin Anda salah -> " + nAdmin );
//            System.out.println("");
//        }
//        return ok;
//    }
//        boolean setNik (String nNik){
//        if (this.nNik.equals(nNik)){
//            ok=true;
//        } else {
//            System.out.println("");
//            System.out.println("NIK Anda salah -> " + nNik );
//            System.out.println("");
//            
//        }
//        return ok;
//    }
}
