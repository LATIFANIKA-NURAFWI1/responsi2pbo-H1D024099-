package pert6;

public class UjiGalaksi {
    public static void main(String[] args) {
        System.out.println("=== UJI SISTEM KENDARAAN GALAKSI ===");
        System.out.println();
        // ==========================================================
        // PEMBUATAN OBJEK
        // ==========================================================

        // TODO:
        // Buat objek PesawatTempur dengan:
        //   nama: "Astra-Fury"
        //   kapasitas: 2
        //   jumlahRudal: 8
        System.out.println("--- PESAWAT TEMPUR ---");
        PesawatTempur pTempur = new PesawatTempur("Astra-Fury", 2, 8);
        
        // TODO:
        // Aktifkan mesin pesawat
        // Pesawat menjelajah 10 km
        // Pesawat menjelajah 30 km
        // Pesawat menembak 3 rudal
        // Tampilkan status pesawat
        pTempur.aktifkanMesin();
        pTempur.jelajah(10);
        pTempur.jelajah(30);
        pTempur.tembakRudal(3);
        pTempur.tampilStatus();
        System.out.println();

        // TODO:
        // Buat objek KapalEksplorasi dengan:
        //   nama: "Voyager X"
        //   kapasitas: 10
        //   modulScan: 4
        System.out.println("--- KAPAL EKSPLORASI ---");
        KapalEksplorasi kEksplorasi = new KapalEksplorasi("Voyager X", 10, 4);

        // ==========================================================
        // PENGUJIAN PERILAKU
        // ==========================================================

        // TODO:
        // Aktifkan mesin kapal eksplorasi
        // Kapal menjelajah 15 km
        // Kapal melakukan scanPlanet("Kepler-442b")
        // Tampilkan status kapal
        kEksplorasi.aktifkanMesin();
        kEksplorasi.jelajah(15);
        kEksplorasi.scanPlanet("Kepler-442b");
        kEksplorasi.tampilStatus();

    }
}

