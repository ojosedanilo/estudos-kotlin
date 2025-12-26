package _06_estruturas_condicionais

fun main() {
    var media = 10.0

    if (media == 10.0) {
        println("PARABÉNS")
    } else if (media >= 7.0) {
        println("APROVADO")
    } else if (media >= 5.0) {
        println("RECUPERAÇÃO")
    } else if (media > 0.0) {
        println("REPROVADO")
    } else if (media == 0.0) {
        println("REPROVADO COM LOUVOR")
    } else {
        if (media > 10.0) {
            println("PONTUAÇÃO ACIMA DE 10")
        } else {
            println("PONTUAÇÃO NEGATIVA")
        }
    }
}