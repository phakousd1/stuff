package edu.canisius.csc.lsp.exam3;

public class LambdaExample {
    private static MathOperation addition = (a, b) -> a + b;
    /* The lambda expression `addition` is created using the interface
    MathOperation, which adds the two input integers `(a, b) -> a + b`
     */
    private static MathOperation subtraction = (a, b) -> a - b;
    private static MathOperation multiplication = (a, b) -> a * b;
    private static MathOperation division = (a, b) -> a / b;
    /*I made similar lambda expressions for subtraction, multiplication, and division */
    public static void main(String[] args) {
        // Lambda expression
        int result = addition.operate(5, 3);
        /* the operate method of the `addition` lambda expression
        is invoked with the arguments 5 and 3, which results in
        `5 + 3 = 8`
         */
        int result2 = subtraction.operate(22, 2);
        int result3 = multiplication.operate(20, 15);
        int result4 = division.operate(40, 10);
        /* I invoked similar lambda expressions for subtraction, multiplication, and division*/
        System.out.println("Result: " + result);
        System.out.println("Result2 = " + result2);
        System.out.println("Result3 = " + result3);
        System.out.println("Result4 = " + result4);
    }
}
