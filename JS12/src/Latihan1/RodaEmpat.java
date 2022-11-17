//Created by 21343077_Glody Syah Rabbynawa
package Latihan1;

public class RodaEmpat  extends Kendaraan {
    double Naikhargake = 8; // 8 kali

    void hargaAkhir(){
        hargaDasar = hargaDasar + (hargaDasar * Naikhargake);
        System.out.println("Setelah di modifikasi, harga mobil menjadi Rp." + hargaDasar);
    }
}