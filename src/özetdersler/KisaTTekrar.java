package özetdersler;

public class KisaTTekrar {
    public static void main(String[] args) {
        int birinciSayı = 5;
        int ikinciSayı = 7;

        if (birinciSayı<ikinciSayı){
            System.out.println("birinci sayı küçüktür");
        } else if (ikinciSayı>birinciSayı) {
            System.out.println("ikinci sayı büyüktür");

        }

        for (int i = 0; i <5 ; i++) {
            System.out.println(i+1+".merhaba");

        }
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <5 ; j++) {
                System.out.print("*\t");

            }  {
                System.out.println("");
                System.out.println("");
            }

            int sayac =1;
            int toplam =0 ;
          do {
              toplam=toplam+sayac;
              sayac++;

          }while (sayac<=5);

            System.out.println(toplam);
            }

        }
    }


