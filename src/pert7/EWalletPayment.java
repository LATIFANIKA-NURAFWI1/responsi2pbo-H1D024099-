package pert7;

public class EWalletPayment implements PaymentMethod {

    // TODO: Buat atribut yang diperlukan, misalnya:
    // - nama penyedia layanan (contoh: Dana, OVO, Gopay)
    // - jumlah saldo
    // - nominal transaksi
    private String penydeiaLayanan;
    private double saldo;
    private double nominalTransaksi;

    // TODO: Buat constructor untuk mengisi nilai atribut
    public EWalletPayment(String penydeiaLayanan, double saldo, double nominalTransaksi) {
        this.penydeiaLayanan = penydeiaLayanan;
        this.saldo = saldo;
        this.nominalTransaksi = nominalTransaksi;
    }

    // TODO: Implementasikan semua method yang ada pada interface PaymentMethod

    // Catatan:
    // - Pada method processPayment(), lakukan pengecekan kecukupan saldo
    // - Jika saldo cukup, kurangi saldo lalu tampilkan pesan berhasil
    // - Jika saldo tidak cukup, tampilkan pesan gagal
    @Override
    public String processPayment() {
        if (saldo >= nominalTransaksi) {
            saldo = saldo - nominalTransaksi;
            return "Pembayaran berhasil!";
        } else {
            return "Pembayaran gagal! Saldo tidak cukup.";
        }
    }
    @Override
    public String getPaymentDetails() {
        return "Pembayaran dilakukan melalui " + penydeiaLayanan;
    }
    @Override
    public double getTransactionFee() {
        return 2000.0;
    }
    @Override
    public double getBalance() {
        return saldo;
    }
}

