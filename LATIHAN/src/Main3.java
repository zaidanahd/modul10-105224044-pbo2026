import java.util.LinkedList;

public class Main3 {

    public static void tampilkanAntrean(LinkedList<String> antrean, String event) {
        System.out.println("--- " + event + " ---");
        System.out.println("Isi Antrean (format idAnggota#isbn):");
        if (antrean.isEmpty()) {
            System.out.println("(Antrean Kosong)");
        } else {
            for (String data : antrean) {
                System.out.println("- " + data);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        LinkedList<String> antreanPeminjaman = new LinkedList<>();

        System.out.println("=== MEMULAI SIMULASI ANTREAN PEMINJAMAN ===\n");
        tampilkanAntrean(antreanPeminjaman, "Awal");

        String data1 = "1205#1111"; 
        antreanPeminjaman.addLast(data1);
        tampilkanAntrean(antreanPeminjaman, "Simulasi 1 (Mahasiswa Intan masuk)");

        String data2 = "0512#2222";
        antreanPeminjaman.addFirst(data2);
        tampilkanAntrean(antreanPeminjaman, "Simulasi 2 (Dosen Iman masuk - Memotong ke depan)");

        String data3 = "1219#3333";
        antreanPeminjaman.addLast(data3);
        tampilkanAntrean(antreanPeminjaman, "Simulasi 3 (Mahasiswa Sultan masuk)");

        String data4 = "1912#1111";
        antreanPeminjaman.addFirst(data4);
        tampilkanAntrean(antreanPeminjaman, "Simulasi 4 (Dosen Zaidan masuk - Memotong ke depan)");

        System.out.println("=== SIMULASI SELESAI ===");
        System.out.println("Antrean Final siap diproses.");
    }
}