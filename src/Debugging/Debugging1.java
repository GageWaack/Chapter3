package Debugging;

public class Debugging1 {
    public static void main(String args[])
    {
        double myCheck = 50.00;
        double yourCheck = 19.95;
        System.out.println("Tips are");
        calcTip(myCheck,yourCheck);

    }
    public static void calcTip(double myCheck, double yourCheck)
    {
        int bill = 1;
        final double RATE = 0.15;
        double tip;
        tip = bill * RATE;
        System.out.println("The tip should be at least " + tip);
    }
}

