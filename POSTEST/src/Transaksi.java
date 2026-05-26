// File: Transaksi.java
public class Transaksi {
    private String namaPemesan;
    private String judulFilm;
    private String nomorKursi;
    private double harga;

    public Transaksi(String namaPemesan, String judulFilm, String nomorKursi, double harga) {
        this.namaPemesan = namaPemesan;
        this.judulFilm = judulFilm;
        this.nomorKursi = nomorKursi;
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "Pemesan: " + namaPemesan + 
               " | Film: " + judulFilm + 
               " | Kursi: " + nomorKursi + 
               " | Harga: Rp" + harga;
    }
}