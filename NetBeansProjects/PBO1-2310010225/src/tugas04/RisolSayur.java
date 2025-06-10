
package tugas04;

public class RisolSayur extends Risol{
    private boolean pedas;
    
    public RisolSayur(int harga, int stok, boolean pedas){
        super("Risol Sayur", harga, stok);
        this.pedas = pedas;
    }
    @Override
    public void info(){
        super.info();
        String rasa = pedas ? "Pedas" : "Tidak Pedas";
        System.out.println("Rasa: " + rasa);
    }
}

