###Encapsulation
#sisi, radius, sama tinggi dibuat  private, dikarenakan di dalam diagram tandanya -. Jadi tidak bisa diubah langsung dari luar kelas, harus lewat getter dan setter (getSisi(), setSisi(), dst).

#Di setiap setter diberikan pengecekan. JIka nilainya 0 atau negatif, nilainya nggak dipakai dan muncul tulisan "Ditolak: ... harus positif". Constructor juga manggil setter, jadi dari awal objek dibuat pun nilainya tetap dicek.

#PHI di Lingkarann dibuat private static final karena di soal disuruh jadiin konstanta kelas.Sedangkan warna di Bentuk dibuat public, dikarenakan di dalam diagram soal tandanya +.

###Inheritance

#BujurSangkar dan Lingkaran menggunakan extends Bentuk. Silinder menggunakan extends Lingkaran, jadi turunannya bertingkat.

#Warna, getWarna(), dan setWarna() diwarisin dari Bentuk, jadi nggak perlu ditulis lagi di kelas anak.

#Constructor tidak ikut diwariskan, jadi tiap kelas anak manggil constructor induknya pakai super(...) di baris pertama. Contohnya super(warna) di Lingkaran dan super(radius, warna) di Silinder.

#Radius itu private di Lingkaran, jadi Silinder nggak bisa akses langsung. Sebagai gantinya, Silinder ngisi radius lewat super(...), dan hitung volume pakai hitungLuas() punya Lingkaran dikali tinggi.

###Polymorphism

#Method printInfo() ditulis ulang menggunakan @Override di tiap kelas anak, jadi tiap kelas nampilin tulisan yang beda.

#Di Main.java dibuat array Bentuk[] yang isinya objek Bentuk, BujurSangkar, Lingkaran, dan Silinder. Pas di-loop dan manggil printInfo(), yang jalan itu printInfo() sesuai jenis objeknya, bukan sesuai tipe variabelnya.