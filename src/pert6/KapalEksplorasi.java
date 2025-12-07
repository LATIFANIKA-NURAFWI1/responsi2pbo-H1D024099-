package pert6;

public class KapalEksplorasi extends KendaraanGalaksi {

    // ==========================================================
    // ATRIBUT KHUSUS
    // ==========================================================

    // TODO:
    // private int modulScan   // kemampuan scan planet (level 1–5)
    private int modulScan;

    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================

    // TODO:
    // Constructor menerima:
    //   - namaKendaraan
    //   - kapasitasPenumpang
    //   - modulScan
    public KapalEksplorasi(String namaKendaraan, int kapasitasPenumpang, int modulScan) {
        super(namaKendaraan, kapasitasPenumpang);
        this.modulScan=modulScan;
    }

    // ==========================================================
    // IMPLEMENTASI ABSTRACT METHOD
    // ==========================================================

    // @Override aktifkanMesin()
    // Jika energi < 15 → "Energi tidak mencukupi untuk memulai ekspedisi!"
    // Jika cukup → "Kapal eksplorasi siap berangkat!"
    @Override
    void aktifkanMesin() {
        // Tidak boleh jalan jika energi < 15% [cite: 69]
        if (getLevelEnergi() < 15) {
            System.out.println("Energi tidak mencukupi untuk memulai ekspedisi!");
        } else {
            System.out.println("Kapal eksplorasi siap berangkat!");
        }
    }

    // @Override jelajah(int jarak)
    // Konsumsi energi: 2% per 1 km (lebih efisien).
    // Jika cukup → kurangi energi & tampilkan jarak perjalanan.
    @Override
    void jelajah(int jarak) {
        int energiDibutuhkan=jarak*2;

        if (getLevelEnergi()>=energiDibutuhkan) {
            ubahEnergi(-energiDibutuhkan);
            System.out.println("Kapal eksplorasi menjelajah sejauh " + jarak + " km");
        } else {
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh " + jarak + " km");
        }
    }

    // @Override isiEnergi(int jumlah)
    // Tambah energi secara bertahap sampai 100%.
    // Tampilkan pesan pengisian.
    @Override
    void isiEnergi(int jumlah) {
        ubahEnergi(jumlah);
        System.out.println("Energi kapal diisi ulang");
    }

    // ==========================================================
    // METHOD KHUSUS
    // ==========================================================

    // TODO:
    // void scanPlanet(String namaPlanet)
    // Tampilkan:
    // "Melakukan scan pada planet [namaPlanet] dengan modul level [modulScan]."
    void scanPlanet(String namaPlanet) {
        System.out.println("Melakukan scan pada planet " + namaPlanet + " dengan modul level " + modulScan);
    }
}

