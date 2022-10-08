package task1;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Reader reader = new Reader();
        Input input = reader.getInputFromConsole();
        double result = calculator.calculate(input.getA(), input.getB());
        System.out.println(result);
    }
}
