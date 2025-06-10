package nyobaaaa;
import java.util.ArrayList;
import java.util.List;
public class YgKedua {
    private List<MasihNyoba> daftarRisol = new ArrayList<>();

    public void tambahRisol(MasihNyoba r) {
        daftarRisol.add(r);
    }

    public void tampilkanMenu() {
        System.out.println("=== MENU WARUNG RISOL ===");
        for (MasihNyoba r : daftarRisol) {
            r.info();
        }
    }

    public static void main(String[] args) {
        MasihNyoba risolKeju  = new MasihNyoba("Risol Keju", 3000, 20);
        MasihNyoba risolSayur = new MasihNyoba("Risol Sayur", 2500, 15);
        MasihNyoba risolMayo = new MasihNyoba("Risol Mayo", 3500, 25);
        MasihNyoba risolAyam = new MasihNyoba("Risol Ayam", 2000, 30);
        MasihNyoba risolDaging = new MasihNyoba("Risol Daging", 4000, 10);
        
        YgKedua warung = new YgKedua();
        warung.tambahRisol(risolKeju);
        warung.tambahRisol(risolSayur);
        warung.tambahRisol(risolMayo);
        warung.tambahRisol(risolAyam);
        warung.tambahRisol(risolDaging);

        warung.tampilkanMenu();
}

}
