import java.util.Scanner;
public class Calculate_Tips {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the subtotal: ");
        double subtotal = input.nextDouble();

        System.out.println("\nEnter gratuity rate: ");
        double gratuityRate = input.nextDouble();

        double orderGratuity = subtotal * (gratuityRate / 100);
        double orderTotal = subtotal + orderGratuity;

        input.close();

        System.out.printf("The gratuity is $%.2f and total is $%.2f%n", orderGratuity, orderTotal);


    }
}
