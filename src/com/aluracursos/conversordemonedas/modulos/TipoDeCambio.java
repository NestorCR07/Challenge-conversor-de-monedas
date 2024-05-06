package com.aluracursos.conversordemonedas.modulos;

import java.util.ArrayList;
import java.util.Map;

public record TipoDeCambio(String base_code, Map<String, Double> conversion_rates) {
}
