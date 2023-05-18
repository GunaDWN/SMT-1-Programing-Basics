import java.util.Scanner;
public class kelulusan {
    public static void main(String []args) {
        Scanner sc = new Scanner (System.in);
        int [] nilaiAkhir = new int [10];

        for (int i=0; i<10; i++)
        {
            System.out.println("Masukkan nilai Mahasiswa ke-"+ i + ";");
            nilaiAkhir[i]=sc.nextInt();
        {
            if (nilaiAkhir [i]>70)
            {
                System.out.println("mahasiswa ke-" + i + "lulus!");
            }
        }
        }
        
    }
}