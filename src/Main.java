import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        int sayi = scan.nextInt();
        int toplam = 0;
        for (int i = sayi / 2; i > 0; i--) {
            if (sayi % i == 0)
                toplam += i;
        }
        if (toplam==sayi)
            System.out.println(sayi+" Sayısı mükemmel bir sayıdır.");
        else
            System.out.println(sayi+" Sayısı mükemmel bir sayı değildir.");
    }
}