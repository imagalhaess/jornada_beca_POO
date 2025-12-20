package API;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Scanner;

public class Main_API {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
//        System.out.println("Digite o nome do livro para a busca: ");
//        var search_books = input.nextLine();
//        String address_books = "https://www.googleapis.com/books/v1/volumes?q=" + search_books +
//                "&key=AIzaSyDkbs_F16L9up-vcdETHPugleElWgV7c08";
//        HttpClient client_books = HttpClient.newHttpClient();
//        HttpRequest request_books = HttpRequest.newBuilder()
//                .uri(URI.create(address_books))
//                .build();
//        HttpResponse<String> response_books = client_books
//                .send(request_books, HttpResponse.BodyHandlers.ofString());
//        System.out.println(response_books.body());
//
//        System.out.println("Digite a moeda para cotação: ");
//        var search_coin = input.nextLine();
//        String address_coin = "https://api.coingecko.com/api/v3/simple/price?vs_currencies=usd&ids=" + search_coin +
//                "&x_cg_demo_api_key=CG-ze7V3dNd6teMb8A2nMaQHpkz";
//        HttpClient client_coin = HttpClient.newHttpClient();
//        HttpRequest request_coin = HttpRequest.newBuilder()
//                .uri(URI.create(address_coin))
//                .build();
//        HttpResponse<String> response_coin = client_coin
//                .send(request_coin, HttpResponse.BodyHandlers.ofString());
//        System.out.println(response_coin.body());

        // API do MealDB (Site fora do ar em 18-12-25)
//        System.out.print("Digite uma receita para busca: ");
//        var search_meal = input.nextLine();
//        String address_meal = "https://themealdb.com/api/json/v1/1/search.php?s=" + search_meal;
//        HttpClient client_meal = HttpClient.newHttpClient();
//        HttpRequest request_meal= HttpRequest.newBuilder()
//                .uri(URI.create(address_meal))
//                .build();
//        HttpResponse<String> response_meal = client_meal
//                .send(request_meal, HttpResponse.BodyHandlers.ofString());
//        System.out.println(response_meal.body());

        String json = "{\"nome\":\"Isa\",\"idade\":32,\"cidade\":\"Udi\"}";
        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(json, Pessoa.class);
        System.out.println("Json: " + pessoa);
        String json2 = "{\"nome\":\"Isa\", \"email\":\"isa@teste.com\"}";
        Gson gson2 = new Gson();
        Pessoa pessoa2 = gson2.fromJson(json2, Pessoa.class);
        System.out.println("Json: " + pessoa2);

        String jsonLivro = "{\"nome\":\"Crepusculo\", \"autor\":\"João\"," +
                "\"ano\":2005,\"editora\":{"+"\"nome\":\"DarkSide\"," +
        "\"genero\": \"Terror\"}"+"}";
        Gson gsonLivro = new Gson();
        Livro livro = gsonLivro.fromJson(jsonLivro, Livro.class);
        System.out.println(livro);
    }
}
