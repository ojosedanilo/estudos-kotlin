package _03_tipos_de_dados

fun main() {
    /*
    ----- Booleano ---
    Tipo       | Tamanho (bits) | Faixa de Valores
    Boolean    | 1*             | true ou false
    * Representa fundamentalmente um único bit de informação (verdadeira ou falsa).
      No entanto, devido a limitações de hardware e endereçamento de memória, ele
      normalmente é armazenado na memória como um valor 8 bits (1 byte), a menor
      unidade endereçável de memória na maioria dos sistemas.
    */

    var estaChovendo: Boolean = false
    var estaChovendo2: Boolean = true

    if (estaChovendo) {
        println("Não irei sair")
    } else {
        println("Irei sair")
    }

    if (estaChovendo2) {
        println("Não irei sair")
    } else {
        println("Irei sair")
    }

    println(estaChovendo.toString() + " " + estaChovendo::class.qualifiedName)
}