import java.util.Scanner;
public class DoWhileCuti1A07 {
    public static void main (String []args) {
        Scanner scan = new Scanner (System.in);
        int cuti = 5;
        char konfirmasi;

        do {
            System.out.print("Apakah Anda menggunakan jatah cuti 1 hari (y/t) ? ");
            konfirmasi = scan.next ().charAt(0);
            if (konfirmasi == 'y' || konfirmasi == 'y') {
                cuti--;
                System.out.printf("Sisa %d hari\n", cuti);
                if (cuti == 2) {
                    System.out.println("Stop! Jatah cuti tinggal 2 hari");
                    break;
                }
            }
        } while (cuti > 0);
    }
}