import java.util.Scanner;

public class Jobsheet3Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int barang1, barang2;
        double diskon1, diskon2, hasilDiskon1, hasilDiskon2;

        System.out.print("Masukan harga barang pertama ");
        barang1 = sc.nextInt();
        System.out.print("Masukan warna tanda barang pertama merah (30%=0.3) dan biru (50%=0.5) ");
        diskon1 = sc.nextDouble();
        hasilDiskon1 = barang1 * diskon1;
        System.out.print("Masukan harga barang kedua ");
        barang2 = sc.nextInt();
        System.out.print("Masukan warna tanda barang kedua merah (30%=0.3) dan biru (50%=0.5) ");
        diskon2 = sc.nextDouble();
        hasilDiskon2 = barang2 * diskon2;

        System.out.println("Harga total harga barang pertama : " + hasilDiskon1);
        System.out.println("Harga total harga barang kedua : " + hasilDiskon2);
        System.out.println("Harga total Pembayaran : " + (hasilDiskon1 + hasilDiskon2));

    }

}
