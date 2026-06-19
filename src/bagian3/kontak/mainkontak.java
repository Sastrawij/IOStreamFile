package bagian3.kontak;

public class mainkontak {
    public static void main(String[] args) {
        BukuKontak buku = new BukuKontak("kontak.txt");

        // Input data baru yang sudah dilengkapi alamat email (Soal No. 2)
        buku.tambahkontak(new Kontak("Andi", "0811", "andi@gmail.com"));
        buku.tambahkontak(new Kontak("Budi", "0822", "budi@yahoo.com"));
        buku.tambahkontak(new Kontak("Citra", "0833", "citra@mail.com"));

        System.out.println("=== Menampilkan Kontak Awal ===");
        buku.tampilkanSemua();
        buku.simpanKeBerkas();

        System.out.println("\n--- Memuat Ulang dari Berkas ---");
        BukuKontak bukuBaru = new BukuKontak("kontak.txt");
        bukuBaru.muatDariBerkas();
        bukuBaru.tampilkanSemua();
        System.out.println("Total: " + bukuBaru.jumlahKontak());

        // Menguji Fitur Cari Kontak (Soal No. 1)
        System.out.println("\n=== Menguji Fitur Cari Kontak ===");
        bukuBaru.cariKontak("Budi");
        bukuBaru.cariKontak("Zaki"); // Tes jika nama tidak terdaftar

        // Menguji Fitur Hapus Kontak (Soal No. 3)
        System.out.println("\n=== Menguji Fitur Hapus Kontak ===");
        bukuBaru.hapusKontak("Andi"); // Menghapus kontak Andi
        
        System.out.println("\n=== Hasil Akhir Setelah Dihapus ===");
        bukuBaru.tampilkanSemua();
    }
}