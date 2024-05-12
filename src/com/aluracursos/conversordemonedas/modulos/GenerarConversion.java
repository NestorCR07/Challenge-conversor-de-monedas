package com.aluracursos.conversordemonedas.modulos;

import java.io.IOException;
import java.util.Scanner;

public class GenerarConversion {
    public void conversionATipoDeCambio(String moneda ,String conversionAMoneda) throws IOException {
        double valorDeTipoDeCambio;
        double conversion;
        double cantidadAConvertir;
        ConsultaTipoDeCambio consulta = new ConsultaTipoDeCambio();
        Scanner teclado = new Scanner(System.in);
        GenerarHistorialDeConversiones historial = new GenerarHistorialDeConversiones();

        TipoDeCambio tipoDeCambio = consulta.buscaTipoDeCambio(moneda);
        System.out.println("Ingrese la cantidad de "+ moneda +" que requiere convertir: ");
        cantidadAConvertir = teclado.nextDouble();

         valorDeTipoDeCambio = tipoDeCambio.conversion_rates().get(conversionAMoneda);
         conversion = cantidadAConvertir * valorDeTipoDeCambio;
         historial.guardarHistorialDeConversion(moneda,cantidadAConvertir,conversionAMoneda,conversion);

        System.out.println("El tipo de cambio es: " + valorDeTipoDeCambio + " " + conversionAMoneda);
         System.out.println("La Conversion es de: " + conversion + " " + conversionAMoneda);
    }
}
