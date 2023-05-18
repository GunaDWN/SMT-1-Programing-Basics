import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class TugasPemilihan21 {
    public static void main (String []args){
      int biayaTiket, total;  
      String kelasKereta,kode;
      Scanner rt = new Scanner(System.in);

      System.out.println("Masukkan kode keberangkatan (pg/sg/mg/reg):");
      kode = rt.nextLine();

      if(kode.equals("pg")){
          biayaTiket = 1250000;
          total      = biayaTiket + 50000;
          System.out.println("-----------------------------------");
          System.out.println("kode keberangkatan : pg");
          System.out.println("kelas kereta api   : eksekutif");
          System.out.println("biaya tiket        : " + biayaTiket);
          System.out.println("total bayar        : " + total);
          System.out.println("-----------------------------------");
      }else if(kode.equals("sg")){
         biayaTiket = 1375000;
         total      = biayaTiket + 50000;
         System.out.println("kode keberangkatan :sg");
         System.out.println("kelas kereta api   :bisnis");
         System.out.println("biya tiket         :"+biayaTiket);
         System.out.println("total biaya        :"+total);
      }else if(kode.equalsIgnoreCase("mg")){
        biayaTiket = 2500000;
        total      = biayaTiket + 50000;
         System.out.println("kode keberangkatan :mg");
         System.out.println("kelas kereta api   :eksklusif");
         System.out.println("biaya tiket        :"+biayaTiket);
         System.out.println("total biaya        :"+total);
      }else if(kode.equals("reg")){
        biayaTiket = 3750000;
        total      = biayaTiket + 50000;
         System.out.println("kode keberangkatan :reg");
         System.out.println("kelas kereta api   :premium");
         System.out.println("biaya tiket        :"+biayaTiket);
         System.out.println("total baiya        :"+total);
      }else{
        System.out.println("Kode yang anda masukkan tidak terdeteksi");
      }
    }
}
