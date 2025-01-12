import java.util.HashSet;
import java.util.Set;

public class OTPGenerator {

    // Method to generate a 6-digit OTP number
    public static int generateOTP() {
        // Generate a random number between 100000 and 999999 (inclusive)
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method to check if the OTP numbers generated are unique
    public static boolean areOTPsUnique(int[] otps) {
        Set<Integer> otpSet = new HashSet<>();
        for (int otp : otps) {
            otpSet.add(otp);
        }
        // If the size of the set is equal to the array length, all OTPs are unique
        return otpSet.size() == otps.length;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];  // Array to store the 10 OTP numbers

        // Generate 10 OTP numbers and store them in the array
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }

        // Check if all the generated OTPs are unique
        if (areOTPsUnique(otps)) {
            System.out.println("\nAll OTPs are unique.");
        } else {
            System.out.println("\nSome OTPs are not unique.");
        }
    }
}
