class Helados {
    var idPlaneta: String = "";
    var nombreHelado: String  =" ";
    var sabor1: String =" ";
    var sabor2: String =" ";
    var precio: Double = 0.0
    var chispas: Int = 0;

    constructor(idPlaneta: String, nombreHelado: String, sabor1: String, sabor2: String, precio: Double, chispas: Number) {
        this.idPlaneta = idPlaneta
        this.nombreHelado = nombreHelado
        this.sabor1 = sabor1
        this.sabor2 = sabor2
        this.precio = precio
        this.chispas = chispas
    }
}