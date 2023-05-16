package laba32;

class Ellipse extends Function {
    double a;
    double b;

    public Ellipse(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double calculateValue(double x) {
        return Math.sqrt(1 - (x * x) / (a * a)) * b;
    }

    @Override
    public String toString() {
        return "Ellipse: a = " + a + ", b = " + b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ellipse)) return false;
        Ellipse ellipse = (Ellipse) o;
        return Double.compare(ellipse.a, a) == 0 &&
                Double.compare(ellipse.b, b) == 0;
    }

}
