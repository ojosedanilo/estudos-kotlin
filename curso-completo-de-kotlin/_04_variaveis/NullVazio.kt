package _04_variaveis

fun main() {
    var s1 = "Lua"
    var s2 = ""
    var s3 = null
    var s4: String? = null

    println(s1)
    println(s2)
    println(s3)
    println(s4)

    s2 = "Sol"

    // Não pode definir s3 como Azul se a inicializar apenas como null
    // s3 = "Azul"

    s4 = "Azul"

    // Só pode definir s1 como null se usar ? no final do tipo inicializado
    // s1 = null

    println(s1)
    println(s2)
    println(s3)
    println(s4)
}