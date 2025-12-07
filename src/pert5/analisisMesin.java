package pert5;

class analisisMesin {
    public static void main(String[] args) {

        // Buat array untuk menyimpan berbagai jenis mesin
        defaultMesin[] data = new defaultMesin[5];

        // Isi array dengan objek mesinMotor
        data[0] = new mesinMotor("Honda Supra X", 125, "Bebek");
        data[3] = new mesinMotor("Yamaha R25", 250, "Sport");

        // Isi array dengan objek mesinTraktor
        data[1] = new mesinTraktor("Kubota MX5200", 520, 5.0);

        // Isi array dengan objek mesinTraktorListrik
        data[2] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70);
        data[4] = new mesinTraktorListrik("Volta FarmX", 200, 3.5, 80);


        System.out.println("=== DATA MESIN MEGATECH ===");
        // Loop untuk menampilkan info masing-masing mesin
        for (defaultMesin mesin : data) {
            mesin.tampilInfo();

        // Loop untuk menampilkan kategori dan performa
            System.out.println("Kategori: " + mesin.kategoriMesin());
            System.out.println("Performa: " + mesin.nilaiPerforma());
            System.out.println();
        }


        System.out.println("\n=== SUARA MESIN ===");
        // Loop untuk menghasilkan suara tiap mesin (instanceof)
        for (defaultMesin mesin : data) {
            if (mesin instanceof mesinTraktorListrik) {
                ((mesinTraktorListrik) mesin).suaraMesin();
            } else if (mesin instanceof mesinMotor) {
                ((mesinMotor) mesin).suaraMesin();
            } else if (mesin instanceof mesinTraktor) {
                ((mesinTraktor) mesin).suaraMesin();
            }
        }


        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");
        // Logika menemukan mesin dengan performa tertinggi
        defaultMesin best = data[0];
        for (defaultMesin mesin : data) {
            if (mesin.nilaiPerforma() > best.nilaiPerforma()) {
                best = mesin;
            }
        }
        System.out.println(best.namaMesin + " -> " + best.nilaiPerforma());


        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");
        // Logika sorting 3 performa tertinggi
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j].nilaiPerforma() < data[j + 1].nilaiPerforma()) {
                    // Tukar posisi
                    defaultMesin temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + data[i].namaMesin + " -> " + data[i].nilaiPerforma());
        }
    }
}

