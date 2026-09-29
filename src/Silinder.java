public class Silinder extends Lingkaran {
    private double tinggi;

    public Silinder(double tinggi, double radius, String warna) {
        super(radius, warna);
        setTinggi(tinggi);
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double t) {
        if (t > 0) {
            this.tinggi = t;
        } else {
            System.out.println("Ditolak: tinggi harus positif");
        }
    }

    public double hitungVolume() {
        return hitungLuas() * tinggi;
    }

    @Override
    public void printInfo() {
        System.out.println("Silinder warna " + warna + ", volume = " + hitungVolume());
    }
}