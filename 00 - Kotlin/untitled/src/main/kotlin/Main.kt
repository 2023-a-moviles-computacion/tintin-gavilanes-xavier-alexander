import java.util.*

fun main(args: Array<String>) {
    println("Hello World!")

    // Tipos de Variable
    // INMUTABLES (No se reasignan "=")
    val inmutable: String = "Adrian";
    // inmutable = "Vicente";

    // Mutables (Re asignar)
    var mutable: String = "Vicente";
    mutable = "Adrian";

    // val > var

    // Duck Typing
    val ejemploVariable = "Xavier Tintin"
    val edadEjemplo: Int = 12
    ejemploVariable.trim()
    // ejemploVariable = edadEjemplo;

    // Variable primitiva
    val nombreProfesor: String = "Xavier Tintin"
    val sueldo: Double = 1.2
    val estadoCivil: Char = 'C'
    val mayorEdad: Boolean = true

    // Clases Java
    val fechaNacimiento: Date = Date()

    // Switch
    val estadoCivilWhen = "C"
    when (estadoCivilWhen) {
        ("C") -> {
            println("Casado")
        }

        "S" -> {
            println("Soltero")
        }

        else -> {
            println("No sabemos")
        }
    }

    val coqueto = if (estadoCivilWhen == "S") "Si" else "No"

    calcularSueldo(10.00)
    calcularSueldo(10.00, 12.00, 20.00)
    calcularSueldo(10.00, bonoEspecial = 20.00) // Named parameters
    calcularSueldo(bonoEspecial = 20.00, sueldo = 10.00, tasa = 14.00)
}

fun imprimirNombre(nombre: String): Unit {
    println("Nombre: ${nombre}")
}

fun calcularSueldo(
    sueldo: Double,
    tasa: Double = 12.00,
    bonoEspecial: Double? = null,
): Double{
    if (bonoEspecial == null){
        return sueldo * (100/tasa)
    } else{
        return sueldo * (100/tasa) + bonoEspecial
    }
}

abstract class NumerosJava{
    protected val numeroUno: Int
    private val numeroDos: Int
    constructor(
        uno: Int,
        dos: Int
    ){
        this.numeroUno = uno
        this.numeroDos = dos
        println("Inicializando")
    }
}

abstract class Numeros( // Constructor primario
    // Ejemplo
    // uno: Int, (Parametro (sin modificador de acceso)
    // public var uno: Int, // Propiedad publica Clase numeros.uno
    // var uno: Int, // Propiedad de la clase (por defecto es Public)
    // public var uno: Int,
    protected val numeroUno: Int, //propiedad de la calse protected numeros.numeroUno
    protected val numeroDos: Int, //propiedad de la calse protected numeros.numeroDos
){
    // var cedula: string = "" (public es por defecto)
    // private valorCalculado: Int = 0 (private)
    init{
        this.numeroUno;
        this.numeroDos; //this es opcional
        println("Iniicalizando")
    }
}

class Suma(//Constructor primario suma
    uno: Int, //Parametro
    dos: Int //Parametro
):Numeros(uno,dos){ //<- Constructor del padre
    init { //Bloque constructor primario, "Init" SOLO VA EN EL CONSTRUCTOR PRIMARIO
        this.numeroUno; numeroUno;
        this.numeroDos; numeroDos;
        //Los this pertenecen al padre, los que no contiene this
        //pertenecen al hijo
    }

    constructor(//Segundo constructor
        uno:Int?, //parametros
        dos:Int //Parametros
    ):this( //Llamada al constructor primario
        if (uno == null) 0 else uno,
        dos
        //Usamos el this para llamar a la clase padre, al consturctor primario
    ) {
        numeroUno; //Si necesitamos bloque de codigo lo usamos
    }

    constructor( //Tercer constructor
        uno: Int,
        dos: Int?
    ):this(
        uno,
        if(dos == null) 0 else dos
    )//Si no necesitamos un bloque de codio "{}" lo omitimos

    constructor(//Cuarto constructor
        uno: Int?,
        dos: Int?
    ):this(
        if (uno == null) 0 else uno,
        if(dos == null) 0 else dos
    )

    public fun sumar():Int{ // public es por defecto, tambien se puede usar private o protected
        val total = numeroUno + numeroDos;
        agregarHistorial(total)
        return total;
    }

    companion object{//Atributos y métodos "compartidos" - Es parecido al static
    //entre las instancias
    val pi = 3.14
        fun elevarAlCuadrado(num: Int):Int{
            return num * num
        }
        val historialSuma = arrayListOf<Int>()
        fun agregarHistorial(valorNuevaSuma:Int){
            historialSuma.add(valorNuevaSuma)
        }
    }
}
