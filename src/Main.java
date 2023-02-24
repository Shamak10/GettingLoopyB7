public class Main {
    public static void main(String[] args) {// Declare the variable
        int row= 5;
        for (int i = 1; i <= 5; i++) {//loop that runs from 1 to 5
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");// Print a single asterisk without a newline character
            }
            System.out.println();
            // After the inner loop has finished, print a newline character to move to the next line
        }
    }
}
