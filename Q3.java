import java.util.Scanner;

public class IsoscelesTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the two equal sides: ");
        double equalSides = scanner.nextDouble();

        System.out.print("Enter the length of the third side: ");
        double thirdSide = scanner.nextDouble();

        double angle = calculateAngle(equalSides, thirdSide);

        System.out.println("The two equal angles of the isosceles triangle are: " + angle + " degrees");
    }

    private static double calculateAngle(double equalSides, double thirdSide) {
        double cosAngle = (equalSides * equalSides + equalSides * equalSides - thirdSide * thirdSide) / (2 * equalSides * equalSides);
        double angle = Math.toDegrees(Math.acos(cosAngle));
        return angle;
    }
}