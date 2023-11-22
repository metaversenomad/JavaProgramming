package practice;

public class StringMethods_Part1 {
    public static void main(String[] args) {

//        charAt(int index): returns the char at given index, return type ---Z char
        String str = "Cydeo";
//        index:      01234

        char ch1 = str.charAt(2);
//        System.out.println(str.charAt(2));
        System.out.println(ch1);

//        lenght(): return the total number of characters, return type ---> int
        String str2 = "Wooden Spoon";

        int n1 = str2.length();

        System.out.println(n1);

        int lastIndex = str2.length()-1;

        System.out.println("lastIndex = " + lastIndex);

//        toLowerCase(): returns the all lower case version of the String, return ---> String

        String str3 = "JavA";
        str3 = str3.toLowerCase();
        System.out.println(str3);

//        toUpperCase(): returns the all Upper case version of the String. return type ---> String
        String str4 = "Java";
        str4 = str4.toUpperCase();
        System.out.println(str4);

//        trim(): returns the String without all the white spaces (unused spaces). return type ---> String
        String str5 = "  Python    Java Programing     Language           ";
        str5 = str5.trim();
        System.out.println(str5);

//        indexOf(): returns the first matching character, index number return type ---> int
        String str6 = "Wooden Spoon";
        int indexNumOfFirstO = str6.indexOf("o");
        System.out.println("indexNumOfFirstO = " + indexNumOfFirstO);

        int indexNumberOfSecondO = str6.indexOf("od");
        System.out.println("indexNumberOfSecondO = " + indexNumberOfSecondO);

        int indexNumOfThirdO = str6.indexOf("oon");
        System.out.println("indexNumOfThirdO = " + indexNumOfThirdO);

//        lastIndexOf(): returns the last matching character. index number. return type ---> int
        String str7 = "Wooden Spoon";

        int indexNumOfLastO = str7.lastIndexOf("o");
        System.out.println("indexNumOfLastO = " + indexNumOfLastO);

    }
}
