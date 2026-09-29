public class Lingkaran extends Bentuk {
    private static final double PHI = 3.14; // konstanta kelas
    private double radius;

    public Lingkaran(double radius, String warna) {
        super(warna);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        if (r > 0) {
            this.radius = r;
        } else {
            System.out.println("Ditolak: radius harus positif");
        }
    }

    public double hitungLuas() {
        return PHI * radius * radius;
    }

    @Override
    public void printInfo() {
        System.out.println("Lingkaran " + warna + ", luas = " + hitungLuas());
    }
}