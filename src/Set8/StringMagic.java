package Set8;

//public class CodingExercise005 {
//    public static void main(String[] args) {
//        StringMagic sm = new StringMagic();
//
//        System.out.println(sm.reverseWordsInSentence("Hello World"));
//    }
//}

public class StringMagic {
    public String reverseWordsInSentence(String str) {
        if (str == null) {
            return "INVALID";
        }

        if (str.isEmpty()) {
            return "";
        }

        StringBuilder reversedSentence = new StringBuilder();
        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            StringBuilder reversedWord = new StringBuilder(words[i]);
            reversedWord.reverse();
            reversedSentence.append(reversedWord).append(" ");
        }

        return reversedSentence.toString().trim();
    }
}