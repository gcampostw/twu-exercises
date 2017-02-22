package exercises.triangle;


/**
 * Created by gcampos on 22/02/17.
 */
public class TriangleStarter {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println("Which exercise do you want to run?");

        triangle.printOneAsterisk();
        triangle.drawHorizontalLine(8);
        triangle.drawVerticalLine(8);
        triangle.drawRightTriangle(3);

    }
}
