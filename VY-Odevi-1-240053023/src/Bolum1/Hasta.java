package Bolum1;

public class Hasta {
    int hastaID;
    String adSoyad;
    String randevuTarihi;

    public Hasta(int hastaID, String adSoyad, String randevuTarihi) {
        this.hastaID = hastaID;
        this.adSoyad = adSoyad;
        this.randevuTarihi = randevuTarihi;
    }

    public void bilgileriGoster() {
        System.out.println("Hasta ID: " + hastaID +
                ", Ad Soyad: " + adSoyad +
                ", Randevu Tarihi: " + randevuTarihi);
    }
}