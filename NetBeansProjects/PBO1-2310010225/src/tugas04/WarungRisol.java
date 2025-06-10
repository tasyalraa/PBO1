
package tugas04;

public class WarungRisol {
   public static void main(String[] args){
       
       Risol risolMayo = new RisolMayo(3000, 8, "Mayonnaise");
       Risol risolSayur = new RisolSayur(2500, 12, true);
       
       Risol[] daftarRisol = { risolMayo, risolSayur };
       
       System.out.println("== MENU WARUNG RISOL ==");
       for (Risol r : daftarRisol){
           r.info();
           System.out.println("-----------------------");
       }
   }
}


