package pertemuan9;

public class Mahasiswa {
    private int usia;
    private static final String peguruanTinggi = "UNISKA";
    
    public void sebutNama(String nama, String kelas){
        String prodi="Teknik Informatika";
        
        System.out.println("Nama: "+nama);
        System.out.println("Prodi: "+prodi);
        System.out.println("Kampus: "+peguruanTinggi);
    }
    
    public static void tahunAjaran(){
        System.out.println("Tahun Ajaran: ");
    }
    
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        
        mhs1.usia = 21;
        mhs1.sebutNama("Ghifan", "4c bjb");
        System.out.println("Usia: "+mhs1.usia);
        
        mhs2.usia = 20;
        mhs2.sebutNama("Raffi", "4c bjb");
        System.out.println("Usia: "+mhs1.usia);
        
        tahunAjaran();
    }
    
}
