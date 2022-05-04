package Areas.geometricas

    open class Circulo (var raio: Float): Forma(){

        override fun calcularArea(): Float{
            return 3.14f * raio * raio

        }
        override fun calcularPerimetro(): Float{
            return 3.14f * raio * 2

        }
}