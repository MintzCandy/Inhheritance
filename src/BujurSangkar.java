public class BujurSangkar extends Bentuk {
    private double sisi;

    public BujurSangkar(double sisi, String warna) {
        super(warna);
        setSisi(sisi);
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        if (sisi > 0) {
            this.sisi = sisi;
        } else {
            System.out.println("Ditolak: sisi harus positif");
        }
    }

    public double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public void printInfo() {
        System.out.println("Bujursangkar berwarna " + warna + ", luas = " + hitungLuas());
    }
}