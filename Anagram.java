//🔹 ২. Anagram (অ্যানাগ্রাম)
//📌 কী?
//দুইটি স্ট্রিং যদি একই অক্ষর দ্বারা গঠিত হয় (শুধু অক্ষরের অবস্থান আলাদা), তবে সেগুলো অ্যানাগ্রাম।
//উদাহরণ: "listen" এবং "silent"

public class Anagram {
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "listen", s2 = "silent";
        System.out.println("Are Anagrams? " + isAnagram(s1, s2));
    }
}
