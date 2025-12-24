package _03_tipos_de_dados

fun main() {
    var s1 = "Sol"
    var s2 = "Sol"
    var s3 = StringBuilder().append("S").append("ol").toString()

    println(s1)
    println(s2)
    println(s3)

    // O conteúdo de s2 está no mesmo espaço de memória que o conteúdo de s1
    println(s1===s2)
    // O conteúdo de s3 está em outro espaço de memória que o conteúdo de s1
    println(s1===s3)
}