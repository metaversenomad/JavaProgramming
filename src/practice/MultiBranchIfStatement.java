package practice;

public class MultiBranchIfStatement {
    public static void main(String[] args) {

        int number = 0;

        if (number > 0) {
            System.out.println("Positive");
        } else if (number<0) {
            System.out.println("Negative");
        }else
        System.out.println("Zero");
        
        int score = 15;
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
    }
}
