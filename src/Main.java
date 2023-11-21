public class Main {

    public static void main(String[] args) {
        Integer sumResult = printSum(8, 11);
        Character charResult = printChar('G');
        Integer sumIntegerResult = printSumInteger(12, 24);
        Character charWrapperResult = printCharacter('W');

        int intValue = 42;
        double doubleValue = 3.14;
        char charValue = 'Y';

        Integer integerValue = intValue;
        Double doubleWrapper = doubleValue;
        Character charWrapper = charValue;

        System.out.println("The value of int is: " + integerValue);
        System.out.println("The value of double is: " + doubleWrapper);
        System.out.println("The value of char is: " + charWrapper);

        System.out.println("Returned sum result: " + sumResult);
        System.out.println("Returned char result: " + charResult);
        System.out.println("Returned sum integer result: " + sumIntegerResult);
        System.out.println("Returned char wrapper result: " + charWrapperResult);
    }
    public static Integer printSum(int a, int b) {
        return a + b;
    }
    public static Character printChar(char c) {
        return c;
    }
    public static Integer printSumInteger(Integer x, Integer y) {
        return x + y;
    }
    public static Character printCharacter(Character ch) {
        return ch;
    }
}