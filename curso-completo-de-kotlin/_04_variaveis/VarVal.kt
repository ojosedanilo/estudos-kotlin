package _04_variaveis

// const val -> Só pode ser declarado em top level ou dentro
//              de companion object dentro de uma classe
//              A atribuição é feita em tempo de compilação
const val PI = 3.1415926

fun main() {
    // var -> A referência pode ser alterado
    // val -> A referência não pode ser alterado
    //        A atribuição é feita em tempo de execução

    var s1: String = "Maria"
    println(s1)
    s1 = "José"
    println(s1)

    val s2: String = "ABC"
    println(s2)

    // Não posso mudar o valor de s2 nem de PI
    // s2 = "XYZ"
    // PI = 3.14159
}

class Exemplo {
    companion object {
        const val PI = 3.1415926
    }
}