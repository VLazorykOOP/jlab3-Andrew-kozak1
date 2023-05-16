package lab33;

interface Function {
    double calculate(double x);
    void printResult(double x, double result);
}

class Ellipse implements Function {
    private double a;
    private double b;

    public Ellipse(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculate(double x) {
        return Math.sqrt(1 - Math.pow(x, 2) / Math.pow(a, 2)) * b;
    }

    @Override
    public void printResult(double x, double result) {
        System.out.printf("The value of the Ellipse function at x = %.2f is %.2f\n", x, result);
    }

    @Override
    public String toString() {
        return "Ellipse: a = " + a + ", b = " + b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ellipse ellipse = (Ellipse) o;
        return Double.compare(ellipse.a, a) == 0 &&
                Double.compare(ellipse.b, b) == 0;
    }
}

class Hyperbola implements Function {
    private double a;
    private double b;

    public Hyperbola(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculate(double x) {
        return b / Math.sqrt(Math.pow(x, 2) / Math.pow(a, 2) - 1);
    }

    @Override
    public void printResult(double x, double result) {
        System.out.printf("The value of the Hyperbola function at x = %.2f is %.2f\n", x, result);
    }

    @Override
    public String toString() {
        return "Hyperbola: a = " + a + ", b = " + b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hyperbola hyperbola = (Hyperbola) o;
        return Double.compare(hyperbola.a, a) == 0 &&
                Double.compare(hyperbola.b, b) == 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Function[] functions = new Function[2];
        functions[0] = new Ellipse(2, 4);
        functions[1] = new Hyperbola(2, 4);

        double x = 1.5;

        for (Function function : functions) {
            double result = function.calculate(x);
            function.printResult(x, result);
        }
    }
}
