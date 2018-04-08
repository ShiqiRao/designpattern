package staticfactory;

public class Calculator {

    public static int calculate(int former, int latter, String op) {
        Operation operation = OperationFactory.getOperation(op);
        return operation.getResult(former, latter);
    }
}
