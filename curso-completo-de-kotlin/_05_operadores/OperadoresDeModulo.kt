package _05_operadores

fun main() {
    // --- Operadores de Módulo ---
    // %
    // rem()
    // mod()

    var n1 = 10
    // Se o resto for 0, então é par
    if (n1 % 2 == 0) {
        println("$n1 é par")
    } else {
        println("$n1 é ímpar")
    }

    println()

    println("10 % 3 = ${10 % 3}")
    println("10.rem(3) = ${10.rem(3)}")
    println("10.mod(3) = ${10.mod(3)}")

    println()

    println("-10 % 3 = ${-10 % 3}")
    println("(-10).rem(3) = ${(-10).rem(3)}")
    println("(-10).mod(3) = ${(-10).mod(3)}")

    println()

    println("10 % -3 = ${10 % -3}")
    println("10.rem(-3) = ${10.rem(-3)}")
    println("10.mod(-3) = ${10.mod(-3)}")
}