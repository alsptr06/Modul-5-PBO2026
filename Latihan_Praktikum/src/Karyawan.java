class Karyawan {
    //soal 1 : atribut defined
    private String namaKaryawan;
    private char idKaryawan;

    //soal 2 : atribut gaji 
    private double gajiPokok;

    //soal 3 : atribut departemen
    private String departemen;

    //No 1: constructor untuk daftar karyawan 
    public karyawan(String namaKaryawan, char idKaryawan) {
        this.namaKaryawan = namaKaryawan;
        this.idKaryawan = idKaryawan;
    }

    //No 1 : keamaan untuk private stribut karyawanID (getter dan setter) 
    public char getIdKaryawan() {
        return idKaryawan;
    }
    public void setIdKaryawan(char idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    //No 1 : keamaan untuk private stribut karyawanNama (getter dan setter) 
    public String getNamaKaryawan() {
        return namaKaryawan;
    }
    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    // No 2 : keamaan untuk private stribut gajiPokok (getter dan setter)
    public double getGajiPokok() {
        return gajiPokok;
    }
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    //No 3 : keamaan untuk private stribut departemen (getter dan setter)
    public String getDepartemen() {
        return departemen;
    }
    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    //No 2 : gaji pokok tidak boleh negatif
    public void setGajiPokok(double gajiPokok) {
        if (gajiPokok < 0) {
            System.out.println("Gaji pokok tidak boleh negatif");
        } else {
            this.gajiPokok = gajiPokok; 
            System.out.println("Gaji pokok berhasil diupdate");
        }
    }

    //No 3 : keamanan untuk private stribut departemen (getter dan setter)
    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public void displayInfo() {
        System.out.println("Nama Karyawan: " + namaKaryawan);
        System.out.println("ID Karyawan: " + idKaryawan);
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Departemen: " + departemen);
    }

}