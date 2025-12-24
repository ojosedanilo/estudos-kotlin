package _03_tipos_de_dados

fun main() {
    /*
    ----- Decimais ---
    Tipo       | Tamanho (bits) | Faixa de Valores
    Float      | 32             | Aproximadamente ±3.4 x 10^38
    Double     | 64             | Aproximadamente ±1.8 x 10^308
    */

    var numFloat: Float = 100.5F // Precisa colocar o F ou f no final
    numFloat = 100.5f // Também pode usar f no final
    var numFloat2 = 150.0F

    var numDouble: Double = 100.5
    var numDouble2 = 150.0

    var numFloat3 = 0.1F + 0.1F + 0.1F
    var numDouble3 = 0.1 + 0.1 + 0.1 // Também poderia ser .1 + .1 + .1

    println(numFloat3.toString() + " " + numFloat3::class.qualifiedName)
    println(numDouble3.toString() + " " + numDouble3::class.qualifiedName)
}