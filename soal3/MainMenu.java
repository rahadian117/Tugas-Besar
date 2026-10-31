package soal3;

public class MainMenu {
    public static void main(String[] args) {
        Menu menu1 = new Menu(
            "M01", "Nasi Goreng", 18000, "Makanan"
        );

        Menu menu2 = new Menu(
            "M02", "Es Teh", 5000, "Minuman"
        );

        System.out.println("=== MENU 1 ===");
        menu1.tampilMenu();
        System.out.println("Total 2 pesanan: Rp"
            + menu1.hitungHarga(2));

        System.out.println("\n=== MENU 2 ===");
        menu2.tampilMenu();
        System.out.println("Total 3 pesanan: Rp"
            + menu2.hitungHarga(3));
    }
}