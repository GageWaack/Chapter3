package Assignments;

import java.util.Scanner;

public class PoundsConversion {
    public static void main (String [] args) {
        double LBS;

        Scanner input = new Scanner(System.in);

        System.out.println("How many pounds do you weigh");
        LBS = input.nextInt();
        ounces(LBS);
        milligrams(LBS);
    }
        public static void ounces(double LBS)
        {
            int ounces;
            ounces = (int) (LBS * 16);
            System.out.println("You weigh " + ounces + " ounces");
        }
        public static void milligrams(double LBS)
        {
            double milligrams;
            milligrams = LBS * 453592.37;
            System.out.println("You weigh " + milligrams + " milligrams ");
        }
}
