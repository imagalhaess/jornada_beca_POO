package API.exceptions;

public class InvalidDivisor extends RuntimeException {
    private String message;
    public InvalidDivisor(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
