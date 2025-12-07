package pert7;

public class PaymentTest {

    public static void main(String[] args) {

        // TODO:
        // - Buat objek dari EWalletPayment
        // - Panggil method yang telah dibuat untuk menguji fungsionalitas
        // - Tampilkan hasil akhir informasi saldo dan detail pembayaran
        EWalletPayment ewallet = new EWalletPayment("OVO", 150000, 50000);

        // Contoh alur (boleh diikuti atau dimodifikasi oleh praktikan):
        // 1. Menampilkan data sebelum transaksi
        // 2. Memproses pembayaran
        // 3. Menampilkan data setelah transaksi
        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===");

        System.out.printf("Saldo awal: %.0f\n", ewallet.getBalance());
        System.out.println("Memproses pembayaran sebesar 50000...");

        String status = ewallet.processPayment();
        System.out.println(status);

        System.out.printf("Sisa saldo: %.0f\n", ewallet.getBalance());
        System.out.println("Detail Transaksi: " + ewallet.getPaymentDetails());
    }
}


