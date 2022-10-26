package day15;

import java.util.Scanner;

public class SwıtchKullanimi {
    public static void main(String[] args) {

   //     int gunno = 5 ;

     //   switch (gunno){
       //     case 1 :
         //       System.out.println("pazaertesi");
           //     break;
           // case 2 :
             //   System.out.println("salı");
               // break;
          //  case 3 :
            //    System.out.println("çarşamba");

           Scanner scan = new Scanner(System.in);
        System.out.println("gün numarası giriniz");
        int gunno = scan.nextInt();

            switch (gunno){
                case 1 :
                case 2 :
                case 3:
                case 4:
                case 5:
                    System.out.println("hafta içi");
                    break;
                case 6 :
                case 7 :
                    System.out.println("hafta sonu");


            }
        }




        }


