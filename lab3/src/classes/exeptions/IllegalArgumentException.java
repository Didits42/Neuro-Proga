package classes.exeptions;

public class IllegalArgumentException extends Exception {
    @Override
    public String getMessage() {
        return "Некорректный род (gender) для этого класса";
    }
}
