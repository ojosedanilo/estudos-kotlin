package _05_operadores

fun main() {
    var n1 = "Carro"
    var n2 = 20

    // Quando o primeiro elemento de uma adição é uma
    // String, assume-se que o resultado é uma String
    // e então concatena (junta) os operandos
    var resultado = n1 + n2
    println(resultado)

    // Mas a linha abaixo dá erro
    // var resultado2 = n2 + n1
    // Uma solução seria começar com uma String vazia
    var resultado2 = "" + n2 + n1
    println(resultado2)

    // Também poderia converter n2 para uma string
    resultado2 = n2.toString() + n1
    println(resultado2)
}