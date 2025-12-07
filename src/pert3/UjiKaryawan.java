package pert3;

class UjiKaryawan {
    public static void main(String[] args) {
        // Tampilkan Header
        System.out.println("=== DATA KARYAWAN TECHMAJU ===");

        // Buat objek Karyawan biasa (Budi)
        Karyawan k1=new Karyawan("Budi Santoso", 4000000);

        // Tampilkan info Karyawan biasa
        System.out.println("Status: Karyawan Biasa");
        k1.tampilInfo();

        System.out.println(); // Baris baru/jarak

        // Buat objek pert3.Manajer (Siti)
        Manajer m1=new Manajer("Siti Aminah", 6000000, 2500000);

        // Tampilkan info pert3.Manajer
        System.out.println("Status: pert3.Manajer");
        m1.tampilInfo();

    }
}