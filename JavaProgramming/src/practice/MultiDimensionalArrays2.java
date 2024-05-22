package practice;

import java.util.Arrays;

public class MultiDimensionalArrays2 {
    public static void main(String[] args) {

        String[][] groups = {{"Ahmed","Jimmy"},{"Breanna","Victoria","Daniel"},{"Natalia","Aaron","Chirstina","Josh"}};

        System.out.println(Arrays.toString(groups[1]));

        System.out.println(groups[2][0]);

        System.out.println(Arrays.deepToString(groups));


    }
}
