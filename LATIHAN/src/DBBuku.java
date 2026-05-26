import java.util.HashMap;
import java.util.Map;

class Buku {
    String isbn;
    String judul;
   
    public Buku(String isbn, String judul) {
        this.isbn = isbn;
        this.judul = judul;
    }
}
public class DBBuku{
    public static void main(String[] args) {
        Map<String, Buku> daftarBuku = new HashMap<>();

        daftarBuku.put("1111", new Buku("1111", "Pemrograman Java"));
        daftarBuku.put("2222", new Buku("2222", "Pemrograman C++"));
        daftarBuku.put("3333", new Buku("3333", "Pemrograman C"));
    }
}
