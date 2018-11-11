package challenge.exception;

public class InvalidFibonacciInputException extends Exception {

    @Override
    public String getMessage() {
        return "Não é possivel calcular o Fibonacci do número informado";
    }
}
