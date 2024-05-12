package com.aluracursos.conversordemonedas.principal;

import com.aluracursos.conversordemonedas.modulos.ConsultaTipoDeCambio;
import com.aluracursos.conversordemonedas.modulos.GenerarConversion;
import com.aluracursos.conversordemonedas.modulos.GenerarHistorialDeConversiones;
import com.aluracursos.conversordemonedas.modulos.TipoDeCambio;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String menu = """
        SELECCION LA OPCION QUE DESEA REALIZAR
         
        1- PESO MEXICANO A DOLAR.
        2- DOLAR A PESO MEXICANO.
        3- PESO MEXICANO A EURO.
        4- EURO A PESO MEXICANO.
        5- PESO MEXICANO A YEN JAPONES.
        6- YEN JAPONES A PESO MEXICANO.
        7- HISTORIAL DE CONVERSIONES.
        8- SALIR.
        """;
        String moneda;
        String cambioAMoneda;
        double conversion;
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        GenerarConversion generarConversion = new GenerarConversion();
        GenerarHistorialDeConversiones historial = new GenerarHistorialDeConversiones();

        while(opcion != 8)
        {
            try {
                System.out.println(menu);
                opcion = Integer.valueOf(teclado.nextLine());
                switch(opcion)
                {
                    case 1:moneda = "MXN";
                        cambioAMoneda = "USD";
                        generarConversion = new GenerarConversion();
                        generarConversion.conversionATipoDeCambio(moneda,cambioAMoneda);

                        break;
                    case 2: moneda = "USD";
                        cambioAMoneda = "MXN";
                        generarConversion = new GenerarConversion();
                        generarConversion.conversionATipoDeCambio(moneda,cambioAMoneda);
                        break;
                    case 3: moneda = "MXN";
                        cambioAMoneda = "EUR";
                        generarConversion = new GenerarConversion();
                        generarConversion.conversionATipoDeCambio(moneda,cambioAMoneda);
                        break;
                    case 4: moneda = "EUR";
                        cambioAMoneda = "MXN";
                        generarConversion = new GenerarConversion();
                        generarConversion.conversionATipoDeCambio(moneda,cambioAMoneda);
                        break;
                    case 5: moneda = "MXN";
                        cambioAMoneda = "JPY";
                        generarConversion = new GenerarConversion();
                        generarConversion.conversionATipoDeCambio(moneda,cambioAMoneda);
                        break;
                    case 6: moneda = "JPY";
                        cambioAMoneda = "MXN";
                        generarConversion = new GenerarConversion();
                        generarConversion.conversionATipoDeCambio(moneda,cambioAMoneda);
                    case 7:
                            historial.mostrarHistorial();
                        break;
            }
            }catch (NumberFormatException e)
            {
                System.out.println("Formato de opcion no valida " + e.getMessage());
            } catch (RuntimeException | IOException e) {
                System.out.println(e.getMessage());
                System.out.println("Ocurrio un error intente nuevamente");
            }
        }
    }
}
