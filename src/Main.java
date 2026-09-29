public class Main {
    public static void main(String[] args) {


        System.out.println("=== Exercise 1: Bentuk & BujurSangkar ===");
        Bentuk bentuk = new Bentuk("Putih");
        bentuk.printInfo();

        BujurSangkar bs = new BujurSangkar(4, "Merah");
        bs.printInfo();
        bs.setSisi(6);
        System.out.println("Sisi baru = " + bs.getSisi());
        bs.printInfo();
        bs.setSisi(-3); // ditolak oleh validasi
        System.out.println("Warna (diwarisi dari Bentuk) = " + bs.getWarna());


        System.out.println();
        System.out.println("=== Exercise 2: Lingkaran ===");
        Lingkaran lg = new Lingkaran(7, "Biru");
        lg.printInfo();
        lg.setRadius(10);
        System.out.println("Radius baru = " + lg.getRadius());
        lg.printInfo();

     
        System.out.println();
        System.out.println("=== Exercise 3: Silinder ===");
        Silinder sl = new Silinder(10, 3, "Hijau");
        sl.printInfo();
        sl.setTinggi(5);
        System.out.println("Tinggi baru = " + sl.getTinggi());
        System.out.println("Radius (diwarisi dari Lingkaran) = " + sl.getRadius());
        sl.printInfo();

        //POLY
        System.out.println();
        System.out.println("=== Polymorphism ===");
        Bentuk[] daftar = new Bentuk[4];
        daftar[0] = new Bentuk("Putih");
        daftar[1] = new BujurSangkar(4, "Merah");
        daftar[2] = new Lingkaran(7, "Biru");
        daftar[3] = new Silinder(10, 3, "Hijau");

        for (int i = 0; i < daftar.length; i++) {
            daftar[i].printInfo();
        }
    }
}