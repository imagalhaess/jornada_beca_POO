package br.com.imagalhaess.viacep.services;

import br.com.imagalhaess.viacep.exceptions.CepNotFound;
import br.com.imagalhaess.viacep.exceptions.InvalidParameter;
import br.com.imagalhaess.viacep.models.Dados;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ViaCepService {

    public Dados buscar (String cep) throws InterruptedException, IOException, InvalidParameter, CepNotFound {
        Gson gson = new Gson();
        String viaCepUrl = "https://viacep.com.br/ws/" + cep + "/json/";
            if (cep.length() != 8 || !cep.matches("[0-9]+")) {
                throw new InvalidParameter("❌ O CEP deve ter um total de 08 " +
                                                   "dígitos e conter" +
                                                   " apenas números de 0 a 9.");
            }
            HttpClient clientViaCep = HttpClient.newHttpClient();
            HttpRequest requestViaCep = HttpRequest.newBuilder()
                    .uri(URI.create(viaCepUrl))
                    .build();
            HttpResponse<String> responseViaCep = clientViaCep
                    .send(requestViaCep, HttpResponse.BodyHandlers.ofString());

            String json = responseViaCep.body();
            Dados dados = gson.fromJson(json, Dados.class);
        if (dados.isErro()) {
            throw new CepNotFound("❌ CEP não encontrado no nosso banco de dados. Por favor," +
                                          " tente novamente.");
        }
        return dados;
    }

}

