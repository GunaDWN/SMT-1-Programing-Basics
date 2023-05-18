import java.util.Scanner;
public class CekPrimaRekursif{
    static int cekBilangan(int n, int m){
        int pembagi = m-1;
        if (pembagi == 1){
            return (1);
        } else {
            return (n%pembagi) * cekBilangan(n, m-1);
        }
    }
    static void cekPrima(int n,int angka){
        if (angka != 0){
            System.out.println("Angka " + n + " adalah bilangan PRIMA");
        } else {
            System.out.println("Angka " + n + " BUKAN bilangan prima");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b, bilangan;

        System.out.print("Masukkan nilai (n) : ");
        b = input.nextInt();

        bilangan = cekBilangan(b, b);

        cekPrima(b, bilangan);
    }
}