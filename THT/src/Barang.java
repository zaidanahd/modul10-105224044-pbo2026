class Barang {
    private String idBarang;
    private String NamaBarang;
    private String kategori;
    private int stok; 

    public Barang(String idBarang, String NamaBarang, String kategori, int stok){
        this.idBarang = idBarang;
        this.NamaBarang = NamaBarang;
        this.kategori = kategori;
        this.stok = stok;
    }

    public String getidBarang(){
        return idBarang;
    }
    public String getNamaBarang(){
        return NamaBarang;
    }
    public String getKategori(){
        return kategori;
    }
    public int getStok(){
        return stok;
    }
    public void setStok(int stok){
        this.stok = stok;
    }
}
