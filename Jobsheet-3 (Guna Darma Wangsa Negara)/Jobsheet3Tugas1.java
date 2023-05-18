import java.text.Format;

class Jobsheet3Tugas1 {
    public static void main(String[] args) {
        String kampus;
        int tingkat, bilanganBulat;
        char kelas, karakter;
        Boolean statusSkill;
        double bilanganPecahan;

        kampus = "Polinema";
        tingkat = 1;
        kelas = 'Z';
        statusSkill = true;
        bilanganBulat = 10;
        bilanganPecahan = 3.33333;
        karakter = 'C';

        // System.out.print("Saya mahasiswa " + kampus);
        // System.out.println("Kelas " + tingkat + kelas);
        System.out.println("Saya mahasiswa " + kampus + " kelas " + tingkat + kelas);
        System.out.println("Sebelum masuk Polinema saya (" + statusSkill + ") masih menguasai MS office");
        System.out.println("Saya sedang belajar menampilkan nilai :");
        System.out.println("Bilangan bulat : " + bilanganBulat);
        System.out.println("Bilangan pecahan : " + bilanganPecahan);
        System.out.println("Karakter : " + karakter);
    }
}
