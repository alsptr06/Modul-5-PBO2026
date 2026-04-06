public class App {
    public static void main(String[] args) throws Exception {
        KamarHotel kamar1 = new KamarHotel("5206", "Deluxe", 3);

        System.out.println("=== KAMAR 1 (SEBELUM VALIDASI) ===");
        kamar1.cetakInfoKamar();

        System.out.println("\n=== UJI SETTER KAMAR 1 ===");
        kamar1.setTipeKamar("Presidential");
        kamar1.setHargaPerMalam(-10000);

        System.out.println("\n=== KAMAR 1 (SETELAH VALIDASI) ===");
        kamar1.cetakInfoKamar();

        KamarHotel kamar2 = new KamarHotel("2805", "Premium", 2, 750000);

        System.out.println("\n=== KAMAR 2 ===");
        kamar2.cetakInfoKamar();

        System.out.println("\n=== UJI PEMESANAN KAMAR 2 (KAPASITAS 2) ===");
        kamar2.pesanKamar(4);
        kamar2.pesanKamar(2);
        kamar2.pesanKamar();

        System.out.println("\n=== PERHITUNGAN TAGIHAN ===");
        kamar1.hitungTotalBayar(2, "PROMO");
        kamar2.hitungTotalBayar(4, "PROMO");

        System.out.println("\n=== STRUK AKHIR ===");
        kamar1.cetakInfoKamar();
        kamar2.cetakInfoKamar();
    }
}
