package examples;

import Assignments.PoundsConversion;

import java.util.Scanner;

public class LBSexample {
    public static void main (String [] args) {
        double LBS;

        Scanner input = new Scanner(System.in);

        System.out.println("How many pounds do you weigh");
        LBS = input.nextInt();

        PoundsConversion.milligrams(LBS);
    }
}
