package bagian3.kontak;

public class Kontak {
    private final String nama;
    private final String nomor;
    private final String email; // Tambahan Atribut Email (Soal No. 2)

    // Constructor diperbarui untuk menerima nama, nomor, dan email
    public Kontak(String nama, String nomor, String email) {
        this.nama = nama;
        this.nomor = nomor;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public String getNomor() {
        return nomor;
    }

    // Getter untuk Email
    public String getEmail() {
        return email;
    }

    // Method keBaris disesuaikan untuk memisah 3 data dengan titik koma (;)
    public String keBaris() {
        return nama + ";" + nomor + ";" + email;
    }

    // Method info disesuaikan agar menampilkan data email juga
    public String info() {
        return nama + " (" + nomor + ") | Email: " + email;
    }
}