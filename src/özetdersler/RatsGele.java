package özetdersler;

public class RatsGele {
    public static void main(String[] args) {

        // rast gele 10 adet tam sayı üretiniz :
        // ekranda gösteriniz

        int [] rastGeleSayilar = new int[10] ;
        for (int i = 0; i < rastGeleSayilar.length; i++) {
           // rastGeleSayilar[i] = Math.random()
            rastGeleSayilar[i]=(int) Math.round(Math.random()*100);
            System.out.print(rastGeleSayilar[i]+" ");

        }

    }
}
