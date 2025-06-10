
package tugas04;

public class RisolMayo extends Risol {
    private String saus;
    
    public RisolMayo(int harga, int stok, String saus){
        super("Risol Mayo", harga, stok);
        this.saus = saus;
    }
    
    @Override
    public void info(){
        super.info();
        System.out.println("Saus: " + saus);
    }
}


