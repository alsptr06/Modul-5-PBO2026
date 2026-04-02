public class App {
    public static void main(String[] args) throws Exception {
        barang Barang = new barang(1, "Laptop");

        Barang.setKategori("Elektronik");

        Barang.setHargaSatuan(-15000000);

        Barang.setHargaSatuan(15000000);

        Barang.nambahStock(10);

        Barang.kurangStock(5);

        Barang.tampilkanInfo();
    }
}