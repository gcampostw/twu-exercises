package exercises.diamond;

/**
 * Created by gcampos on 22/02/17.
 */
public class DiamonStarter {

    public static void main(String[] args) {
        Diamond diamond = new Diamond();

        diamond.drawIsoscelesTriangle(7, false);
        diamond.drawDiamond(8, false);
        diamond.drawDiamond(5, true);
    }
}
