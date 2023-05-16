package laba32;
class Hyperbola extends Function {
    double a;
    double b;

    public Hyperbola(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double calculateValue(double x) {
        return b / Math.sqrt((x * x) / (a * a) - 1);
    }

    @Override
    public String toString() {
        return "Hyperbola: a = " + a + ", b = " + b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hyperbola)) return false;
        Hyperbola hyperbola = (Hyperbola) o;
        return Double.compare(hyperbola.a, a) == 0 &&
                Double.compare(hyperbola.b, b) == 0;
    }
}