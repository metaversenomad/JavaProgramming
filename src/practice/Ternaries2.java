package practice;

public class Ternaries2 {
    public static void main(String[] args) {

        int score = 65;
        char grade; //A,B,C,D,E,F

        if (score >= 90) {
            grade='A';
        } else if (score>=80) {
            grade='B';
        } else if (score>=70) {
            grade='C';
        } else if (score>=60) {
            grade='D';
        }else {
            grade='F';
        }
        System.out.println(grade);

        System.out.println("NestedIfStatement vs Ternary");

        char garde2 = (score>=90)?'A':(score>80)?'B':(score>70)?'C':(score>60)?'D':'F';
        System.out.println(garde2);
    }
}
