package staticfactory;

public class OperationFactory {
    public static Operation getOperation(String op) {
        switch (op) {
            case "+":
                return new Plus();
            case "-":
                return new Minus();
            case "*":
                return new Multiply();
            case "/":
                return new Divide();
            default:
                throw new RuntimeException("unsupported operation!");
        }
    }
}
