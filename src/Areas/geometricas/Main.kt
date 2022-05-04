package Areas.geometricas

fun main(){

    var arrayAleatorio = ArrayList<Forma>()

    val retangulo1: Forma = Retangulo(3f, 5f)
    val circulo1: Forma = Circulo(7f)
    val circulo2: Forma = Circulo(6f)
    val retangulo2: Forma = Retangulo(7f, 99f)
    val quadrado1: Forma = Quadrado(3f)

    arrayAleatorio.add(retangulo1)
    arrayAleatorio.add(retangulo2)
    arrayAleatorio.add(circulo1)
    arrayAleatorio.add(circulo2)
    arrayAleatorio.add(quadrado1)


    arrayAleatorio.forEach {
        println("Área: " + it.calcularArea())
        println("Perimêtro: " + it.calcularPerimetro())
        println("")
        println("---------------------------------------------------")
        println("")
    }
}

