import java.util.Scanner;
public class RekeningBank {
    private float saldo;
    private Scanner scanner = new Scanner(System.in);

    public void setor() {
        float jumlah;
        System.out.println("Masukkan jumlah uang yang ingin disetor: ");
        jumlah = scanner.nextFloat();
        saldo += jumlah;

        if (jumlah > 0) {
            System.out.println("Anda berhasil menyetor uang sebesar: " + jumlah);
        } else {
            System.out.println("Jumlah yang disetor harus lebih besar dari 0.");
        }
    }

    public void info() {
        System.out.println("Saldo saat ini: " + saldo);
    }

    
}
