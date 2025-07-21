//🔹 ১. Palindrome (প্যালিনড্রোম)
//📌 কী?
//একটি স্ট্রিং যদি সামনে থেকে এবং পেছন দিক থেকে একই রকম পড়া যায়, তাহলে সেটি প্যালিনড্রোম।
//উদাহরণ: "madam", "level", "racecar"

public class Palindrome {
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "racecar";
        System.out.println("Is Palindrome? " + isPalindrome(s));
    }
}
