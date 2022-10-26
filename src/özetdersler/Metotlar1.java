package özetdersler;

import java.util.Scanner;

public class Metotlar1 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen sayı giriniz");
        int sayi = scan.nextInt();
        System.out.println("sayi tek mi :"+tekCiftMetodu(sayi));

    }
    public static boolean tekCiftMetodu (int sayi){

        boolean result = (sayi%2)==1;
        return result ;
    }
}
