package toyproject.calculator;

public class Add implements Operation {
    @Override
    public double calculate(double a, double b) {
        return a+b;
    }
}
