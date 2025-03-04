public class Strdemonstrate {

    public static void expandText(String text) {
        String currentWord = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isAlphabetic(ch)) {
                currentWord += ch;
            } else if (Character.isDigit(ch)) {
                int count = ch - '0';

                for (int j = 0; j < count; j++) {
                    System.out.print(currentWord);
                }
                currentWord = "";
            }
        }

        if (!currentWord.isEmpty()) {
            System.out.print(currentWord);
        }
    }

    public static void main(String[] args) {
        String input = "t6hj7ui";
        System.out.println("Input: " + input);
        System.out.print("Output: ");
        expandText(input);
    }
}

