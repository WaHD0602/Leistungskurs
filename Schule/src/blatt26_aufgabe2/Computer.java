package blatt26_aufgabe2;

public class Computer {

    private String gpu;
    private String cpu;
    private String mainboard;
    private double ram;
    private double memory;
    private String cpuKuehler;
    private String netzteil;

    public void specs() {
        System.out.println("Grafikkarte ist " + this.gpu + ", Prozessor ist " + this.cpu + ", Mainboard ist " + this.mainboard + ", Arbeitsspeicher ist " + this.ram + "Gb, Speicher ist " + this.memory + "Gb, Prozessor Kühler ist " + this.cpuKuehler + ", Netzteil ist " + this.netzteil);
    }

    public static void main (String[] args) {

    }
}
