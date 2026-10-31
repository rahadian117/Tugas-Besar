package soal1;

public class Buku {
    private String kodeBuku;
    private String judul;
    private String penulis;
    private double harga;

    public Buku(String kodeBuku, String judul,
                String penulis, double harga) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }

    public void tampilData() {
        System.out.println("Kode Buku : " + kodeBuku);
        System.out.println("Judul     : " + judul);
        System.out.println("Penulis   : " + penulis);
        System.out.println("Harga     : Rp" + harga);
        System.out.println("------------------------");
    }
}

