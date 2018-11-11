package challenge.exception;

public class InvalidPositionException extends Exception {

    @Override
    public String getMessage() {
        return "A posição informada não existe no array de elementos";
    }
}
