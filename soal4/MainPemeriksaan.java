package soal4;

import java.util.ArrayList;

public class MainPemeriksaan {
    public static void main(String[] args) {
        ArrayList<Pemeriksaan> daftar =
            new ArrayList<>();

        daftar.add(new Pemeriksaan(
            "P001", "Andi", "Dr. Budi", 100000
        ));

        daftar.add(new Pemeriksaan(
            "P002", "Siti", "Dr. Rina", 150000
        ));

        daftar.add(new Pemeriksaan(
            "P003", "Doni", "Dr. Budi", 125000
        ));

        double totalSemua = 0;

        for (Pemeriksaan p : daftar) {
            p.tampilData();
            totalSemua += p.hitungTotal();
        }

        System.out.println("Jumlah pemeriksaan: "
            + daftar.size());

        System.out.println("Total seluruh biaya: Rp"
            + totalSemua);
    }
}