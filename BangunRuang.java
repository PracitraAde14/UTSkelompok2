package Bagunruang;



import java.util.Scanner;

public class BangunRuang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for kubus
        System.out.println("Masukkan panjang rusuk kubus: ");
        int rusukKubus = scanner.nextInt();
        Kubus kubus = new Kubus(rusukKubus);

        // Input for balok
        System.out.println("Masukkan panjang balok: ");
        double panjangBalok = scanner.nextDouble();
        System.out.println("Masukkan lebar balok: ");
        double lebarBalok = scanner.nextDouble();
        System.out.println("Masukkan tinggi balok: ");
        double tinggiBalok = scanner.nextDouble();
        Balok balok = new Balok(panjangBalok, lebarBalok, tinggiBalok);

        // Input for silinder
        System.out.println("Masukkan jari-jari silinder: ");
        double jariSilinder = scanner.nextDouble();
        System.out.println("Masukkan tinggi silinder: ");
        double tinggiSilinder = scanner.nextDouble();
        Silinder silinder = new Silinder(jariSilinder, tinggiSilinder);

        // Input for bola
        System.out.println("Masukkan jari-jari bola: ");
        double jariBola = scanner.nextDouble();
        Bola bola = new Bola(jariBola);

        // Output volume dan luas permukaan
        System.out.println("Volume kubus: " + kubus.hitungVolume());
        System.out.println("Luas permukaan kubus: " + kubus.hitungLuasPermukaan());

        System.out.println("Volume balok: " + balok.hitungVolume());
        System.out.println("Luas permukaan balok: " + balok.hitungLuasPermukaan());

        System.out.println("Volume silinder: " + silinder.hitungVolume());
        System.out.println("Luas permukaan silinder: " + silinder.hitungLuasPermukaan());

        System.out.println("Volume bola: " + bola.hitungVolume());
        System.out.println("Luas permukaan bola: " + bola.hitungLuasPermukaan());
    }
}

class Kubus {
    private int rusuk;

    public Kubus(int rusuk) {
        this.rusuk = rusuk;
    }

    public int hitungVolume() {
        return rusuk * rusuk * rusuk;
    }

    public int hitungLuasPermukaan() {
        return 6 * rusuk * rusuk;
    }
}

class Balok {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    public double hitungLuasPermukaan() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
}

class Silinder {
    private final double jari;
    private final double tinggi;

    public Silinder(double jari, double tinggi) {
        this.jari = jari;
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return Math.PI * jari * jari * tinggi;
    }

    public double hitungLuasPermukaan() {
        return 2 * Math.PI * jari * (jari + tinggi);
    }
}

class Bola {
    private final double jari;

    public Bola(double jari) {
        this.jari = jari;
    }

    public double hitungVolume() {
        return (4.0 / 3.0) * Math.PI * jari * jari * jari;
    }

    public double hitungLuasPermukaan() {
        return 4 * Math.PI * jari * jari;
    }
}