package _06_estruturas_condicionais

fun main() {
    var media = 10.0

    when {
        media == 10.0 -> println("PARABÉNS")
        media >= 7.0 -> println("APROVADO")
        media >= 5.0 -> println("RECUPERAÇÃO")
        media == 0.0 -> println("REPROVADO COM LOUVOR")
        else -> println("REPROVADO")
    }

    var resultado = when (media) {
        10.0 -> "PARABÉNS"
        in 7.0..9.99 -> "APROVADO"
        in 5.0..6.99 -> "RECUPERAÇÃO"
        0.0 -> "REPROVADO COM LOUVOR"
        else -> "REPROVADO"
    }

    println(resultado)
}