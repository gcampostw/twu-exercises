package exercises.diamond;

/**
 * Created by gcampos on 22/02/17.
 */
public class Diamond {

    public void drawIsoscelesTriangle(int n, boolean name){
        String line = "";
        int biggerLine = 2*n -1;
        int middleOfBiggerLine = (int) Math.ceil(biggerLine / 2.0)-1;

        int asteriskBeg = middleOfBiggerLine;
        int asteriskEnd = middleOfBiggerLine;
        // For each line
        for (int lineNumber = 0; lineNumber < n; lineNumber++) {
            if (lineNumber == n-1 && name == true) {
                line = "Gabrielle";
            }else{
                // Write a line of biggerLine characters
                for (int columnInLine = 0; columnInLine < biggerLine; columnInLine++) {
                    if (columnInLine < asteriskBeg || columnInLine > asteriskEnd){
                        line += " ";
                    }else{
                        line += "*";
                    }
                }
            }
            asteriskBeg -=  1;
            asteriskEnd += 1;
            System.out.println(line);
            line = "";
        }
    }

    public void drawDiamond(int n, boolean name) {

        drawIsoscelesTriangle(n, name);

        String line = "";
        int biggerLine = 2 * n - 1;

        int asteriskBeg = 1;
        int asteriskEnd = biggerLine - 2;

        for (int lineNumber = 0; lineNumber < n-1; lineNumber++) {
            // Write a line of biggerLine characters
            for (int columnInLine = 0; columnInLine < biggerLine; columnInLine++) {
                if (columnInLine < asteriskBeg || columnInLine > asteriskEnd) {
                    line += " ";
                } else {
                    line += "*";
                }
            }
            asteriskBeg += 1;
            asteriskEnd -= 1;
            System.out.println(line);
            line = "";
        }
    }

}
