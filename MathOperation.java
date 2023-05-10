package edu.canisius.csc.lsp.exam3;

interface MathOperation {
    int operate(int a, int b);
}
/* this functional interface is named `MathOperation`. It contains a single
abstract method `operate(int a, int b)` which takes two integer parameters and
returns an integer value. The interface can be used to respresent
a mathematical operation that takes two input values and produces
an output value. By defining this interface as a functional interface,
it can be used to define lambda expressions, which can be assigned
to variables and passed as arguments to methods
 */