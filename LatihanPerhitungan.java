public class LatihanPerhitungan {
    public static void main(String[] args) {
        //Tipe data
        int saldo = 1000000;
    int setoran = 500000;
    int penarikan = 250000;

    System.out.println("=== SIMULASI TRANSAKSI BANK ===");
    System.out.println("Saldo Awal        : " + saldo);
    System.out.println("Setoran           : " + setoran);

    saldo += setoran;
    System.out.println("Saldo Setelah Setor : " + saldo);

    System.out.println("Penarikan         : " + penarikan);
    saldo -= penarikan;

    System.out.println("Saldo Akhir       : " + saldo);
    }
}
