
package tugas04;

public class Risol {
    private String nama;
    private int harga;
    private int stok;

    // Konstruktor
    public Risol(String nama, int harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Getter
    public String getNama() { return nama; }
    public int getHarga() { return harga; }
    public int getStok() { return stok; }

    // Setter
    public void setNama(String nama) { this.nama = nama; }
    public void setHarga(int harga) { this.harga = harga; }
    public void setStok(int stok) { this.stok = stok; }

    // Method info umum
    public void info() {
        System.out.println(nama + " - Rp" + harga + " (Stok: " + stok + ")");
    }
}

