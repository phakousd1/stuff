package edu.canisius.csc.lsp.exam3;

public class TryCatchExample {
    public static void main(String[] args) {
        example();
    }

    private static void example() {
        int number = 10; //variable initialized to 10

        try {
            // Modify the variable inside the try block
            number = number / 0; //tries to divide by zero
            // you can't divide by 0 which will result in
            //an `ArithmeticException`
       } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            //if exception occurs, the `catch` block will catch the exception
            //and print out the error message.
        } finally {
            /*finally block is executed regardless of whether an exception was thrown
             or not number` variable is printed out to console the value `number` is
             updated inside the `finally` block regardless of whether an exception
             was thrown or not, which is why the value of `number` will always be 20
             */
            number = 20;
        }

        System.out.println("Number: " + number);
        System.out.println("The show 'finally' moves on after each try catch.");
    /*The "finally" block is guaranteed to execute regardless of whether
         an exception is thrown or not. This ensures that any necessary clean
       up code is executed,regardless of the outcome of the try and catch blocks.*/
    }
}
