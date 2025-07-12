package rentalps;

import java.util.Scanner;
public class RentalSystem {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // ini bagian array didalam ps
        rentalItem[] psList = {
            new rentalItem("PS 5", 15000),
            new rentalItem("PS 4", 10000),
            new rentalItem("PS 3", 8000)
        };
        
        // disini IO sederhana dan bagian perulangan
        System.out.println("Daftar PS yang tersedia:");
        for (int i = 0; i < psList.length; i++) {
            System.out.println((i + 1) + ". " + psList[i]);
        }
        
        try {
            System.out.print("Pilih nomor PS yang ingin disewa: ");
            int pilihan = input.nextInt();
            
            if (pilihan < 1 || pilihan > psList.length || !psList[pilihan - 1].isTersedia()) {
                System.out.println("PS tidak tersedia!");
                return;
            }
            
            input.nextLine(); //buang newline
            System.out.print("Masukkan nama anda: ");
            String nama = input.nextLine();
            
            System.out.print("Durasi sewa (jam): ");
            int durasi = input.nextInt();
            
            // bagian seleksi + error handling
            if (durasi <= 0) {
                throw new IllegalArgumentException("Durasi tidak valid!");
            }
            
            // membuat customer baru
            Customer penyewa = new Customer(nama, durasi, psList[pilihan - 1]);
            penyewa.tampilkanStruk();
            
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan input: " + e.getMessage());
        } finally {
            input.close();
        }
    }
}
