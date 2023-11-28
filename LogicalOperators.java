package practice;

public class LogicalOperators {
    public static void main(String[] args) {

//        Logial AND:
        boolean result1 = 10>5 && 10>7;
        System.out.println(result1);

        boolean result2 = 20>15 && 20>25;
        System.out.println(result2);

        boolean result3 = 30>50 && 30>10;
        System.out.println(result3);

//        Logial OR
        boolean result4 = 100==200 || 100!=300;
        System.out.println(result4);

        boolean result5 = 1000>900 || 1000<2000;
        System.out.println(result5);

        boolean result6 = 7<0 || 7>15;
        System.out.println(result6);

//        Logical NOT:
        boolean result7 = !true;
        System.out.println(result7);

        boolean result8 = !false;
        System.out.println(result8);

        boolean result9 = 100==200;
        System.out.println(result9);
    }
}
