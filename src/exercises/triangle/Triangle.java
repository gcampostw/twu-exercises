package exercises.triangle;

/**
 * Created by gcampos on 22/02/17.
 */
public class Triangle {

    public void printOneAsterisk(){
        System.out.println("*");
    }

    public void drawHorizontalLine(int n){
        String line = "";
        for (int i = 0; i < n; i++) {
            line += "*";
        }
        System.out.print(line);
    }

    public void drawVerticalLine(int n){
        String line = "";
        for (int i = 0; i < n; i++) {
            printOneAsterisk();
        }
    }

    public void drawRightTriangle(int n){
        for (int i = 0; i < n; i++) {
            drawHorizontalLine(i+1);
            System.out.print("\n");
        }
    }
}
