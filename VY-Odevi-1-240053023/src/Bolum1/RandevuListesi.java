package Bolum1;

public class RandevuListesi {
    Node head;

    public RandevuListesi() {
        this.head = null;
    }

    public void acilDurumEkle(Hasta hasta) {
        Node yeni = new Node(hasta);
        yeni.sonraki = head;
        head = yeni;
    }

    public void randevuEkle(Hasta hasta) {
        Node yeni = new Node(hasta);
        if (head == null) {
            head = yeni;
            return;
        }
        Node temp = head;
        while (temp.sonraki != null) {
            temp = temp.sonraki;
        }
        temp.sonraki = yeni;
    }

    public void randevuIptal(int hastaID) {
        if (head == null) {
            System.out.println("Randevu listesi boş.");
            return;
        }

        if (head.veri.hastaID == hastaID) {
            head = head.sonraki;
            System.out.println("Hasta " + hastaID + " silindi.");
            return;
        }

        Node temp = head;
        while (temp.sonraki != null && temp.sonraki.veri.hastaID != hastaID) {
            temp = temp.sonraki;
        }

        if (temp.sonraki == null) {
            System.out.println("Hasta bulunamadı.");
        } else {
            System.out.println("Hasta " + hastaID + " silindi.");
            temp.sonraki = temp.sonraki.sonraki;
        }
    }

    public void randevuAra(int hastaID) {
        Node temp = head;
        while (temp != null) {
            if (temp.veri.hastaID == hastaID) {
                temp.veri.bilgileriGoster();
                return;
            }
            temp = temp.sonraki;
        }
        System.out.println("Hasta bulunamadı.");
    }

    public void listeyiGoruntule() {
        if (head == null) {
            System.out.println("Randevu listesi boş.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            temp.veri.bilgileriGoster();
            temp = temp.sonraki;
        }
    }
}