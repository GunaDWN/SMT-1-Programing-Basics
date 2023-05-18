import java.util.Scanner;

public class Jobsheet3Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float suhu, celcius, reamur, fahrenheit, kelvin;

        System.out.print("Masukan Suhu ");
        suhu = sc.nextFloat();

        celcius = suhu;
        reamur = 4 / 5 * celcius;
        fahrenheit = (9 / 5 * celcius) + 32;
        kelvin = celcius + 273;

        System.out.println("Celcius     : " + celcius + "°");
        System.out.println("Reamur      : " + reamur + "°");
        System.out.println("Fahrenheit  : " + fahrenheit + "°");
        System.out.println("Kelvin      : " + kelvin + "°");
    }

}
