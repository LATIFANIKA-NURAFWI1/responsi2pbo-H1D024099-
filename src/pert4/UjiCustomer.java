package pert4;

public class UjiCustomer {
    public static void main(String[] args) {

        // TODO: Buat object pert4.Customer
        Customer c1=new Customer("Budi Santoso", "CST-001", 500000);

        // TODO: Buat object pert4.Member
        Member m1=new Member("Siti Aminah", "MBR-110", 1250000, 240, "Gold");

        // TODO: Tampilkan judul data pelanggan
        System.out.println("=== DATA CUSTOMER BELANJAKU ===");

        // TODO: Tampilkan info untuk pert4.Customer biasa
        System.out.println("Status: pert4.Customer Biasa");
        c1.tampilkanInfo();

        // TODO: Tampilkan info untuk pelanggan pert4.Member
        System.out.println("\nStatus: pert4.Member");
        m1.tampilkanInfo();
    }
}
