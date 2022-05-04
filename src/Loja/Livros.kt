package Loja

class Livros (nome: String, preco: Double, codigoDeBarras: Int, val autor: String): Loja(nome, preco, codigoDeBarras){

    override fun mostrarDetalhesDoItem() {
        println("Nome = $nome")
        println("Preço = $preco")
        println("Autor = $autor")
        println("Código de barras = $codigoDeBarras")
    }
}