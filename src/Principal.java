import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {

        Scanner opcion = new Scanner(System.in);


        int salir = 0;
        while (salir != 9 ) {
            System.out.println("*****************************************");

            System.out.println("Sea bienvenida/o al Conversor de Moneda ");

            System.out.println("\n1) Dólar =>> Peso argentino");
            System.out.println("2) Peso argentino =>> Dólar");
            System.out.println("3) Dólar =>> Peso mexicano");
            System.out.println("4) Peso mexicano =>> Dólar");
            System.out.println("5) Dólar =>> Real brasileño");
            System.out.println("6) Real brasileño =>> Dólar");
            System.out.println("7) Dólar =>> Peso colombiano");
            System.out.println("8) Peso colombiano =>> Dólar");
            System.out.println("9) Salir");
            System.out.println("Elija una opción válida");
            System.out.println("*****************************************\n");
            salir = opcion.nextInt();


            if (salir == 1) {
                LectorConversor.convertirMoneda("USD", "ARS");
            }
            else if (salir == 2) {
                LectorConversor.convertirMoneda("ARS", "USD");
            }
            else if (salir == 3) {
                LectorConversor.convertirMoneda("USD", "MXN");
            }
            else if (salir == 4) {
                LectorConversor.convertirMoneda("MXN", "USD");
            }
            else if (salir == 5) {
                LectorConversor.convertirMoneda("USD", "BRL");
            }
            else if (salir == 6) {
                LectorConversor.convertirMoneda("BRL", "USD");
            }
            else if (salir == 7) {
                LectorConversor.convertirMoneda("USD", "COP");
            }
            else if (salir == 8) {
                LectorConversor.convertirMoneda("COP", "USD");
            }

        }

    }
}
