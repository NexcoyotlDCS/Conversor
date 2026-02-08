import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

    public RespuestaMoneda busquedaMoneda(String moneda) {

        URI consulta = URI.create("https://v6.exchangerate-api.com/v6/137a3d1b64756cfe9883545a/latest/" + moneda);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(consulta)
                .GET()
                .build();
        try {
            HttpResponse<String> respuesta = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(respuesta.body(), RespuestaMoneda.class);
        } catch (Exception e) {
            throw new RuntimeException("Error de moneda");
        }
    }
}
