public class Lab76 {
    public static void main(String[] args) {
        String input = "education";
        int vowelCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = Character.toLowerCase(input.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels in \"" + input + "\": " + vowelCount);
    }
}
