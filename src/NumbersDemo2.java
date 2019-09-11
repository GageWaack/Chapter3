import java.util.Scanner;
public class NumbersDemo2
{
    public static void main (String[] args) {
        int number;
        int numberTwo;
        int numberTimes2;
        int number2Times2;
        Scanner input = new Scanner(System.in);
        System.out.println("What would you like the first number to br");
        number = input.nextInt();
        System.out.println("What would you like the second number to be");
        numberTwo = input.nextInt();
        numberTimes2 = number * 2;
        number2Times2 = numberTwo * 2;
        displayTwiceTheNumber(number,numberTwo,numberTimes2, number2Times2);

    }
    public static void displayTwiceTheNumber(int number, int numberTwo, int numberTimes2, int number2Times2) {

        System.out.println(+number +" times two equals " +numberTimes2 );

        System.out.println(+numberTwo +" times two equals " + number2Times2);
        number2Times2 = number * number;
        numberTimes2 = (int)Math.pow(numberTwo, 2);
        displayNumberSquared(number,numberTwo,numberTimes2,number2Times2);
    }
    public static void displayNumberSquared(int number, int numberTwo, int numberTimes2, int number2Times2)
    {

        System.out.println (+ number +" Squared is "+ number2Times2 + " and "+numberTwo+ "Squared is  "+ numberTimes2);
    }
}