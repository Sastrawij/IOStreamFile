/*
 * Nama : Sukma Sastra Wijaya
 * NPM  : 2410010462
 */
package tugas;

public class MainTugas {
    public static void main(String[] args) {
        String namaFile = "barang.txt";

        // =========================================================================
        // Syarat Tambahan 1: Menyimpan dan menampilkan 3 daftar kategori (Array tetap)
        // =========================================================================
        System.out.println("=== DAFTAR KATEGORI TOKO ===");
        String[] kategori = {"Elektronik", "Sembako", "Pakaian"};
        for (int i = 0; i < kategori.length; i++) {
            System.out.println((i + 1) + ". Kategori: " + kategori[i]);
        }
        System.out.println();

        // =========================================================================
        // Langkah 1: Buat objek Gudang pertama & tambah minimal 5 objek Barang
        // =========================================================================
        System.out.println("=== PROSES AWAL: INPUT & SIMPAN DATA ===");
        Gudang gudangAwal = new Gudang();
        
        gudangAwal.tambahBarang(new Barang("Laptop ASUS", 8500000, 4));
        gudangAwal.tambahBarang(new Barang("Mouse Wireless", 150000, 15));
        gudangAwal.tambahBarang(new Barang("Keyboard Mech", 450000, 8));
        gudangAwal.tambahBarang(new Barang("Monitor 24 Inch", 1750000, 3));
        gudangAwal.tambahBarang(new Barang("Printer Inkjet", 1200000, 5));

        // Syarat Tambahan 2: Simpan seluruh data barang ke berkas teks
        gudangAwal.simpanKeBerkas(namaFile);
        System.out.println();

        // =========================================================================
        // Langkah 2 & Syarat 3: Buat objek Gudang BARU untuk membuktikan data tersimpan
        // =========================================================================
        System.out.println("=== PROSES KEDUAI: MEMUAT DATA DARI BERKAS ===");
        Gudang gudangBaru = new Gudang();
        
        // Muat kembali data dari berkas teks
        gudangBaru.muatDariBerkas(namaFile);
        
        // Tampilkan seluruh datanya ke layar console
        System.out.println("\n--- Tampilan Data Barang di Gudang Baru ---");
        gudangBaru.tampilkanSemua();
        
        // Tampilkan total nilai persediaan barang
        System.out.println("--------------------------------------------------");
        System.out.printf("Total Nilai Persediaan Barang: Rp%,.2f\n", gudangBaru.totalNilai());
        System.out.println("==================================================");
    }
}