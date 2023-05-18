import java.util.Scanner;
public class ArrayDua3_1A7{
    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        int data[][] = new int [4][4];
        int jam [][] = {3, 6, 9, 12};
        int min[][] = {100, 100, 100, 100};
        double total [][] = {0, 0, 0, 0};
        double rata [][] = {0, 0, 0, 0};
        for (int i = 0; i < data.length; i++){
            System.out.printf("Jam %S \n", jam [i]);
            for (int j = 0; j < data[0].length; j++) {
                switch (j) {
                    case 0:
                        System.out.print("Masukkan suhu: ");
                        data [i][j] = scan.nextInt ();
                        break;
                    case 1:
                        System.out.print("Masukkan");
                        break;
                case 2:
                    System.out.print ("Masukkan kelembapan: ");
                    data[i][j] = scan.nextInt ();
                    break;
                }
            }
        }
       
        
    }
}