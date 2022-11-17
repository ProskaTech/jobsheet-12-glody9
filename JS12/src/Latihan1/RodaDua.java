//Created by 21343077_Glody Syah Rabbynawa
package Latihan1;

public class RodaDua  extends Kendaraan{
    double Naikhargake = 0.20; // 0.2 kali

    void hargaAkhir(){
        hargaDasar = hargaDasar + (hargaDasar * Naikhargake);
        System.out.println("Setelah di modifikasi, harga sepeda menjadi Rp." + hargaDasar);
    }
}
