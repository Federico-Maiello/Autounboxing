public class Main {

    public static void main(String[] args) {
        printSum(8, 11);
        printChar('G');
        printSumInteger(12, 24);
        printCharacter('W');

        int intValue = 42;
        double doubleValue = 3.14;
        char charValue = 'Y';

        Integer integerValue = intValue;
        Double doubleWrapper = doubleValue;
        Character charWrapper = charValue;

        System.out.println("The value of int is: " + integerValue);
        System.out.println("The value of double is: " + doubleWrapper);
        System.out.println("The value of char is: " + charWrapper);


    }
    public static void printSum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }
    public static void printChar(char c) {
        System.out.println("Character: " + c);
    }
    public static void printSumInteger(Integer x, Integer y) {
        System.out.println("Sum Integer: " + (x + y));
    }
    public static void printCharacter(Character ch) {
        System.out.println("Character: " + ch);
    }
}