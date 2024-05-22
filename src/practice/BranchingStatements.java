package practice;

public class BranchingStatements {
    public static void main(String[] args) {

//        Break Statement:

        for (char i='A'; i<='E'; i++){
            System.out.println(i);

            if (i=='C'){
                break;
            }
        }

        for (int i=1; i<=5; i++){
            System.out.println(i);
            if (i==3){
                break;
            }
        }

//        Continue Statement:

        for (char i='A'; i<='E'; i++){

            if (i=='C'){
                continue;
            }
            System.out.println(i);

        }



        }
}
