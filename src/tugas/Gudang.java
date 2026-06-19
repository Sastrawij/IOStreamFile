package tugas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Gudang {
    private ArrayList<Barang> daftarBarang;

    // Constructor
    public Gudang() {
        this.daftarBarang = new ArrayList<>();
    }

    // Method menambahkan barang
    public void tambahBarang(Barang b) {
        daftarBarang.add(b);
    }

    // Method menampilkan semua barang
    public void tampilkanSemua() {
        if (daftarBarang.isEmpty()) {
            System.out.println("Gudang kosong.");
        } else {
            for (Barang b : daftarBarang) {
                b.info();
            }
        }
    }

    // Method menyimpan seluruh data barang ke berkas teks
    public void simpanKeBerkas(String namaBerkas) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(namaBerkas))) {
            for (Barang b : daftarBarang) {
                writer.write(b.keBaris());
                writer.newLine();
            }
            System.out.println("Berhasil: Semua data barang telah disimpan ke " + namaBerkas);
        } catch (IOException e) {
            System.out.println("Gagal menyimpan ke berkas: " + e.getMessage());
        }
    }

    // Method memuat/membaca kembali data dari berkas teks
    public void muatDariBerkas(String namaBerkas) {
        // Membersihkan daftar lama sebelum memuat data baru
        daftarBarang.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(namaBerkas))) {
            String baris;
            while ((baris = reader.readLine()) != null) {
                // Memisah data berdasarkan tanda koma
                String[] data = baris.split(",");
                if (data.length == 3) {
                    String nama = data[0];
                    double harga = Double.parseDouble(data[1]);
                    int stok = Integer.parseInt(data[2]);
                    
                    // Masukkan ke array list gudang
                    daftarBarang.add(new Barang(nama, harga, stok));
                }
            }
            System.out.println("Berhasil: Data berhasil dimuat dari berkas " + namaBerkas);
        } catch (IOException e) {
            System.out.println("Gagal memuat dari berkas: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Format data berkas rusak: " + e.getMessage());
        }
    }

    // Method menghitung total nilai seluruh aset barang (harga * stok)
    public double totalNilai() {
        double total = 0;
        for (Barang b : daftarBarang) {
            total += b.getHarga() * b.getStok();
        }
        return total;
    }
}