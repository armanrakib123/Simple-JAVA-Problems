public class Lab73 {
    public static void main(String[] args) {
        String plate = "XYZ2023";

        if (isValidPlate(plate)) {
            System.out.println("Valid plate");
        } else {
            System.out.println("Invalid plate");
        }
    }

    public static boolean isValidPlate(String plate) {
        return plate.matches("^[A-Z]{3}\\d{4}$");
    }
}
