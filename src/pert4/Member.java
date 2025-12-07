package pert4;

class Member extends Customer {
    // TODO: Tambahkan atribut tambahan
    int poin;
    String level;

    // TODO: Buat constructor dengan super
    Member (String namaLengkap, String idCust, int totalBelanja, int poin, String level){
    super(namaLengkap, idCust, totalBelanja);
    this.poin=poin;
    this.level=level;
    }

    @Override
    void tampilkanInfo() {
        // TODO: panggil super, lalu tampilkan data tambahan
        super.tampilkanInfo();
        System.out.println("POin Reward: " +poin+ " | Level: " +level);
    }
}
