package soal1;

public class MainBuku {
    public static void main(String[] args) {
        Buku buku1 = new Buku(
            "B001", "Pemrograman Java",
            "Andi", 85000
        );

        Buku buku2 = new Buku(
            "B002", "Dasar Python",
            "Budi", 75000
        );

        buku1.tampilData();
        buku2.tampilData();
    }
}