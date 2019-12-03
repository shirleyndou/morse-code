import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MorseCodeTest {
@Test
    public void lettersToMorseTest()
{

    String convert = "";
    MorseCode test1 = new MorseCode(convert);
    String output = test1.morseToLetters();
    assertEquals('H', 'H', "....");
    assertEquals('A', 'A', ".-");
}
}
