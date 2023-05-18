import java.util.Scanner;

public class Balok {
    static int hitungLuasPermukaan  (int p, int l, int t){
        int hasil = 2 * ((p * l) + (p * t) + (l* t));
        return hasil;
    }
    static int Volume (int p, int l, int t){
        int hasil = p * l * t;
        return hasil;
    }
    
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan panjang: ");
        int p = input.nextInt();
        System.out.print("Masukkan panjang: ");
        int l = input.nextInt();
        System.out.print("Masukkan panjang: ");
        int t = input.nextInt();

        System.out.println();

        System.out.println("tanpa fungsi");

        int luasPermukaan = 2 * ((p*l) + (p*t) + (l*t));{
        System.out.println("Luas permukaan Balok adalah:"  + luasPermukaan);

        int volume = p * l * t;
        System.out.println("Volume Balok adalah : " + volume);
       
        System.out.println("Mengunakan Fungsi ");
        System.out.println("Luas permukaan Balok adalah: " + hitungLuasPermukaan(p, l, t));
        System.out.println("Volume Balok adalah: " + Volume(p, l, t));
    }
    }
}


