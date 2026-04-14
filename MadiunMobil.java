public class MadiunMobil extends LayananTransformasi {
    
    private double BiayaAdmin = 3000 + (13 * 100);
    public MadiunMobil(String namaDriver, double saldoUser) {
        super(namaDriver, saldoUser);
    }

    @Override
    public double hitungTarif() {
        return jarak * 5000;
    }

    public void prosesTransaksi(){
        System.out.println("=== Transaksi oleh RIZKY FALDIANSYAH - 254311013 ===");
        double totaltarif = hitungTarif() + BiayaAdmin;
        if (saldoUser >= totaltarif) {
            System.out.println("Transaksi berhasil!");
            System.out.println("Nama Driver: " + namaDriver);
            System.out.println("Jarak: " + jarak + " km");
            System.out.println("Tarif: Rp " + hitungTarif());
            System.out.println("Biaya Admin: Rp " + BiayaAdmin);
            System.out.println("Total Tarif: Rp " + totaltarif);
            saldoUser -= totaltarif;
            System.out.println("Sisa Saldo: Rp " + saldoUser);
        } else {
            System.out.println("Saldo tidak cukup untuk melakukan transaksi.");
        }
    }

}
