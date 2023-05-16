package laba32;
abstract class Function {
    abstract double calculateValue(double x);
    void printResult(double x, double y) {
        System.out.println("f(" + x + ") = " + y);
    }
}