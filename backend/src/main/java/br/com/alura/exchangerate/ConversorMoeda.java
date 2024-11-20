package br.com.alura.exchangerate;

import br.com.alura.Moeda;
import br.com.alura.exchangerate.DTO.Pair;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ConversorMoeda {

    public static double converte(Moeda moedaOrigem, Moeda moedaDestino, double valor) {
        double resultado;

        URI uri = URI.create("https://v6.exchangerate-api.com/v6/165cc4bf997afba0c9d08f3d/pair/" + moedaOrigem + "/" + moedaDestino + "/" + valor);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            Pair pair = gson.fromJson(response.body(), Pair.class);
            resultado = pair.conversion_result();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Erro ao converter moeda");
        }

        return resultado;
    }
}
