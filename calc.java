import.java.util.Scanner;
public class calc {
    public static void main(String[]args);
    Scanner scan= new Scanner(Systen.in);
    System.out.println("Enter value: ");
    double totalBill= scan.nextDouble();
    System.out.println("What is the tip in whole number without the percent sign");
    int tipPercent = scan.nextInt();
    System.out.println("How much people were at the party?: ");
    int numPeople = scan.nextInt();
    System.out.println("The total tip amount is: " + totalBill*tipPercent);
    System.out.print("The total bill including tip is: " + totalBill +(totalBill*tipPercent));
    System.out.println("The tip per person is: " + (totalBill*tipPercent)/numPeople);

}
