class DemonstrateNullPointerException {

    // Method to generate a NullPointerException
    public static void generateNullPointerException() {
        // Initializing a String reference to null
        String text = null;

        // Attempting to call the length() method on a null reference will cause a NullPointerException
        System.out.print(text.length());
    }

    // Method to demonstrate handling of NullPointerException
    public static void NullPointerExceptionDemonstrate() {
        // Initializing a String reference to null
        String text = null;

        // Using a try-catch block to handle the NullPointerException
        try {
            // Attempting to call the length() method on a null reference will cause a NullPointerException
            System.out.print(text.length());
        } catch (NullPointerException e) {
            // This block will be executed when the NullPointerException occurs
            System.out.println("NullPointerException Demonstrated");
        }
    }

    public static void main(String[] args) {
        // Using try-catch to handle NullPointerException when generating the exception
        try {
            // Calling the method that generates the NullPointerException
            generateNullPointerException();
        } catch (NullPointerException e) {
            // This block will be executed when the NullPointerException is thrown
            System.out.println("NullPointerException generated");
        }

        // Calling the method that demonstrates handling the exception
        NullPointerExceptionDemonstrate();
    }
}
