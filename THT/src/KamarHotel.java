class KamarHotel {

    private String nomorKamar;
    private String tipeKamar;
    private int kapasitasMaksimal;
    private double hargaPerMalam;
    private boolean isTersedia;

    public KamarHotel(String nomorKamar, String tipeKamar, int kapasitasMaksimal) {
        this.nomorKamar = nomorKamar;
        setTipeKamar(tipeKamar);
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.hargaPerMalam = 0.0;
        this.isTersedia = true;
    }

    public KamarHotel(String nomorKamar, String tipeKamar, int kapasitasMaksimal, double hargaPerMalam) {
        this.nomorKamar = nomorKamar;
        setTipeKamar(tipeKamar);
        this.kapasitasMaksimal = kapasitasMaksimal;
        setHargaPerMalam(hargaPerMalam);
        this.isTersedia = true;
    }

    public String getNomorKamar() {
        return nomorKamar;
    }

    public String getTipeKamar() {
        return tipeKamar;
    }

    public int getKapasitasMaksimal() {
        return kapasitasMaksimal;
    }

    public double getHargaPerMalam() {
        return hargaPerMalam;
    }

    public boolean isTersedia() {
        return isTersedia;
    }

    public void setTipeKamar(String tipeKamar) {
        if (tipeKamar.equalsIgnoreCase("Reguler") ||
                tipeKamar.equalsIgnoreCase("Premium") ||
                tipeKamar.equalsIgnoreCase("Suite")) {

            if (tipeKamar.equalsIgnoreCase("Reguler")) {
                this.tipeKamar = "Reguler";
            } else if (tipeKamar.equalsIgnoreCase("Premium")) {
                this.tipeKamar = "Premium";
            } else {
                this.tipeKamar = "Suite";
            }

        } else {
            System.out.println("PERINGATAN: Tipe kamar '" + tipeKamar +
                    "' tidak valid! Harus 'Reguler', 'Premium', atau 'Suite'.");
            System.out.println("Sistem otomatis mengubah ke 'Reguler'.");
            this.tipeKamar = "Reguler";
        }
    }

    public void setHargaPerMalam(double hargaPerMalam) {
        if (hargaPerMalam >= 50000) {
            this.hargaPerMalam = hargaPerMalam;
        } else {
            System.out.println("PERINGATAN: Harga Rp" + hargaPerMalam + " terlalu rendah WOY! Minimal Rp50000.");
            System.out.println("Sistem otomatis mengubah harga ke Rp50000.");
            this.hargaPerMalam = 50000.0;
        }
    }

    public void pesanKamar() {
        if (isTersedia) {
            isTersedia = false;
            System.out.println("Pemesanan berhasil YEYYY! Kamar " + nomorKamar +" telah dibooking.");
        } else {
            System.out.println("GAGAL!!!!!! Kamar " + nomorKamar +" sudah terisi");
        }
    }

    public void pesanKamar(int jumlahTamu) {
        if (!isTersedia) {
            System.out.println("GAGAL: Kamar " + nomorKamar +" sudah terisi.");
            return;
        }

        if (jumlahTamu > kapasitasMaksimal) {
            System.out.println("GAGAL: Jumlah tamu (" + jumlahTamu + " orang) melebihi kapasitas maksimal (" + kapasitasMaksimal + " orang)!");
            System.out.println("SISTEM MENOLAK PESANAN - OVERCAPACITY WEEEEEEEEE!!!!");
            return;
        }

        isTersedia = false;
        System.out.println("Pemesanan berhasil! Kamar " + nomorKamar +
                " untuk " + jumlahTamu + " tamu telah dipesan.");
    }

    public void batalPesan() {
        if (!isTersedia) {
            isTersedia = true;
            System.out.println("Pembatalan berhasil! Kamar " + nomorKamar + " kini Jadi kosong lagi");
        } else {
            System.out.println("Kamar " + nomorKamar + " belum dipesan.");
        }
    }

    public double hitungTotalBayar(int jumlahMalam) {
        double total = hargaPerMalam * jumlahMalam;
        System.out.println("Total tagihan (" + jumlahMalam + " malam): Rp" + total);
        return total;
    }

    public double hitungTotalBayar(int jumlahMalam, String kodeVoucher) {
        double total = hargaPerMalam * jumlahMalam;

        boolean isVoucherValid = kodeVoucher.equals("PROMO");
        boolean isMinMalamMet = jumlahMalam >= 3;

        if (isVoucherValid && isMinMalamMet) {
            double diskon = total * 0.20;
            double totalSetelahDiskon = total - diskon;

            System.out.println("Voucher PROMO berhasil digunakan!");
            System.out.println("Harga normal: Rp" + total);
            System.out.println("Diskon 20%  : Rp" + diskon);
            System.out.println("Total bayar : Rp" + totalSetelahDiskon);

            return totalSetelahDiskon;

        } else {
            System.out.println("Voucher '" + kodeVoucher + "' gagal digunakan:");

            if (!isVoucherValid) {
                System.out.println("Kode voucher tidak valid");
            }
            if (!isMinMalamMet) {
                System.out.println("Minimal menginap 3 malam sedangkan (Anda hanya menginap: " + jumlahMalam + " malam)");
            }

            System.out.println("Total tagihan anda (belum diskon): Rp" + total);
            return total;
        }
    }

    public void cetakInfoKamar() {
        System.out.println("----------------------------------------");
        System.out.println("INFORMASI KAMAR HOTEL PERTAMINA SIMPRUG");
        System.out.println("----------------------------------------");
        System.out.println("Nomor Kamar      : " + nomorKamar);
        System.out.println("Tipe Kamar       : " + tipeKamar);
        System.out.println("Kapasitas Maks   : " + kapasitasMaksimal + " orang");
        System.out.println("Harga/Malam      : Rp" + hargaPerMalam);

        String status = isTersedia ? "TERSEDIA" : "TERISI";
        System.out.println("Status           : " + status);
        System.out.println("----------------------------------------");
    }
}