package day13;

public class Tekra3 {
    public static void main(String[] args) {

        int sayı = 5;
        int faktoriyel = 1;

        for (int i = sayı; i >=1 ; i--) {
            faktoriyel=faktoriyel*i;
        }
        System.out.println(faktoriyel);
    }
}



