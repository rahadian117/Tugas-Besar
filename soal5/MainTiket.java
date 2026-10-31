package soal5;

import java.util.ArrayList;

public class MainTiket {
    public static void main(String[] args) {
        ArrayList<Tiket> daftarTiket = new ArrayList<>();

        daftarTiket.add(new Tiket(
            "T001", "Avengers", "Reguler", 40000, 2
        ));

        daftarTiket.add(new Tiket(
            "T002", "Interstellar", "VIP", 75000, 1
        ));

        daftarTiket.add(new Tiket(
            "T003", "Inside Out", "Reguler", 35000, 3
        ));

        double totalPendapatan = 0;

        for (Tiket tiket : daftarTiket) {
            tiket.tampilStruk();
            totalPendapatan += tiket.hitungTotal();
        }

        System.out.println("Jumlah transaksi: "
            + daftarTiket.size());

        System.out.println("Total seluruh penjualan: Rp"
            + totalPendapatan);
    }
}