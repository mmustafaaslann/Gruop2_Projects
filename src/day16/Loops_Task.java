package day16;

public class Loops_Task {
    private static int i;

    public static void main(String[] args) {

        //Task 1:
        // 0'dan 20'ye kadar olan çift sayıları ekrana yazdıran Java programını yazınız. (Sıfır ve yirmi dahil)

        for (int i = 0; i <= 20; i = i + 2) {

            System.out.print(i + " ");

        }
        System.out.println("");



        // Task 2:
            //0'dan 20'ye kadar olan tek sayıların toplamını bulup, sonucu ekrana yazdıran Java programını yazınız.

            for (int j = 0; j < 20; j++) {

                System.out.print((j = j + 1)+" ");

            }

        System.out.println("");
            

            //  Task 3:
            //  0'dan 100'e kadar olan sayılardan hem 5'e hem de 2'ye tam bölünebilen sayıları ekrana yazdıran
            //  Java programını yazınız. (Sıfır ve yüz dahil)

        for (int j = 0; j <=100 ; j++) {
            if (j%5==0 & j%2==0){
                System.out.print(j+" ");

        }

            }


        }

    }
    
