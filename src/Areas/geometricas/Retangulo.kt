package Areas.geometricas

    open class Retangulo(
        open var lado: Float,
        open var altura: Float): Forma(){

        override fun calcularArea(): Float{
            return lado * altura
        }
        override fun calcularPerimetro(): Float{
            return (lado + altura)*2

        }

        }

