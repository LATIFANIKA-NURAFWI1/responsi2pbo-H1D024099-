package pert4;

public class Customer {
    // TODO: Buatkan atribut
    String namaLengkap;
    String idCust;
    int totalBelanja;

    // TODO: Sediakan constructor
    Customer (String namaLengkap, String idCust, int totalBelanja){
        this.namaLengkap=namaLengkap;
        this.idCust=idCust;
        this.totalBelanja=totalBelanja;
    }
    void tampilkanInfo() {
        // TODO: tampilkan data customer
        System.out.println("Nama: " +namaLengkap+ " | ID: " +idCust+ " | Total Belanja: Rp " +totalBelanja);
    }
}
