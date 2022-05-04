package Loja

class CDs (nome: String, preco: Double, codigoDeBarras: Int, val numeroDeFaixas: Int): Loja(nome, preco, codigoDeBarras) {

    override fun mostrarDetalhesDoItem() {
        println("Nome = $nome")
        println("Preço = $preco")
        println("Número de faixas = $numeroDeFaixas")
        println("Código de barras = $codigoDeBarras")
    }
}