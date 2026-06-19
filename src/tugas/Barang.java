package tugas;

public class Barang {
    private String nama;
    private double harga;
    private int stok;

    // Constructor
    public Barang(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Getters
    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    // Method untuk mengubah data barang menjadi format baris teks (untuk disimpan ke berkas)
    public String keBaris() {
        return nama + "," + harga + "," + stok;
    }

    // Method untuk menampilkan keterangan detail barang
    public void info() {
        System.out.printf("- %-15s | Harga: Rp%-10.2f | Stok: %d\n", nama, harga, stok);
    }
}