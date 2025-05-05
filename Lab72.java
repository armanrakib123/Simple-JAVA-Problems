public class Lab72 {
    public static String generateEmail(String fullName) {
        String lowerCaseName = fullName.toLowerCase();
        String formattedName = lowerCaseName.replace(" ", ".");
        return formattedName + "@company.com";
    }

    public static void main(String[] args) {
        String fullName = "John Doe";
        String email = generateEmail(fullName);
        System.out.println("Email: " + email);
    }
}