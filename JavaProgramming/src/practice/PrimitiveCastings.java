package practice;

public class PrimitiveCastings {
    public static void main(String[] args) {

//        implicit casting:
        int a = 100;
        double b = a;

        System.out.println(a);
        System.out.println(b);

//        explicit casting:
        double x = 20.5;
        int y = (int)x;

        System.out.println(x);
        System.out.println(y);

    }
}
