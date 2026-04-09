import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama Tamagotchi: ");
        Tamagotchi tamagotchi = new Tamagotchi(sc.nextLine());

        while (true) {
            tamagotchi.tampilkanStatus();
            System.out.println("1. Beri Makan, 2. Ajak Bermain, 3. Istirahat, 4. Keluar");
            switch (sc.nextInt()) {
                case 1 -> tamagotchi.beriMakan();
                case 2 -> tamagotchi.ajakBermain();
                case 3 -> tamagotchi.istirahat();
                case 4 -> {
                    System.out.println("Selama tinggalkan!");
                    return;
                }
                default -> System.out.println("Aksi tidak valid!");
            }
            tamagotchi.cekKondisi();
            if (tamagotchi.isGameOver()) break;
        }
    }
}