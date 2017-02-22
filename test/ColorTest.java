import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by gcampos on 22/02/17.
 */
class ColorTest {
    @Test
    public void shouldBeBlue(){
        Color color = new Color();

        assertTrue(color.isBlue());
    }

    @Test
    public void shoudlBeRed(){
        Color red = new Color();
        assertTrue(red.isRed());
    }
}