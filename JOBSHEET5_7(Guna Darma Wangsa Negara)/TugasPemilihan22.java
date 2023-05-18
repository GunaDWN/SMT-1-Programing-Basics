import java.util.Scanner;
public class TugasPemilihan22 {
    public static void main (String [] args){
        String menu,pilih,pilih2;
        double   sisi1, sisi2, alas1, tinggi1, tinggi2, jari;
        int total1,total2,total3,total4;
        Scanner dwn = new Scanner(System.in);

        System.out.print("pilih menu (1 = luas atau 2 = volume) :");
        menu = dwn.nextLine();

        if(menu.equals("1")){
           System.out.println("a.Persegi");
           System.out.println("b.Segitiga");

           System.out.print("Pilih bangun (A atau B): ");
           pilih = dwn.nextLine();
           
           if(pilih.equalsIgnoreCase("A")){
             System.out.print("masukkan nilai sisi: ");
             sisi1 = dwn.nextDouble();
             total1 = (int)(sisi1*sisi1);
             System.out.println("Hasil luas persegi :"+total1+" m2" );
           }else if(pilih.equalsIgnoreCase("B")){
            System.out.print("Masukkan nilai alas: ");
            alas1 = dwn.nextDouble();
            System.out.print("Masukkan nilai tinggi: ");
            tinggi1 = dwn.nextDouble();
            total2 = (int)(alas1*tinggi1)/2;
            System.out.println("Hasil luas segitiga :"+total2 + " m2");
           }else{
            System.out.println("kode anda salah");
           }
        }else if(menu.equals("2")){
          System.out.println("a.Kubus");
          System.out.println("b.Tabung");

          System.out.println("Pilih bangun (A atau B): ");
          pilih2 = dwn.nextLine();

          if(pilih2.equalsIgnoreCase("A")){
            System.out.print("Masukkan nilai sisi: " );
            sisi2 = dwn.nextDouble();
            total3 = (int)(sisi2*sisi2*sisi2);
            System.out.println("Hasil volume kubus: "+ total3 + " m3");
          }else if(pilih2.equalsIgnoreCase("B")){
            System.out.print("Masukkan nilai tinggi: ");
            tinggi2 = dwn.nextDouble();
            System.out.println("Masukkan nilai jari- jari: ");
            jari = dwn.nextDouble();

            total4 = (int)((3.14*jari*jari)*tinggi2);
            System.out.println("Hasil Volume tabung: "+ total4 + " m3");
          }else{
            System.out.println("Kode anda salah");
          }
          }else{
            System.out.println("Kode anda salah");
        }
    }
}
