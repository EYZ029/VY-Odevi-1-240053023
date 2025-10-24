package Bolum1;

public class Main {
    public static void main(String[] args) {
        RandevuListesi liste = new RandevuListesi();

        Hasta h1 = new Hasta(1, "Enes Çalış", "25.10.2025");
        Hasta h2 = new Hasta(2, "Ayşe Yıldız", "26.10.2025");
        Hasta h3 = new Hasta(3, "Sadık Çetin", "27.10.2025");
        Hasta h4 = new Hasta(4, "Eren Can Nural", "28.10.2025");
        Hasta h5 = new Hasta(6, "Ahmet Yıldız", "29.10.2025");

        liste.randevuEkle(h1);
        liste.randevuEkle(h2);
        liste.acilDurumEkle(h3);
        liste.randevuEkle(h4);
        liste.randevuEkle(h5);

        System.out.println("\nİlk liste:");
        liste.listeyiGoruntule();

        System.out.println("\nHasta arama:");
        liste.randevuAra(2);
        liste.randevuAra(5);

        System.out.println("\nHasta silme:");
        liste.randevuIptal(2);
        liste.randevuIptal(5);
        liste.listeyiGoruntule();

        System.out.println("\nSon liste:");
        liste.listeyiGoruntule();
    }
}
