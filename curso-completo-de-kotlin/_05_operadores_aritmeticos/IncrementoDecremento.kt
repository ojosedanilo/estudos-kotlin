package _05_operadores_aritmeticos

fun main() {
    var n1 = 10
    println("n1 = $n1")
    println()

    n1++ // n1 = n1 + 1
    println("n1 = $n1")
    println()

    n1-- // n1 = n1 - 1
    println("n1 = $n1")
    println()

    println("n1 = $n1")
    println("n1 = ${n1++}") // Mostra n1 e depois incrementa
    println("n1 = ${++n1}") // Incrementa n1 e depois mostra
    println()

    println("n1 = $n1")
    println("n1 = ${n1--}") // Mostra n1 e depois decrementa
    println("n1 = ${--n1}") // Decrementa n1 e depois mostra
}