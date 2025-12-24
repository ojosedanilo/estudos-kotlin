package _03_tipos_de_dados

fun main() {
    /*
    ----- Inteiros ---
    Tipo       | Tamanho (bits) | Faixa de Valores
    Byte       | 8              | -128 a 127
    Short      | 16             | -32_768 a -32_767
    Int        | 32             | -2_147_483_648 a 2_147_483_647
    Long       | 64             | -9_223_372_036_854_775_808 a 9_223_372_036_854_775_807

    ----- Inteiros Postivos ---
    Tipo       | Tamanho (bits) | Faixa de Valores
    UByte      | 8              | 0 a 255
    UShort     | 16             | 0 a 65_535
    UInt       | 32             | 0 a 4_294_967_295
    ULong      | 64             | 0 a 18_446_744_073_709_551_615
    */

    var numByte: Byte // Criação da cariável
    numByte = 127 // Inicialização da variável
    var numShort: Short = 32_767 // Criação e inicialização da variável da cariável
    var numInt = 2_147_483_647 // Inicialização da variável com inferência de tipo
    var numLong: Long = 9_223_372_036_854_775_807

    var numUByte: UByte = 255.toUByte()
    var numUShort: UShort = 65_535.toUShort()
    var numUInt: UInt = 4_294_967_295.toUInt()
    var numULong: ULong = 18_446_744_073_709_551_615UL

    println(numByte.toString() + " " + numByte::class.qualifiedName)
    println(numShort.toString() + " " + numShort::class.qualifiedName)
    println(numInt.toString() + " " + numInt::class.qualifiedName)
    println(numLong.toString() + " " + numLong::class.qualifiedName)

    println(numUByte.toString() + " " + numUByte::class.qualifiedName)
    println(numUShort.toString() + " " + numUShort::class.qualifiedName)
    println(numUInt.toString() + " " + numUInt::class.qualifiedName)
    println(numULong.toString() + " " + numULong::class.qualifiedName)
}