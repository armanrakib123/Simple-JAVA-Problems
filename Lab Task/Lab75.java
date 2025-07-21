public class Lab75{
    public static void main(String[] args) {
        String input = "hello";
        String output = reverse(input);
        System.out.println("Output: " + output);
    }

    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}
