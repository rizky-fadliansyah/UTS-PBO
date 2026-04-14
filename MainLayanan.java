public class MainLayanan {
    public static void main(String[] args) {
        LayananTransformasi[] layananList = new LayananTransformasi[4];
        layananList[0] = new MadiunMobil("Daffa", 50000);
        layananList[1] = new MadiunMotor("Cristian", 30000);
        layananList[2] = new MadiunMobil("Yoga", 1500);
        layananList[3] = new MadiunMotor("Rizky", 25000);

        for (LayananTransformasi layanan : layananList) {
            System.out.println("Tarif Perjalanan : Rp " + layanan.hitungTarif());
            if (layanan instanceof MadiunMobil) {
                ((MadiunMobil) layanan).prosesTransaksi();
            } else if (layanan instanceof MadiunMotor) {
                ((MadiunMotor) layanan).prosesTransaksi();
            }
            System.out.println("-----------------------------------");
        }
    }

}
