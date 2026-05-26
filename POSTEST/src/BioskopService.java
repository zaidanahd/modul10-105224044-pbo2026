// File: BioskopService.java
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BioskopService {
    private Map<String, Film> jadwalFilm = new HashMap<>();
    private Set<String> kursiTerpesan = new HashSet<>();
    private List<Transaksi> riwayatTransaksi = new ArrayList<>();

    public BioskopService() {
        jadwalFilm.put("F01", new Film("Avengers: Endgame", 50000));
        jadwalFilm.put("F02", new Film("Inception", 45000));
        jadwalFilm.put("F03", new Film("Spiderman: No Way Home", 55000));
    }

    public void pesanTiket(String nama, String kodeFilm, String kursi) {
        System.out.println("Mencoba memesan -> " + nama + " | Film: " + kodeFilm + " | Kursi: " + kursi);

        if (!jadwalFilm.containsKey(kodeFilm)) {
            System.out.println(" [GAGAL] Kode film " + kodeFilm + " tidak ditemukan.\n");
            return;
        }

        Film filmDipilih = jadwalFilm.get(kodeFilm);

        if (!kursiTerpesan.add(kursi)) {
            System.out.println(" [GAGAL] Kursi " + kursi + " sudah dipesan oleh pelanggan lain!\n");
        } else {
            Transaksi transaksiBaru = new Transaksi(nama, filmDipilih.getJudul(), kursi, filmDipilih.getHarga());
            riwayatTransaksi.add(transaksiBaru);
            System.out.println(" [SUKSES] Tiket berhasil dipesan.\n");
        }
    }
    public void cetakRiwayat() {
        System.out.println("       RIWAYAT TRANSAKSI (AWAL -> AKHIR)        ");
        System.out.println("================================================");
        if (riwayatTransaksi.isEmpty()) {
            System.out.println("Belum ada transaksi sukses.");
        } else {
            for (Transaksi t : riwayatTransaksi) {
                System.out.println(t);
            }
        }
        System.out.println("================================================");
    }
}