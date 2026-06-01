public class Main {
    public static void main(String[] args) {
        SistemGudang gudang = new SistemGudang();

        gudang.tambahBarang("B11", "Sapu", "Furnitur", 15);
        gudang.tambahBarang("B22", "Rak", "Furnitur", 7);
        gudang.tambahBarang("B33", "Lampu", "Elektronik", 20);

        gudang.tambahStok("B11", 10);
        gudang.kurangiStok("B33", 15);
        gudang.kurangiStok("B22", 10);
        gudang.cetakLaporan();
    }
}