package day14;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("3 sayı giriniz");
        int sayi = scan.nextInt();
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        
         int min=sayi;

         if (min>sayi1){
             min=sayi1;
         }
         if (min>sayi2){
             min=sayi2;
         }
        System.out.println(min);
        }
    }


