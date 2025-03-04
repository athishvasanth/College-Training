public class Stringrev {

    static String print(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;

        String[] words = new String[n];
        int wordCount = 0;
        String word = "";
        boolean isSpace = false;

        for (int i = 0; i < n; i++) {
            if (chars[i] != ' ') {
                word += chars[i];
                isSpace = false;
            } else {
                if (!word.isEmpty()) {
                    words[wordCount++] = word;
                    word = "";
                }
                isSpace = true;
            }
        }
        if (!word.isEmpty()) {
            words[wordCount++] = word;
        }

        StringBuilder result = new StringBuilder();

        for (int i = wordCount - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "   I   love   Java   Programming  ";
        System.out.println("Input: " + input);
        System.out.println("Output: " + print(input));
    }
}
