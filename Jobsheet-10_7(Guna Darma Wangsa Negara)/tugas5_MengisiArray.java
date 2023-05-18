package jobsheet10.fungsi1;

import java.util.Scanner;

public class tugas5_MengisiArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] A = new int[11];
        

        for (int i = 0; i < A.length; i++) {
            System.out.print((i+1) + " ");
            A[i] = input.nextInt();
            i++;

        }

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
