package day13;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        String str = "Mustafa";
        String str1 = "Mustafa1234";


        if (str.equals("Mustafa") & str1.equals("Mustafa1234")) {
            System.out.println("Yönetim sayfasına hoşgeldiniz");

        } else if (!(str1.equals("Mustafa1234"))) {
            System.out.println("yanlış parola giridiniz lütfen tekrar deneyiniz");

        } else if (!(str.equals("Mustafa"))) {
            System.out.println("lütfen sistem yöneticis ile irtibat kurunuz");

        }

    }
}








