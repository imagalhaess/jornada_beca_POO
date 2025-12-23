package br.com.imagalhaess.viacep.exceptions;

public class CepNotFound extends Throwable {
    public CepNotFound(String message) {
        super(message);
    }
}
