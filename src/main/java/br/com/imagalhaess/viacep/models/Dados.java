package br.com.imagalhaess.viacep.models;

public class Dados  {
    private String cep;
    private String logradouro;
    private String bairro;
    private String estado;
    private String ibge;
    private String erro;

    public boolean isErro() {
        return "true".equals(erro);
    }

    @Override
    public String toString() {
        return "✅ Dados encontrados!: CEP: " + cep + " | Rua: " + logradouro +
                " | Bairro: " + bairro + " | Estado: " + estado +
                " | IBGE: " + ibge;
    }
}
