package app

import vitrine.Xpto
import carrinho.Produto as ProdCarrinho
import vitrine.Produto as ProdVitrine

fun main() {
    val cadProdCarrinho = ProdCarrinho(1, 850.0, 5)
    val cadProdVitrine = ProdVitrine(1, "Monitor", 850.0)
    val xpto = Xpto()
}