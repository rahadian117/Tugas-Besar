package soal5;

public class Tiket {
    private String kodeTiket;
    private String film;
    private String jenisTiket;
    private double hargaTiket;
    private int jumlahTiket;

    public Tiket(String kodeTiket, String film,
                 String jenisTiket, double hargaTiket,
                 int jumlahTiket) {
        this.kodeTiket = kodeTiket;
        this.film = film;
        this.jenisTiket = jenisTiket;
        this.hargaTiket = hargaTiket;
        this.jumlahTiket = jumlahTiket;
    }

    public double hitungTotal() {
        return hargaTiket * jumlahTiket;
    }

    public void tampilStruk() {
        System.out.println("================================");
        System.out.println("       DATA PEMESANAN TIKET");
        System.out.println("================================");
        System.out.println("Kode Tiket  : " + kodeTiket);
        System.out.println("Film        : " + film);
        System.out.println("Jenis Tiket : " + jenisTiket);
        System.out.println("Harga       : Rp" + hargaTiket);
        System.out.println("Jumlah      : " + jumlahTiket);
        System.out.println("Total       : Rp" + hitungTotal());
        System.out.println("--------------------------------");
    }
}