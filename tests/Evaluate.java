import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Set8.*;

public class Evaluate {

    StringMagic stringMagic = new StringMagic();

    @Test
    public void testReverseWordsInSentence1() {
        String sentence = "Hello world";
        String actual = stringMagic.reverseWordsInSentence(sentence);
        String expected = "olleH dlrow";
        assertEquals(expected, actual, String.format("Expected reverse of \"%s\" to be \"%s\" but got \"%s\"", sentence, expected, actual));
    }

    @Test
    public void testReverseWordsInSentence2() {
        String sentence = "Welcome to OpenAI";
        String actual = stringMagic.reverseWordsInSentence(sentence);
        String expected = "emocleW ot IAnepO";
        assertEquals(expected, actual, String.format("Expected reverse of \"%s\" to be \"%s\" but got \"%s\"", sentence, expected, actual));
    }

    @Test
    public void testReverseWordsInSentence3() {
        String sentence = "This is a test";
        String actual = stringMagic.reverseWordsInSentence(sentence);
        String expected = "sihT si a tset";
        assertEquals(expected, actual, String.format("Expected reverse of \"%s\" to be \"%s\" but got \"%s\"", sentence, expected, actual));
    }

    @Test
    public void testReverseWordsInSentence4() {
        String sentence = "Java programming";
        String actual = stringMagic.reverseWordsInSentence(sentence);
        String expected = "avaJ gnimmargorp";
        assertEquals(expected, actual, String.format("Expected reverse of \"%s\" to be \"%s\" but got \"%s\"", sentence, expected, actual));
    }

    @Test
    public void testReverseWordsInSentence5() {
        String sentence = "Coding challenges";
        String actual = stringMagic.reverseWordsInSentence(sentence);
        String expected = "gnidoC segnellahc";
        assertEquals(expected, actual, String.format("Expected reverse of \"%s\" to be \"%s\" but got \"%s\"", sentence, expected, actual));
    }

    @Test
    public void testReverseWordsInSentenceNull() {
        String sentence = null;
        String actual = stringMagic.reverseWordsInSentence(sentence);
        String expected = "INVALID";
        assertEquals(expected, actual, String.format("Expected reverse of null to be \"%s\" but got \"%s\"", expected, actual));
    }

    @Test
    public void testReverseWordsInSentenceEmpty() {
        String sentence = "";
        String actual = stringMagic.reverseWordsInSentence(sentence);
        String expected = "";
        assertEquals(expected, actual, String.format("Expected reverse of an empty string to be an empty string but got \"%s\"", actual));
    }
}