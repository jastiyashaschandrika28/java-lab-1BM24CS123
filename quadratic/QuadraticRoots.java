import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        double discriminant = (b * b) - (4 * a * c);

        if (discriminant > 0) {
            // Two real and distinct roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("Roots are real and different.");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);

        } else if (discriminant == 0) {
            // One real root
            double root = -b / (2 * a);
            System.out.println("Roots are real and equal.");
            System.out.println("Root = " + root);

        } else {
            // Complex roots
            double real = -b / (2 * a);
            double imag = Math.sqrt(-discriminant) / (2 * a);

            System.out.println("Roots are complex.");
            System.out.println("Root 1 = " + real + " + " + imag + "i");
            System.out.println("Root 2 = " + real + " - " + imag + "i");
        }

        sc.close();
    }
}
