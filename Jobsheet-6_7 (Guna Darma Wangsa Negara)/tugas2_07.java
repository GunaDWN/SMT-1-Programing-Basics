import java.util.Scanner;
public class tugas2_07 {
    public static void main(String []args) {
        Scanner scan = new Scanner (System.in);
        int hargaD, hargaA, jumlahA, jumlahD, total = 0, pemasukan;
        hargaD = 100000;
        hargaA = 50000;
        System.out.print("Masukkan jumlah pengunjung Anak : ");
        jumlahA = scan.nextInt();
        System.out.print("Masukkan jumlah Pengunjung dewasa: ");
        jumlahD = scan.nextInt();

        int i = 0;
        while ( i <= 31) {     iuytrewq     WER567U8OP0;{

        }
             i++;
            if (i % 7 == 0){
                System.out.printf("Pendapatan ke-%d = -\n", i);
                }else {
                pemasukan = (jumlahD * hargaD) + (jumlahA * hargaA);
                System.out.printf("Pendapatan ke-%d = %d\n", i, pemasukan);
                total += pemasukan;
                }
        }
        System.out.println("Total uang pemasukan yang diterima hingga akhir bulan Agustus 2022 sebesar Rp" + total);
    }
}