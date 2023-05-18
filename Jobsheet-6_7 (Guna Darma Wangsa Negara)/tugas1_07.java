import java.util.Scanner;
public class tugas1_07{
    public static void main(String []args) {
        Scanner scan = new Scanner (System.in);

        int batas;
        System.out.print("Masukkan batas angka :");
        batas = scan.nextInt();

        for (int i = 1; i <= batas ; i++) {
            if (i%13 !=0) {
                System.out.print(i+ " ");
            }
        }

    }
    
}