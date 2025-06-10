
package tugas03;
import java.util.ArrayList;
import java.util.List;
public class WarungRisol {
     private List<tugas03.Risol> daftarRisol = new ArrayList<>();

    public void tambahRisol(tugas03.Risol r) {
        daftarRisol.add(r);
    }

    public void tampilkanMenu() {
        System.out.println("=== MENU WARUNG RISOL ===");
        for (tugas03.Risol r : daftarRisol) {
            r.info();
        }
    }

    public static void main(String[] args) {
        tugas03.Risol risolMayo  = new tugas03.Risol("Risol Mayo", 3000, 20);
        tugas03.Risol risolSayur = new tugas03.Risol("Risol Sayur", 2500, 15);

        tugas03.WarungRisol warung = new tugas03.WarungRisol();
        warung.tambahRisol(risolMayo);
        warung.tambahRisol(risolSayur);

        warung.tampilkanMenu();
        
        System.out.println("Risol Mayo: " + risolMayo.getNama());
            risolMayo.setStok(30);
            
            System.out.println("Stok setelah diubah: " + risolMayo.getStok());
    }

}
