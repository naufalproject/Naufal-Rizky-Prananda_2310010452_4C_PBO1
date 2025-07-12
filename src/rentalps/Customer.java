package rentalps;

public class Customer {
    private String nama;
    private int durasi;
    private rentalItem item;

    public Customer(String nama, int durasi, rentalItem item) {
        this.nama = nama;
        this.durasi = durasi;
        this.item = item;
        item.setTersedia(false); // disini bagian dari Encapsulation + Mutator
    }

    public int hitungTotalBayar() {
        return durasi * item.getHargaPerJam(); // disini tidak memerlukan perulangan
    }

    public void tampilkanStruk() {
        System.out.println("===== STRUK RENTAL =====");
        System.out.println("Nama       : " + nama);
        System.out.println("PS         : " + item.getNamaPS());
        System.out.println("Durasi     : " + durasi + " jam");
        System.out.println("Total Bayar: Rp" + hitungTotalBayar());
        System.out.println("========================");
    }
}
