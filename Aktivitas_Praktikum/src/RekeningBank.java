public class RekeningBank {
    private char noRekening;
    private float saldo;

    public RekeningBank(char noRekening, float saldo) {
        this.noRekening = noRekening;
        setSaldo(saldo);
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldoB) {
        if (saldoB < 0) {
            System.out.println("Saldo tidak boleh negatif");
        } else {
            this.saldo = saldoB; 
            System.out.println("Saldo berhasil diupdate");
        }
    }
}