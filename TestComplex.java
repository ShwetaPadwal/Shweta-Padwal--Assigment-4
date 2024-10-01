package Assignment30_09_24;
import java.util.Scanner;
public class TestComplex {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the real part of the first complex number: ");
		double real1 = scanner.nextDouble();
		System.out.print("Enter the imaginary part of the first complex number: ");
		double imaginary1 = scanner.nextDouble();
		Complex complex1 = new Complex(real1, imaginary1);

		System.out.print("Enter the real part of the second complex number: ");
		double real2 = scanner.nextDouble();
		System.out.print("Enter the imaginary part of the second complex number: ");
		double imaginary2 = scanner.nextDouble();
		Complex complex2 = new Complex(real2, imaginary2);

		System.out.println("Sum: " + complex1.add(complex2));
		System.out.println("Difference: " + complex1.subtract(complex2));
		System.out.println("Product: " + complex1.multiply(complex2));

	}

}
