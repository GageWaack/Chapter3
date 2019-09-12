import java.util.Scanner;

public class percentages {
    public static void main (String[] args)
    {
        double variable1;
        double variable2;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first variable");
        variable1 = input.nextDouble();
        System.out.println("Enter the second variable");
        variable2 = input.nextDouble();
        computePercent(variable1,variable2);
    }
    public static void computePercent(double variable1,double variable2)
    {
        float percentage;
    percentage = (float)((variable1*100)/variable2);

    System.out.println(variable1 + " is "+percentage+ " of " +variable2);
    }
}
