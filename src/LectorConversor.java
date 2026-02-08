import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;
import java.util.Scanner;

public class LectorConversor {
    public static void convertirMoneda(String monedaBase, String monedaResultado) {

        try {
            ConsultaMoneda consulta = new ConsultaMoneda();
            RespuestaMoneda respuestaMoneda = consulta.busquedaMoneda(monedaBase);
            GeneradorArchivos generador = new GeneradorArchivos();
            generador.guardarJson(respuestaMoneda);

            Scanner convertir = new Scanner(System.in);
            System.out.println("Ingrese el valor que desea convertir:");
            double valor = convertir.nextDouble();


            JsonObject jsonObject = JsonParser.parseReader(
                    new FileReader(monedaBase + ".json")
            ).getAsJsonObject();

            JsonObject monedas = jsonObject.getAsJsonObject("conversion_rates");
            double ars = monedas.get(monedaResultado.toUpperCase()).getAsDouble();



            System.out.println(
                    "El valor de " + valor + " [" + monedaBase + "] corresponde a =>>> "
                            + (ars * valor) + " [" + monedaResultado.toUpperCase() + "] "
            );

        } catch (Exception e) {
            System.out.println("Error al leer el archivo de moneda: " + e.getMessage());
        }
    }

}