package Set8;

//public class CodingExercise003 {
//    public static void main(String[] args) {
//        MyString myString = new MyString("");
//        boolean actual = myString.isHexadecimal();
//        System.out.println(actual);
//    }
//}

public class MyString {
    public String str;

    public MyString(String str) {
        this.str = str;
    }

    public boolean isHexadecimalChar(char ch) {
        return (ch >= 'A' && ch <= 'F') || (ch >= 'a' && ch <= 'f');
    }

    public boolean isHexadecimal() {
        if (str == null || str.isEmpty()){
            return false;
        }

        char[] chars = str.toCharArray();

        for (char c : chars){
            if (!Character.isDigit(c) && !isHexadecimalChar(c)) {
                return false;
            }
        }

        return true;
    }
}


