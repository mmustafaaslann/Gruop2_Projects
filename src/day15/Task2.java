package day15;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int sayi = scan.nextInt();


        System.out.println(sayi%2==0 ? "çift sayı" : "tek sayı " );
    }
}

