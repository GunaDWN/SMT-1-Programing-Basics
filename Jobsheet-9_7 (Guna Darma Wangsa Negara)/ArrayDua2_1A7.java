import java.util.Scanner;
public class ArrayDua2_1A7{
    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        String [][] pengunjung = new String [2][7];
        for (int baris = 0; baris < pengunjung.length; baris++){
            for (int kolom = 0; kolom < pengunjung[0].length; kolom++){
                System.out.printf("Masukkan pengunjung ke [%S] [%S] : ", baris, kolom);
                pengunjung [baris][kolom] = scan.nextLine () ;
            }
            
        }
        
        
    }
}