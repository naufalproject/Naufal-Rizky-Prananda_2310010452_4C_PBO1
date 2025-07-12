# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi Rental PS (PlayStation) menggunakan Java sebagai tugas akhir dari mata kuliah Pemrograman Berbasis Objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama pelanggan, pilihan jenis PS (PS3, PS4, atau PS5), dan durasi sewa dalam jam, lalu menghasilkan output berupa struk yang berisi total biaya sewa.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `rentalItem`, `Customer`, dan `RentalSystem` adalah contoh dari class.

```bash
public class rentalItem {
    ...
}

public class Customer {
    ...
}

public class RentalSystem {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `rentalItem ps4 = new rentalItem("PS 4", 10000);` adalah contoh pembuatan object.

```bash
rentalItem ps4 = new rentalItem("PS 4", 10000);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `namaPS`, `hargaPerJam`, `tersedia`, `nama`, `durasi` dan `item` adalah contoh atribut.

```bash
String namaPS, nama;
int hargaPerJam, durasi;
boolean tersedia;
rentalItem item;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `rentalItem` dan `Customer`.

```bash
public rentalItem(String namaPS, int hargaPerJam) {
        this.namaPS = namaPS;
        this.hargaPerJam = hargaPerJam;
        this.tersedia = true;
    }


public Customer(String nama, int durasi, rentalItem item) {
        this.nama = nama;
        this.durasi = durasi;
        this.item = item;
        item.setTersedia(false); 
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setTersedia` adalah contoh method mutator.

```bash
public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNamaPS`, `getHargaPerJam`, dan `isTersedia` adalah contoh method accessor.

```bash
public String getNamaPS() {
        return namaPS;
    }

public int getHargaPerJam(){
        return hargaPerJam;
    }

public boolean isTersedia() {
        return tersedia;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama`, `durasi` dan `item` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private int durasi;
private rentalItem item;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Konsep ini bisa diterapkan lebih lanjut pada pengembangan fitur seperti promo khusus.


9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding.

```bash
@Override
    public String toString() {
        return namaPS + " | Rp" + hargaPerJam +"/jam | " + (tersedia ? "Tersedia" : "Dipinjam");
    }
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. 
```bash
if (durasi <= 0) {
    throw new IllegalArgumentException("Durasi tidak valid!");
}
            
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < psList.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner input = new Scanner(System.in);
System.out.println("Daftar PS yang tersedia:");
        for (int i = 0; i < psList.length; i++) {
            System.out.println((i + 1) + ". " + psList[i]);
        }
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `rentalItem[] psList` adalah contoh penggunaan array.

```bash
 rentalItem[] psList
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
            System.out.print("Pilih nomor PS yang ingin disewa: ");
            int pilihan = input.nextInt();
            
            if (pilihan < 1 || pilihan > psList.length || !psList[pilihan - 1].isTersedia()) {
                System.out.println("PS tidak tersedia!");
                return;
            }
} catch (Exception e) {
            System.out.println("Terjadi kesalahan input: " + e.getMessage());
} finally {
            input.close();
        }
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Naufal Rizky Prananda
NPM: 2310010452
