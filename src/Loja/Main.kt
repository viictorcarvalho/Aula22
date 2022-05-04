import Loja.CDs
import Loja.DVDs
import Loja.Livros
import Loja.Loja

fun main() {
    val itens : ArrayList<Loja> = ArrayList()

    val cd1 : Loja = CDs("Cazuza", 15.90, 987657, 15)
    val cd2 : Loja = CDs("Mamonas Assassinas", 19.8, 543215, 13)
    val dvd1 : Loja = DVDs("Exaltassamba", 49.7, 989888, 80)
    val dvd2 : Loja = DVDs("Belo", 39.0, 132145, 76)
    val livro1 : Loja = Livros("Harry Potter", 20.6, 987651, "J. K. Rowling")
    val livro2 : Loja = Livros("Senhor dos Anéis", 100.0, 123670, "Towkin")

    itens.add(cd1)
    itens.add(cd2)
    itens.add(dvd1)
    itens.add(dvd2)
    itens.add(livro1)
    itens.add(livro2)

    itens.forEach{
        it.mostrarDetalhesDoItem()
        val codigoExemplo = 123670
        println("O item tem o código de barras: $codigoExemplo .. ${it.equals(codigoExemplo)}")
        println("")
        println("--------------------------------------------------------------------")
        println("")
    }
}