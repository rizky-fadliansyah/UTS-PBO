abstract class LayananTransformasi {
    protected String namaDriver;
    protected double jarak;
    protected double saldoUser;
    
    public LayananTransformasi(String namaDriver, double saldoUser) {
        this.namaDriver = namaDriver;
        if (jarak <= 0) {
            this.jarak = 1.0;
        } else {
            this.jarak = jarak;
        }
        this.saldoUser = saldoUser;
    }
    public abstract double hitungTarif();
}