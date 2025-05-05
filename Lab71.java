public class Lab71 {

    public static String validatePassword(String password) {
        if (password.length() < 8) {
            return "Invalid Password: Must be at least 8 characters long";
        }

        boolean hasUppercase = false;
        boolean hasDigit = false;
        boolean hasSpace = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            }
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
            if (Character.isWhitespace(ch)) {
                hasSpace = true;
            }
        }

        if (hasSpace) {
            return "Invalid Password: Must not contain spaces";
        }

        if (!hasUppercase) {
            return "Invalid Password: Must contain at least one uppercase letter";
        }

        if (!hasDigit) {
            return "Invalid Password: Must contain at least one digit";
        }

        return "Valid Password";
    }

    public static void main(String[] args) {
        String input = "Pass1234";
        String result = validatePassword(input);
        System.out.println(result);
    }
}
