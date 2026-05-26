// File: Main.java
public class Main {
    public static void main(String[] args) {
        BioskopService bioskop = new BioskopService();
        
        System.out.println("=== MEMULAI SIMULASI PEMESANAN TIKET BIOSKOP ===\n");

        bioskop.pesanTiket("Zaidan", "F01", "A1");   
        bioskop.pesanTiket("Iman", "F01", "B4");   
        bioskop.pesanTiket("Nopal", "F01", "A1");   
        bioskop.pesanTiket("Paulus", "F01", "C3");   

        bioskop.cetakRiwayat();
    }
}