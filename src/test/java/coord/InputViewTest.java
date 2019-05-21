package coord;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InputViewTest {
    @Test
    void parseTest() {
        assertEquals(Arrays.asList(new Point(1, 2), new Point(3, 4), new Point(5, 6)), InputView.parseCoordinates("(1,2)-(3,4)-(5,6)"));
    }
}