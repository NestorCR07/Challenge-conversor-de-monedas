package com.aluracursos.conversordemonedas.principal;

import com.aluracursos.conversordemonedas.modulos.ConsultaTipoDeCambio;
import com.aluracursos.conversordemonedas.modulos.TipoDeCambio;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String moneda;
        Scanner teclado = new Scanner(System.in);
        ConsultaTipoDeCambio consulta = new ConsultaTipoDeCambio();

        System.out.println("Que tipo de cambio de moneda deseas consultar? ");
        moneda = teclado.nextLine();

        TipoDeCambio tipoDeCambio = consulta.buscaTipoDeCambio(moneda);
        System.out.println(moneda);

        System.out.println(tipoDeCambio);


    }
}
