import java.util.Scanner;
// Your code should start here.
public class Input {
    public static void main(String[] args) {
        // Inside main() method.
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.print("Enter your weight (in kg): ");
        double weight = scanner.nextDouble();
        
        System.out.print("Are you a smoker? (true/false): ");
        boolean isSmoker = scanner.nextBoolean();
        
        System.out.println("\nMedical Form Summary:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Smoker: " + isSmoker);
        
        scanner.close();
    }
}
