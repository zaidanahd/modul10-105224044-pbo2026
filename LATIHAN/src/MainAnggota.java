import java.util.*;

class Anggota {
    String idAnggota;
    String nama;
    String tipe;

    public Anggota(String idAnggota, String nama, String tipe) {
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.tipe = tipe;
    }

@Override
public boolean equals(Object o) {
        if (this == o) 
            return true;

        if (o == null || getClass() != o.getClass()) 
            return false;

        Anggota anggota = (Anggota) o;
        return Objects.equals(idAnggota, anggota.idAnggota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAnggota);
    }

    public class MainAnggota {
        public static void main(String[] args) {
            Set<Anggota> daftarAnggota = new HashSet<>();
            daftarAnggota.add(new Anggota("1912", "zaidan", "Dosen"));
            daftarAnggota.add(new Anggota("0512", "iman", "Dosen"));
            daftarAnggota.add(new Anggota("1205", "intan", "Mahasiswa"));
            daftarAnggota.add(new Anggota("1219", "sultan", "Mahasiswa"));

            System.out.println(daftarAnggota.size());
        }
    }
}
