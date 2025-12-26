package _05_operadores

fun main() {
    /*
    Mulher E Maior de Idade
    && - E
    true  && true  -> true
    true  && false -> false
    false && true  -> false
    false && false -> false

    Guaraná OU Coca-Cola
    || - OU
    true  || true  -> true
    true  || false -> true
    false || true  -> true
    false || false -> false

    Beber OU EXCLUSIVO DIRIGIR
    xor - OU EXCLUSIVO
    true  || true  -> false
    true  || false -> true
    false || true  -> true
    false || false -> false
    */

    var idade = 17
    var sexo = 'F'
    var emancipado = true

    // if (sexo == 'F' && (idade > 17 || emancipado))
    if (idade > 17 && sexo == 'F' || emancipado && sexo == 'F') {
        println("Pode fazer consulta")
    }

    var beber = false
    var dirigir = true

    if (beber xor dirigir) {
        println("")
    }
}