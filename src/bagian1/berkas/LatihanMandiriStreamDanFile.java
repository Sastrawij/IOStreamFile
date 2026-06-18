package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class LatihanMandiriStreamDanFile {
    public static void main(String[] args) {
        
        // =========================================================================
        // 1. Cek berkas "laporan.txt" dan tampilkan ukurannya jika ada
        // =========================================================================
        System.out.println("--- Soal 1: Cek laporan.txt ---");
        File fileLaporan = new File("laporan.txt");
        
        if (fileLaporan.exists()) {
            System.out.println("Apakah ada? : " + fileLaporan.exists());
            System.out.println("Ukuran (byte) : " + fileLaporan.length());
        } else {
            System.out.println("Apakah ada? : " + fileLaporan.exists());
            System.out.println("Berkas 'laporan.txt' tidak ditemukan.");
        }
        
        System.out.println(); // Jeda baris

        // =========================================================================
        // 2. Buat folder baru bernama "arsip" menggunakan method mkdir()
        // =========================================================================
        System.out.println("--- Soal 2: Membuat folder 'arsip' ---");
        File folderArsip = new File("arsip");
        
        if (folderArsip.mkdir()) {
            System.out.println("Berhasil: Folder 'arsip' telah dibuat.");
        } else {
            System.out.println("Gagal: Folder 'arsip' gagal dibuat atau sudah ada.");
        }
        
        System.out.println(); // Jeda baris

        // =========================================================================
        // 3. Buat file "sementara.txt", cek status, hapus, lalu cek kembali
        // =========================================================================
        System.out.println("--- Soal 3: Manipulasi 'sementara.txt' ---");
        File fileSementara = new File("sementara.txt");
        
        try {
            // Membuat berkas baru
            if (fileSementara.createNewFile()) {
                System.out.println("Berkas 'sementara.txt' berhasil dibuat.");
            } else {
                System.out.println("Berkas 'sementara.txt' sudah ada.");
            }
            
            // Tampilkan status keberadaan sebelum dihapus
            System.out.println("Status keberadaan sebelum dihapus: " + fileSementara.exists());
            
            // Menghapus kembali berkas
            if (fileSementara.delete()) {
                System.out.println("Berkas 'sementara.txt' berhasil dihapus.");
            } else {
                System.out.println("Gagal menghapus berkas.");
            }
            
            // Tampilkan status keberadaan sesudah dihapus
            System.out.println("Status keberadaan sesudah dihapus: " + fileSementara.exists());
            
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}