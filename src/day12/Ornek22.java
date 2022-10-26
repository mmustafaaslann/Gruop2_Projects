package day12;

import java.util.Scanner;

public class Ornek22 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" sayı giriniz");
        int sayi = scan.nextInt();




        if ( sayi%2==0 && sayi%3==0 ){
            System.out.println(" sayı 2 ye ve 3 tam bölünür");
        } else if (sayi%2==0) {
            System.out.println("2 ye bölünür");

        } else if (sayi%3==0) {
            System.out.println("3 ebölünür");

        }else {
            System.out.println("hiçbirine bölünmez");
        }

        }

    }


