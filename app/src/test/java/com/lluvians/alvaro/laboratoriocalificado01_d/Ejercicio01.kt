package com.lluvians.alvaro.laboratoriocalificado01_d

import org.junit.Test

class Ejercicio01 {
    @Test
    fun main() {
        val palabra = "todo culpa de mel"

        val resultado = contarFrecuencia(palabra)

        println("Frecuencia de caracteres en '$palabra': $resultado")
        // Salida: {h=1, e=1, l=2, o=1}
    }


    private fun contarFrecuencia(palabra: String): Map<Char, Int> {
        val frecuencia = mutableMapOf<Char, Int>()

        for (caracter in palabra) {
            frecuencia[caracter] = frecuencia.getOrDefault(caracter, 0) + 1
        }

        return frecuencia
    }


}