public class ImperativeVSDeclarativeExample1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Imperative style: How style of programming that uses statements to change a program's state.
        //To Caluclate the sum of numbers from 1 to 100 in an imperative style:   
        int sum = 0; // Initialize sum to 0
        for (int i = 1; i <= 100; i++) { // Loop from 1 to 100
            sum += i; // Add each number to sum
        }
        System.out.println("Imperative style sum: " + sum); // Print the result

        // Declarative style: A programming paradigm that expresses the logic of a computation without describing its control flow.

        // To calculate the sum of numbers from 1 to 100 in a declarative style:
        int declarativeSum = java.util.stream.IntStream.rangeClosed(1, 100) // Create a stream of numbers from 1 to 100
                .sum(); // Calculate the sum of the stream      
        System.out.println("Declarative style sum: " + declarativeSum); // Print the result

        // In a multuthreaded environment, the declarative style is more efficient and easier to read.
        // The imperative style requires more lines of code and is more prone to errors.      \
              // To calculate the sum of numbers from 1 to 100 in a declarative style:
              int declarativeSumMultiThreadedEnv = java.util.stream.IntStream.rangeClosed(1, 100)
                .parallel()// Create a stream of numbers from 1 to 100
                .sum(); // Calculate the sum of the stream
        System.out.println("Declarative style sum: " + declarativeSumMultiThreadedEnv); // Print the result
    }
}
