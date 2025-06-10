package tugas02;
import java.util.ArrayList;
import java.util.List;
public class WarungRisol {
     private List<Risol> daftarRisol = new ArrayList<>();

    public void tambahRisol(Risol r) {
        daftarRisol.add(r);
    }

    public void tampilkanMenu() {
        System.out.println("=== MENU WARUNG RISOL ===");
        for (Risol r : daftarRisol) {
            r.info();
        }
    }

    public static void main(String[] args) {
        Risol risolMayo  = new Risol("Risol Mayo", 3000, 20);
        Risol risolSayur = new Risol("Risol Sayur", 2500, 15);

        WarungRisol warung = new WarungRisol();
        warung.tambahRisol(risolMayo);
        warung.tambahRisol(risolSayur);

        warung.tampilkanMenu();
        
        System.out.println("Risol Mayo: " + risolMayo.getNama());
            risolMayo.setStok(30);
            
            System.out.println("Stok setelah diubah: " + risolMayo.getStok());
    }

}
