package API;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main_API {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        // API Google Books
        System.out.println("Digite o nome do livro para a busca: ");
        var search_books = input.nextLine();
        String address_books = "https://www.googleapis.com/books/v1/volumes?q=" + search_books +
                "&key=AIzaSyDkbs_F16L9up-vcdETHPugleElWgV7c08";
        HttpClient client_books = HttpClient.newHttpClient();
        HttpRequest request_books = HttpRequest.newBuilder()
                .uri(URI.create(address_books))
                .build();
        HttpResponse<String> response_books = client_books
                .send(request_books, HttpResponse.BodyHandlers.ofString());
        System.out.println(response_books.body());

        // API CoinGecko
        System.out.println("Digite a moeda para cotação: ");
        var search_coin = input.nextLine();
        String address_coin = "https://api.coingecko.com/api/v3/simple/price?vs_currencies=usd&ids=" + search_coin +
                "&x_cg_demo_api_key=CG-ze7V3dNd6teMb8A2nMaQHpkz";
        HttpClient client_coin = HttpClient.newHttpClient();
        HttpRequest request_coin = HttpRequest.newBuilder()
                .uri(URI.create(address_coin))
                .build();
        HttpResponse<String> response_coin = client_coin
                .send(request_coin, HttpResponse.BodyHandlers.ofString());
        System.out.println(response_coin.body());

        // API do MealDB (Site fora do ar em 18-12-25)
        System.out.print("Digite uma receita para busca: ");
        var search_meal = input.nextLine();
        String address_meal = "https://themealdb.com/api/json/v1/1/search.php?s=" + search_meal;
        HttpClient client_meal = HttpClient.newHttpClient();
        HttpRequest request_meal= HttpRequest.newBuilder()
                .uri(URI.create(address_meal))
                .build();
        HttpResponse<String> response_meal = client_meal
                .send(request_meal, HttpResponse.BodyHandlers.ofString());
        System.out.println(response_meal.body());
    }
    }
