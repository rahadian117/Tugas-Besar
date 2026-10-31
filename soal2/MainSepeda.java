package soal2;

public class MainSepeda {
    public static void main(String[] args) {
        Sepeda sepeda1 = new Sepeda(
            "S001", "Mountain Bike", 3, 15000
        );

        Sepeda sepeda2 = new Sepeda(
            "S002", "Sepeda Lipat", 2, 10000
        );

        sepeda1.tampilData();
        sepeda2.tampilData();
    }
}