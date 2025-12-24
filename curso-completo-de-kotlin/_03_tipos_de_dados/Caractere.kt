package _03_tipos_de_dados

fun main() {
    /*
    ----- Caractere ---
    Tipo       | Tamanho (bits) | Faixa de Valores
    Char       | 16             | '\u0000' (NUL) até '\uffff' (o último caractere Unicode de 16 bits)
    */

    var caractere: Char = 'A' // Não pode usar aspas duplas ("")

    for (letra in 'A'..'Z') {
        print("$letra  ")
    }
    println()
    for (letra in 'A'..'Z') {
        print("${letra.code} ")
    }
    println()

    println(caractere + " " + caractere::class.qualifiedName)
}