package day12;

import java.util.Scanner;

public class IfOrnek {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("yaşınızı giriniz");
        int yas =scan.nextInt();

        if (yas<6){
            System.out.println("merhaba bebek");

        } else if (yas<13) {
            System.out.println("merhaba çocuk");

        } else if (yas<=18) {
            System.out.println("merhaba genç");

        } else if (yas<40) {
            System.out.println("yetişkin");

        }else {
            System.out.println("geçerli sayı girniz");
        }
    }
}
