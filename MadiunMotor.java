public class MadiunMotor extends LayananTransformasi {
    public MadiunMotor(String namaDriver, double saldoUser) {
        super(namaDriver, saldoUser);
    }

    @Override
    public double hitungTarif() {
        return jarak * 2500;
    }

    public void prosesTransaksi(){
        System.out.println("=== Transaksi oleh RIZKY FALDIANSYAH - 254311013 ===");
        double totaltarif = hitungTarif();
        if (saldoUser >= totaltarif) {
            System.out.println("Transaksi berhasil!");
            System.out.println("Nama Driver: " + namaDriver);
            System.out.println("Jarak: " + jarak + " km");
            System.out.println("Tarif: Rp " + totaltarif);
            saldoUser -= totaltarif;
            System.out.println("Sisa Saldo: Rp " + saldoUser);
        } else {
            System.out.println("Saldo tidak cukup untuk melakukan transaksi.");
        }
    }

}
