package org.example;

/**
 * The calculator can be used to calculate triangular numbers.
 * Provides recursive methods for computing, adding, and subtracting
 * triangular numbers, where the nth triangular number is 1 + 2 + ... + n.
 *
 * @author Zhengjia Liu
 */
public class App {

    /**
     * Recursively computes the nth triangular number.
     * The recursion depth is equal to n, so for large n,
     * this may cause a StackOverflowError.
     *
     * @param n The index (must be >= 1)
     * @return The nth triangular number
     */
    public int recursiveCalc(int n) {
        if (n < 2) {
            return 1;
        } else {
            return recursiveCalc(n - 1) + n;
        }
    }

    /**
     * Adds the nth and mth triangular numbers.
     * The recursion limit is determined by the larger of n or m.
     *
     * @param n First triangular number index
     * @param m Second triangular number index
     * @return The sum Tn + Tm
     */
    public int add(int n, int m) {
        return recursiveCalc(n) + recursiveCalc(m);
    }

    /**
     * Subtracts the mth triangular number from the nth.
     * The recursion limit is determined by the larger of n or m.
     *
     * @param n The triangular number to subtract from
     * @param m The triangular number to subtract
     * @return The difference Tn - Tm
     */
    public int subtract(int n, int m) {
        return recursiveCalc(n) - recursiveCalc(m);
    }

    /**
     * Entry point for manual testing.
     *
     * @param args Not used
     */
    public static void main(String[] args) {
        TriangleNumberCalculator calculator = new TriangleNumberCalculator();
        System.out.println(calculator.recursiveCalc(1));
        System.out.println(calculator.recursiveCalc(2));
        System.out.println(calculator.recursiveCalc(4));

        System.out.println(calculator.add(1, 1));
        System.out.println(calculator.add(2, 3));
        System.out.println(calculator.add(4, 2));

        System.out.println(calculator.subtract(1, 1));
        System.out.println(calculator.subtract(2, 3));
        System.out.println(calculator.subtract(4, 2));
    }
}
