package practice;

public class StringMethods_Part3 {
    public static void main(String[] args) {

//        isEmpty(): checks if string lenght is zero, return type ---> boolean
        String str = " ";
        boolean r1 = str.isEmpty();
        System.out.println(r1);

//        isBlank(): checks if the string is blank. return type ---> boolean
        String str2 = "  ";
        boolean r2 = str2.isBlank();
        System.out.println(r2);

//        equals(String): compares the content of the two Strings. return type ---> boolean
        String s1 = "Java";
        String s2 = new String("Java");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

//        equalsIgnoreCase(String): compares the content of the two Strings irrespective of the case sensitivity, return type ---> boolean
        String word1 = "JAVA";
        String word2 = "Java";

        System.out.println(word1.equals(word2));
        System.out.println(word1.equalsIgnoreCase(word2));

//        contains(String): checks if the given string is contained in the String, return type ---> boolean
        String sentence = "I love Java programming language";
        boolean hasCharp = sentence.contains("C#");
        System.out.println("hasCharp = " + hasCharp);

        boolean hasJava = sentence.contains("Java");
        System.out.println("hasJava = " + hasJava);

//        startWith(String): checks if the string started with the given character(s). return type ---> boolean
        String name = "Wooden Spoon";
        boolean resutl1 = name.startsWith("Wood");
        System.out.println(resutl1);

        boolean result2 = name.startsWith("Spoon");
        System.out.println(result2);

//        endWith(String): checks if the string ends with the given character(s). return type ---> boolean
        boolean result3 = name.endsWith("Spoon");
        System.out.println(result3);
    }
}
