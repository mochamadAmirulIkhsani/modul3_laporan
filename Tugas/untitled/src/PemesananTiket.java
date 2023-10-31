import java.util.Scanner;

/**
 * Kelas untuk sistem pemesanan tiket.
 */
public class PemesananTiket {
    private String acara;
    private int jumlahTiket;
    private double hargaTiket;

    /**
     * Konstruktor untuk menginisialisasi acara dan harga tiket.
     *
     * @param acara       Nama acara yang akan dipesan.
     * @param hargaTiket  Harga tiket per orang.
     */
    public PemesananTiket(String acara, double hargaTiket) {
        this.acara = acara;
        this.hargaTiket = hargaTiket;
    }

    /**
     * Mengatur jumlah tiket yang akan dipesan.
     *
     * @param jumlahTiket Jumlah tiket yang akan dipesan.
     */
    public void setJumlahTiket(int jumlahTiket) {
        this.jumlahTiket = jumlahTiket;
    }

    /**
     * Menghitung total Harga yang tiket yang dibeli
     *
     * @return penghitungan total tiket (harga tiket, jumlah tiket)
     */
    public double hitungTotalHarga(){
        return hargaTiket * jumlahTiket;
    }

    /**
     * Mendapatkan informasi pemesanan tiket.
     *
     * @return Informasi pemesanan tiket (nama acara, jumlah tiket, total harga).
     */
    public String getInfoPemesanan() {
        return "Pemesanan untuk acara " + acara + ": " + jumlahTiket + " tiket dengan total harga "
                + hitungTotalHarga() + " IDR";
    }

    /**
     * Metode utama untuk menguji kelas PemesananTiket.
     *
     * @param args Argumen baris perintah.
     */
    public static void main(String[] args) {
        double hargaTiket = 150000;
        String namaAcara = "FESTIVAL BUDAYA";

        Scanner scanner = new Scanner(System.in);

        System.out.println("----Selamat Datang di Festival Budaya----");
        System.out.println("Harga Tiket = " + hargaTiket);
        System.out.print("Masukkan jumlah tiket yang akan dipesan: ");
        int jumlahTiket = scanner.nextInt();

        PemesananTiket pemesanan = new PemesananTiket(namaAcara, hargaTiket);
        pemesanan.setJumlahTiket(jumlahTiket);

        // Menampilkan informasi pemesanan tiket
        System.out.println(pemesanan.getInfoPemesanan());

        // Menutup Scanner
        scanner.close();
    }
}
