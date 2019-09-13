package Assignments;

//import java.util.Scanner;
public class NumbersDemo
{
    public static void main (String[] args) {
        int number = 5;
        int numberTwo = 10;

        //Scanner input = new Scanner(System.in);
        displayTwiceTheNumber(number,numberTwo);
    }
        public static void displayTwiceTheNumber(int number, int numberTwo) {
            number = 5 * 2;
            System.out.println("5 times two equals " + number);
            numberTwo = 10 * 2;
            System.out.println("10 times two equals " + numberTwo);
            displayNumberSquared(number,numberTwo);
        }
        public static void displayNumberSquared(int number, int numberTwo)
        {
        number = 5 * 5;
        numberTwo = 10 * 10;

        System.out.println ("5 squared is "+ number + " and 10 squared is "+numberTwo);
        }
}
