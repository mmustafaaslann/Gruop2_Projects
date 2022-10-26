package özetdersler;

public class Metot3 {
    public static void main(String[] args) {
        System.out.println("Max :"+getMax(5,30));



    }
    public static int getMax (int x ,int y){
        int max = x ;
        if (y>max){
            max=y;
        }
        return max;
    }
}
