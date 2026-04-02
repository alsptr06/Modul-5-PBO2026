public class barang {
    private int id;
    private String nama;
    private int harga;
    private int stock;
    private double hargaSatuan;
    private String kategori;

    public barang(int id, String nama) {
        this.id = id;
        this.nama = nama;
        this.stock = 0;
        this.hargaSatuan = 0.0;
        this.kategori = "Belum dikategorikan";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            System.out.println("Stock tidak boleh negatif");
        } else {
            this.stock = stock;
        }
    }

    public double getHargaSatuan() {
        return hargaSatuan;
    }

    public void setHargaSatuan(double harga) {
        if (harga <= 0) {
            System.out.println("Harga tidak boleh kurang dari atau sama dengan nol");
        } else {
            this.hargaSatuan = harga;
        }
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void nambahStock(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah yang ditambah harus lebih dari nol");
        } else {
            this.stock += jumlah;
            System.out.println("Stock berhasil ditambah. Stock sekarang: " + this.stock);
        }
    }

    public void kurangStock(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah yang dikurangi harus lebih dari nol");
        } else if (jumlah > this.stock) {
            System.out.println("Stock tidak cukup! Stock saat ini: " + this.stock);
        } else {
            this.stock -= jumlah;
            System.out.println("Stock berhasil dikurangi. Stock sekarang: " + this.stock);
        }
    }

    public void tampilkanInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("Kategori: " + kategori);
        System.out.println("Harga Satuan: " + hargaSatuan);
        System.out.println("Stock: " + stock);
    }
}