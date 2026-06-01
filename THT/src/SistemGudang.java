import java.util.*;

class SistemGudang {
    private Map<String, Barang> databaseBarang;
    private Set<String> kategoriUnik;
    private List<String> riwayatAktivitas;

    public SistemGudang(){
        this.databaseBarang = new HashMap<>();
        this.kategoriUnik = new HashSet<>();
        this.riwayatAktivitas = new ArrayList<>();
    }

    public void tambahBarang(String idBarang, String NamaBarang, String kategori, int stok){
        if (databaseBarang.containsKey(idBarang)){
             Barang barang = new Barang(idBarang, NamaBarang, kategori, stok);
        databaseBarang.put(idBarang, barang);
        kategoriUnik.add(kategori);
        riwayatAktivitas.add("Menambah barang dengan ID: " + idBarang);
        }else{
            riwayatAktivitas.add("gagal daftar: " + idBarang + " sudah ada");
        }
    }

    public void tambahStok (String idBarang, int jumlah){
        Barang barang = databaseBarang.get(idBarang);
        if (barang != null) {
             barang.setStok(barang.getStok() + jumlah);
            riwayatAktivitas.add("Barang Masuk: " + idBarang + " ditambah sebanyak " + jumlah + " unit");
        }else{
            riwayatAktivitas.add("gagal nambah stok: " + idBarang + " tidak ada");
        }
    }

       public void kurangiStok(String idBarang, int jumlah){
        Barang barang = databaseBarang.get(idBarang);
        if (barang == null){
            riwayatAktivitas.add("Gagal Kurang Stok: " + idBarang + " tidak ada");
            System.out.println("Gagal: " + idBarang + " tidak ada");
            return;
        }
        if (barang.getStok() >= jumlah){
            barang.setStok(barang.getStok() - jumlah);
            riwayatAktivitas.add("Barang Keluar: " + idBarang + " dikurangi " + jumlah + " unit");
        }else{
            riwayatAktivitas.add("Kurang Stok: " + idBarang + " stok tidak cukup (Sisa: " + barang.getStok() + ", barang diminta: " + jumlah + ")");
            System.out.println("Gagal: Stok " + idBarang + " tidak cukup.");
        }
    }

    public void cetakLaporan(){
        System.out.println("DAFTAR KATEGORI UNIK");
        for (String kat : kategoriUnik) {
            System.out.println("- " + kat);
        }

        System.out.println("SISA STOK BARANG");
        for (Barang b : databaseBarang.values()){
            System.out.println(b.getidBarang() + " - " + b.getNamaBarang() + " (" + b.getKategori() + ") : " + b.getStok() + " unit");
        }

        System.out.println("RIWAYAT AKTIVITAS TRANSAKSI");
        for (String riwayat : riwayatAktivitas){
            System.out.println("- " + riwayat);
        }
    }
}
