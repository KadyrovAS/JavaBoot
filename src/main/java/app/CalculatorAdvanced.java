package app;

public class CalculatorAdvanced implements Calculator{
    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int diff(int a, int b) {
        return a - b;
    }

    @Override
    public String toString() {
        return "CalculatorAdvanced{}";
    }
}
