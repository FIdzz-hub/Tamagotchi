public class Tamagotchi {
    private String nama;
    private int lapar, bahagia, energi;
    private boolean isGameOver;

    public Tamagotchi(String nama) {
        this.nama = nama;
        lapar = bahagia = energi = 50;
    }

    public void beriMakan() {
        if (!isGameOver) {
            lapar = Math.max(0, lapar - 20);
            energi = Math.max(0, energi - 5);
            System.out.println(nama + " makan dan merasa lebih kenyang!");
        }
    }

    public void ajakBermain() {
        if (!isGameOver && energi > 0) {
            bahagia = Math.min(100, bahagia + 20);
            energi -= 10;
            System.out.println(nama + " bermain dan merasa lebih bahagia!");
        }
    }

    public void istirahat() {
        if (!isGameOver && energi < 100) {
            energi = Math.min(100, energi + 20);
            bahagia = Math.max(0, bahagia - 5);
            System.out.println(nama + " istirahat dan merasa lebih segar!");
        }
    }

    public void tampilkanStatus() {
        System.out.println("Nama: " + nama);
        System.out.println("Lapar: " + (lapar += 5));
        System.out.println("Bahagia: " + (bahagia -= 2));
        System.out.println("Energi: " + (energi -= 1));
    }

    public void cekKondisi() {
        if (lapar >= 100 || bahagia <= 0) {
            System.out.println(nama + " mati!");
            isGameOver = true;
        } else if (energi <= 0) {
            System.out.println(nama + " tertidur!");
            energi = 50;
        }
    }

    public boolean isGameOver() {
        return isGameOver;
    }
}