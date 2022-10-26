package day15;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Renk seçin : [k,s,y] ");
        String renk = scan.nextLine();
        renk=renk.toLowerCase();

        switch (renk){
            case "k":
                System.out.println("Kırmızı");
                break;
            case "s" :
                System.out.println("sarı");
                break;
            case  "y" :
                System.out.println("yeşil");
                break;

            default:
                System.out.println("geçersiz renk girişi" );


        }



    }
}
