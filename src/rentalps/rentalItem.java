package rentalps;

public class rentalItem {
    private String namaPS;
    private int hargaPerJam;
    private boolean tersedia;
    
    // bagian constructor
    public rentalItem(String namaPS, int hargaPerJam) {
        this.namaPS = namaPS;
        this.hargaPerJam = hargaPerJam;
        this.tersedia = true;
    }
    
    // bagian accessor
    public String getNamaPS() {
        return namaPS;
    }
    
    public int getHargaPerJam(){
        return hargaPerJam;
    }
    
    public boolean isTersedia() {
        return tersedia;
    }
    
    // bagian mutator
    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }
    
    // bagian polymorphism (override)
    @Override
    public String toString() {
        return namaPS + " | Rp" + hargaPerJam +"/jam | " + (tersedia ? "Tersedia" : "Dipinjam");
    }
}
