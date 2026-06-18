package bagian2.bacatulis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LatihanMandiriBacaTulis {
    public static void main(String[] args) {
        String namaBerkas = "hari.txt";

      
        // 1. Tulis 5 nama hari ke dalam berkas hari.txt (satu nama per baris)
        //    lalu baca kembali dan tampilkan ke layar.
        System.out.println("--- Soal 1: Menulis 5 Hari & Membaca Kembali ---");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(namaBerkas))) {
            writer.write("Senin\n");
            writer.write("Selasa\n");
            writer.write("Rabu\n");
            writer.write("Kamis\n");
            writer.write("Jumat\n");
            System.out.println("Berhasil menulis 5 hari pertama ke " + namaBerkas);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis berkas: " + e.getMessage());
        }

        // Baca dan tampilkan isi setelah penulisan pertama
        bacaDanTampilkanBerkas(namaBerkas);
        System.out.println(); // Jeda baris

        // 2. Tambahkan (append) 2 nama hari lagi ke berkas hari.txt tanpa menghapus
        //    isi sebelumnya, lalu tampilkan seluruh isinya.
        System.out.println("--- Soal 2: Menambahkan (Append) 2 Hari Lagi ---");
        // Menggunakan FileWriter(namaBerkas, true) untuk mode append (menambah data)
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(namaBerkas, true))) {
            writer.write("Sabtu\n");
            writer.write("Minggu\n");
            System.out.println("Berhasil menambahkan 2 hari lagi ke " + namaBerkas);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menambah berkas: " + e.getMessage());
        }

        // Baca dan tampilkan seluruh isi setelah di-append
        bacaDanTampilkanBerkas(namaBerkas);
        System.out.println(); // Jeda baris

        // 3. Baca berkas hari.txt lalu hitung dan tampilkan berapa banyak baris 
        //    yang ada di dalamnya.
        System.out.println("--- Soal 3: Menghitung Jumlah Baris ---");
        try (BufferedReader reader = new BufferedReader(new FileReader(namaBerkas))) {
            int jumlahBaris = 0;
            while (reader.readLine() != null) {
                jumlahBaris++;
            }
            System.out.println("Jumlah total baris di dalam berkas " + namaBerkas + " adalah: " + jumlahBaris + " baris.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menghitung baris: " + e.getMessage());
        }
    }

    // Fungsi pembantu (helper method) untuk membaca dan menampilkan isi berkas ke layar
    private static void bacaDanTampilkanBerkas(String namaBerkas) {
        System.out.println("Isi berkas saat ini:");
        try (BufferedReader reader = new BufferedReader(new FileReader(namaBerkas))) {
            String baris;
            while ((baris = reader.readLine()) != null) {
                System.out.println("- " + baris);
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca berkas: " + e.getMessage());
        }
    }
}