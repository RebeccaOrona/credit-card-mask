

public class Main {
    /**
     * Masks the input string by replacing all characters except the last four with '#'
     * @param str The input string to be masked
     * @return The masked string with all characters except the last four replaced by '#'
     */
    public static String maskify(String str) {
        // If the length of the input string is 4 or less, return the string as is
        if (str.length() <= 4) {
            return str;
        }

        // Get the length of the input string
        int length = str.length();

        // Replace all characters except the last four with '#' and store it in allButLastFour
        String allButLastFour = str.substring(0, length-4).replaceAll(".", "#");

        // Get the last four characters of the input string
        String lastFour = str.substring(length-4);

        // Concatenate allButLastFour and lastFour to form the masked string
        str = allButLastFour.concat(lastFour);

        // Return the masked string
        return str;
    }

    /**
     * Main method to demonstrate the functionality of the maskify function
     * @param args Command line arguments (not used in this example)
     */
    public static void main(String[] args) {
        // Print a welcome message
        System.out.println("Hello and welcome!");

        // Test the maskify function with different input strings and print the results
        System.out.println("Maskify result: " + maskify("4556364607935616"));
        System.out.println("Maskify result: " + maskify("64607935616"));
        System.out.println("Maskify result: " + maskify("1"));
        System.out.println("Maskify result: " + maskify(""));
        System.out.println("Maskify result: " + maskify("Skippy"));
        System.out.println("Maskify result: " + maskify("Nananananananananananananananana Batman!"));
    }
}