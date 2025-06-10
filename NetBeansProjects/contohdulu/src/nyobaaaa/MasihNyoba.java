package nyobaaaa;
public class MasihNyoba {
    private String nama;       // atribut nama risol
    private double harga;      // atribut harga per buah
    private int stok;          // atribut jumlah stok

    public MasihNyoba(String nama, double harga, int stok) {
        this.nama = nama;      // inisialisasi nama
        this.harga = harga;    // inisialisasi harga
        this.stok = stok;      // inisialisasi stok
    }
    
    //accsesor

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    // mutator
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
    

    public void info() {
        System.out.printf(
          "Risol: %s\nHarga: Rp %.0f\nStok: %d pcs\n\n",
          nama, harga, stok);
    }

}
