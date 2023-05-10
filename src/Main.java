import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilogram? : ");
        double armutKg = input.nextDouble();

        System.out.print("Elma kaç kilogram? : ");
        double elmaKg = input.nextDouble();

        System.out.print("Domates kaç kilogram? : ");
        double domatesKg = input.nextDouble();

        System.out.print("Muz kaç kilogram? : ");
        double muzKg = input.nextDouble();

        System.out.print("Patlıcan kaç kilogram? : ");
        double patlicanKg = input.nextDouble();

        double toplamTutar = armutKg * armutFiyat +
                elmaKg * elmaFiyat +
                domatesKg * domatesFiyat +
                muzKg * muzFiyat +
                patlicanKg * patlicanFiyat;

        System.out.println("Toplam tutar : " + toplamTutar + "TL");
    }
}