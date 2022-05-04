package Loja

abstract class Loja(var nome: String,
                    var preco: Double,
                    var codigoDeBarras: Int){

    abstract fun mostrarDetalhesDoItem()
        override fun equals(other: Any?): Boolean {
            return codigoDeBarras == other
        }
}