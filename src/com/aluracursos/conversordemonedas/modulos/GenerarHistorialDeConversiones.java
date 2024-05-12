package com.aluracursos.conversordemonedas.modulos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.time.LocalDateTime;

public class GenerarHistorialDeConversiones {
    public void guardarHistorialDeConversion(String monedaInicial, double monedaInicialCantidad,
                                             String monedaFinal, double monedaFinalCantidad) throws IOException {

        LocalDateTime fecha = LocalDateTime.now();

        FileWriter escritura = new FileWriter("Historial-De-Conversiones.txt",true);
        escritura.write("Modena Inicial: "+ monedaInicialCantidad +" "+ monedaInicial+"\n");
        escritura.write("Conversion: "+ monedaFinalCantidad +" "+ monedaFinal+"\n");
        escritura.write("Fecha De Conversion: " + fecha.getDayOfMonth() + " de "
                + fecha.getMonth() + " de " + fecha.getYear()+ " " +
                fecha.getHour()+":"+ fecha.getMinute()+":"+ fecha.getSecond()+ "\n \n");
        escritura.close();
    }
    public void mostrarHistorial()
    {
        try {
            FileReader lectura = new FileReader("Historial-De-Conversiones.txt");
            BufferedReader br = new BufferedReader(lectura);
            String linea;
            System.out.println("HISTORIAL DE CONVERSIONES");
            while((linea=br.readLine())!=null)
                System.out.println(linea);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
