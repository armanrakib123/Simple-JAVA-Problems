public class Lab74 {
    public static void main(String[] args) {
        String input = "You are a fool";
        String[] offensiveWords = {"fool"};

        String output = filterOffensiveWords(input, offensiveWords);
        System.out.println(output);  // Output: You are a ****
    }

    public static String filterOffensiveWords(String message, String[] offensiveWords) {
        for (String word : offensiveWords) {
            String replacement = "*".repeat(word.length());
            message = message.replaceAll("(?i)\\b" + word + "\\b", replacement);
        }
        return message;
    }
}
