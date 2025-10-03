package integradores.clase31;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;

public class Main {


    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    void main() throws IOException, InterruptedException {
        String url = "https://randomuser.me/api/";
        HttpResponse<String> jsonResponse = makeRequest(url);
        String json = jsonResponse.body();
        IO.println(json);
        json = json.replace("{\"results\":", "");

        String formatedJson = "";
        int index = 0;
        while (json.charAt(index) != ']'){
            IO.println("indice: " + index);
            formatedJson = formatedJson.concat(String.valueOf(json.charAt(index)));
            index++;
        }

        formatedJson = formatedJson.concat("]");


        IO.println(formatedJson);
        Gson gson = new Gson();
        Usuario[] usuarios = gson.fromJson(formatedJson, Usuario[].class);
        IO.println(usuarios[0]);
    }


    public static HttpResponse<String> makeRequest(String url) throws MalformedURLException, IOException, InterruptedException {
        // 1. Crear el cliente HTTP
        HttpClient cliente = HttpClient.newHttpClient();

        // 2. Construir la solicitud GET
        HttpRequest solicitud = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET() // Opcional, GET es el método por defecto
                .build();

        // 3. Enviar la solicitud y obtener la respuesta
        HttpResponse<String> respuesta = cliente.send(
                solicitud,
                HttpResponse.BodyHandlers.ofString()
        );
        return respuesta;
    }


}
