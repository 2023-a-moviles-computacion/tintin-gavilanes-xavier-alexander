package constructors

class Helados {
    var idHelado: Number = 0;
    var nombreHelado: String  =" ";
    var sabor1: String =" ";
    var sabor2: String =" ";
    var precio: Double = 0.0
    var chispas: Number = 0;

    constructor(idHelado: Number, nombreHelado: String, sabor1: String, sabor2: String, precio: Double, chispas: Number) {
        this.idHelado = idHelado
        this.nombreHelado = nombreHelado
        this.sabor1 = sabor1
        this.sabor2 = sabor2
        this.precio = precio
        this.chispas = chispas
    }

    override fun toString(): String {
        return """
        Helado Details:
        ID Helado: $idHelado
        Nombre del Helado: $nombreHelado
        Sabor 1: $sabor1
        Sabor 2: $sabor2
        Precio: $precio
        Chispas: $chispas
    """.trimIndent()
    }
}