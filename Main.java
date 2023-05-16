package laba32;
public class Main {
    public static void main(String[] args) {
        Function[] functions = new Function[4];
        functions[0] = new Ellipse(2, 4);
        functions[1] = new Ellipse(3, 6);
        functions[2] = new Hyperbola(2, 4);
        functions[3] = new Hyperbola(3, 6);

        for (Function function : functions) {
            double x = 1.5;
            double y = function.calculateValue(x);
            function.printResult(x, y);
            System.out.println(function.toString());
            System.out.println(function.equals(new Ellipse(2, 4)));
        }
    }
}