import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Set8.*;


public class Evaluate {
    MyString myString;

    //test for isHexadecimal()

    @Test
    public void testIsHexadecimalValidHex() {
        myString = new MyString("ABCDEF1234567890");
        boolean actual = myString.isHexadecimal();
        boolean expected = true;
        assertEquals(expected, actual, String.format("Expected %b for the string 'ABCDEF1234567890' but got %b", expected, actual));
    }

    @Test
    public void testIsHexadecimalInvalidChar() {
        myString = new MyString("GHIJKL");
        boolean actual = myString.isHexadecimal();
        boolean expected = false;
        assertEquals(expected, actual, String.format("Expected %b for the string 'GHIJKL' but got %b", expected, actual));
    }

    @Test
    public void testIsHexadecimalEmptyString() {
        myString = new MyString("");
        boolean actual = myString.isHexadecimal();
        boolean expected = false;
        assertEquals(expected, actual, String.format("Expected %b for an empty string but got %b", expected, actual));
    }

    @Test
    public void testIsHexadecimalNullString() {
        myString = new MyString(null);
        boolean actual = myString.isHexadecimal();
        boolean expected = false;
        assertEquals(expected, actual, String.format("Expected %b for a null string but got %b", expected, actual));
    }

    @Test
    public void testIsHexadecimalLowerCaseHex() {
        myString = new MyString("abcdef1234567890");
        boolean actual = myString.isHexadecimal();
        boolean expected = true;
        assertEquals(expected, actual, String.format("Expected %b for the string 'abcdef1234567890' but got %b", expected, actual));
    }

    @Test
    public void testIsHexadecimalMixedCaseHex() {
        MyString myString = new MyString("a1B2C3");
        boolean actual = myString.isHexadecimal();
        boolean expected = true;
        assertEquals(expected, actual, String.format("Expected %b for input string '%s' but got %b", expected, myString.str, actual));
    }

    @Test
    public void testIsHexadecimalStringWithSpaces() {
        MyString myString = new MyString("1A 2B 3C");
        boolean actual = myString.isHexadecimal();
        boolean expected = false;
        assertEquals(expected, actual, String.format("Expected %b for input string with spaces '%s' but got %b", expected, myString.str, actual));
    }

    @Test
    public void testIsHexadecimalStringWithSpecialChars() {
        MyString myString = new MyString("1A2B*3C");
        boolean actual = myString.isHexadecimal();
        boolean expected = false;
        assertEquals(expected, actual, String.format("Expected %b for input string with special chars '%s' but got %b", expected, myString.str, actual));
    }

// test for isHexadecimalChar()

    @Test
    public void testIsHexadecimalCharValidHex() {
        myString = new MyString("");
        boolean actual = myString.isHexadecimalChar('A');
        boolean expected = true;
        assertEquals(expected, actual, String.format("Expected %b for the char 'A' but got %b", expected, actual));
    }

    @Test
    public void testIsHexadecimalCharInvalidHex() {
        myString = new MyString("");
        boolean actual = myString.isHexadecimalChar('G');
        boolean expected = false;
        assertEquals(expected, actual, String.format("Expected %b for the char 'G' but got %b", expected, actual));
    }

    @Test
    public void testIsHexadecimalCharLowerCaseHex() {
        MyString myString = new MyString("");
        boolean actual = myString.isHexadecimalChar('f');
        boolean expected = true;
        assertEquals(expected, actual, String.format("Expected %b for the char 'f' but got %b", expected, actual));
    }

    @Test
    public void testIsHexadecimalCharDigit() {
        MyString myString = new MyString("");
        boolean actual = myString.isHexadecimalChar('9');
        boolean expected = false;
        assertEquals(expected, actual, String.format("Expected %b for the char '9' but got %b", expected, actual));
    }

    @Test
    public void testIsHexadecimalCharSpecialChar() {
        MyString myString = new MyString("");
        boolean actual = myString.isHexadecimalChar('*');
        boolean expected = false;
        assertEquals(expected, actual, String.format("Expected %b for the char '*' but got %b", expected, actual));
    }

    @Test
    public void testIsHexadecimalCharLowercaseValidHex() {
        MyString myString = new MyString("");
        boolean actual = myString.isHexadecimalChar('b');
        boolean expected = true;
        assertEquals(expected, actual, String.format("Expected %b for the char 'b' but got %b", expected, actual));
    }

    @Test
    public void testIsHexadecimalCharLowercaseInvalidHex() {
        MyString myString = new MyString("");
        boolean actual = myString.isHexadecimalChar('g');
        boolean expected = false;
        assertEquals(expected, actual, String.format("Expected %b for the char 'g' but got %b", expected, actual));
    }

    @Test
    public void testIsHexadecimalCharBoundaryValues() {
        MyString myString = new MyString("");
        boolean actual = myString.isHexadecimalChar('a');
        boolean expected = true;
        assertEquals(expected, actual, String.format("Expected %b for the char 'a' but got %b", expected, actual));

        actual = myString.isHexadecimalChar('f');
        expected = true;
        assertEquals(expected, actual, String.format("Expected %b for the char 'f' but got %b", expected, actual));
    }


}