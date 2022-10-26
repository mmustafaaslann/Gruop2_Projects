package özetdersler;

public class Arrays {
    public static void main(String[] args) {

        // Array (dizi) nasıl tanımlanır :

        int [] sayilar = new int[5];
        String [] days = new String[7];
        sayilar[0]=10;
        sayilar[1]=24;
        sayilar[2]=35;
        sayilar[3]=40;



        int toplam = 0;
        for (int i = 0; i < 5 ; i++) {
           toplam=toplam+sayilar[i];

        }
        double ort = (double) toplam/sayilar.length;
        System.out.println("toplam ="+toplam);
        System.out.println("ortalama ="+ort);
    }

}
