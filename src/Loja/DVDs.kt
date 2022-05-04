package Loja

class DVDs (nome: String, preco: Double, codigoDeBarras: Int, val duracao: Int): Loja(nome, preco, codigoDeBarras) {

    override fun mostrarDetalhesDoItem() {
        println("Nome = $nome")
        println("Preço = $preco")
        println("Duração = $duracao")
        println("Código de barras = $codigoDeBarras")
    }
}