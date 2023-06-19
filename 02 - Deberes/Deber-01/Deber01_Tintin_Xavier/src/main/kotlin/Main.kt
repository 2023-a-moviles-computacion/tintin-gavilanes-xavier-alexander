import java.io.File

fun main(args: Array<String>) {
    val heladerias = ArrayList<Heladeria>()
    val helados = ArrayList<Helados>()
    val fileManager = FileManager()
//    val pathSistemaSolar = "C://Users//escritorio.virtual9//Documents//GitHub//mov-com-2023A//herrera-mosquera-elisa-andrea-mov-com//Deber01//src//main//kotlin//SistemaSolar"
//    val pathPlaneta = "C://Users//escritorio.virtual9//Documents//GitHub//mov-com-2023A//herrera-mosquera-elisa-andrea-mov-com//Deber01//src//main//kotlin//Planetas"

    while (true) {
        println(
            "Hola!!\n" +
            "Seleciona una opcion\n" +
            "1: Heladeria\n" +
            "2: Helados\n" +
            "3: Salir"
        )
        print("Ingresa la opción: ")
        val option = readLine()?.uppercase()
        when (option) {
            "1" -> {
                var flagHeladerias = true

                while (flagHeladerias) {
                    println(
                        "Seleciona la opcion a realizar en la Heladeria\n" +
                                "1: Agregar Heladeria y Guardar Heladerias en un archivo\n" +
                                "2: Listar Heladerias\n" +
                                "3: Buscar Heladeria\n" +
                                "4: Eliminar Heladeria\n" +

                                "5: Regresar\n" +
                                "6: Salir"
                    )
                    print("Ingresa la opción: ")
                    var optionHeladerias = readLine()?.uppercase()

                    when (optionHeladerias) {
                        "1" -> {
                            val heladeria = ingresarHeladeria()
                            heladerias.add(heladeria)
                            println("\nHeladeria agregada exitosamente.\n")

                            val content = heladerias.joinToString("\n") { it.toString() }
                            fileManager.saveTextFile(fileName = pathSistemaSolar+"$heladeria.txt", content = content)
                            println("\nLa lista de heladerias se ha guardado en un archivo de texto.\n")
                        }
                        "2" -> {
                            println("\nListado de Heladerias:")
                            for (heladeria in heladerias) {
                                println("Nombre: ${heladeria.nombre}")
                                println("Direccion: ${heladeria.direccion}")
                                println("Telefono: ${heladeria.telefono}")
                                println("Calificacion: ${heladeria.calificacion}")
                                println("Capacidad: ${heladeria.capacidad}\n")
                            }
                        }
                        "3" -> {
                            print("\nIngresa el nombre de la Heladeria a buscar: ")
                            val nombreBusqueda = readLine().toString()
                            val resultadoBusqueda = heladerias.filter { it.nombre.equals(nombreBusqueda, ignoreCase = true) }
                            if (resultadoBusqueda.isNotEmpty()) {
                                println("\nHeladeria encontrado:")
                                val heladeriaEncontrado = resultadoBusqueda.first()
                                println("Nombre: ${heladeriaEncontrado.nombre}")
                                println("Direccion: ${heladeriaEncontrado.direccion}")
                                println("Telefono: ${heladeriaEncontrado.telefono}")
                                println("Calificacion: ${heladeriaEncontrado.calificacion}")
                                println("Capacidad: ${heladeriaEncontrado.capacidad}\n")
                            } else {
                                println("\nNo se encontró ningúna Heladeria con ese nombre.\n")
                            }
                        }
                        "4" -> {
                            print("\nIngresa el nombre de la heladeria a eliminar: ")
                            val nombreEliminacion = readLine().toString()
                            val resultadoEliminacion = heladerias.removeIf { it.nombre.equals(nombreEliminacion, ignoreCase = true) }
                            if (resultadoEliminacion) {
                                println("\nHeladeria eliminado exitosamente.\n")
                            } else {
                                println("\nNo se encontró ningúna heladeria con ese nombre.\n")
                            }
                        }

                        "5" -> {
                            flagHeladerias = false
                        }
                        "6" -> {
                            flagHeladerias = false
                            return
                        }
                        else -> {
                            println("Opción inválida seleccionada.")
                        }
                    }
                }
            }

            "2" -> {
                var flagHelados = true

                while (flagHelados) {
                    println(
                        "Seleciona la opcion a realizar en Helados\n" +
                                "1: Agregar Helado y guardar en un archivo \n" +
                                "2: Listar Helados\n" +
                                "3: Buscar Helados\n" +
                                "4: Eliminar Helados\n" +
                                "5: Regresar\n" +
                                "6: Salir"
                    )
                    print("Ingresa la opción: ")
                    var optionHelados = readLine()?.uppercase()

                    when (optionHelados) {
                        "1" -> {
                            val helado = ingresarHelado()
                            helados.add(helado)
                            println("\nHelado agregado exitosamente.\n")

                            val content = helados.joinToString("\n") { it.toString() }
                            fileManager.saveTextFile(fileName = pathPlaneta+"$helado.txt", content = content)
                            println("\nLa lista de healdos se ha guardado en un archivo de texto.\n")
                        }
                        "2" -> {
                            println("\nListado de Helados:")
                            for (helado in helados) {
                                println("Nombre: ${helado.nombreHelado}")
                                println("ID: ${helado.idPlaneta}")
                                println("Sabor 1: ${helado.sabor1}")
                                println("Sabor 2: ${helado.sabor2}")
                                println("Precio: ${helado.precio}")
                                println("Chispas: ${helado.chispas}")

                            }
                        }
                        "3" -> {
                            print("\nIngresa el nombre del helado a buscar: ")
                            val nombreBusqueda = readLine().toString()
                            val resultadoBusqueda = helados.filter { it.nombreHelado.equals(nombreBusqueda, ignoreCase = true) }
                            if (resultadoBusqueda.isNotEmpty()) {
                                println("\nHelado encontrado:")
                                val heladoEncontrado = resultadoBusqueda.first()
                                println("Nombre: ${heladoEncontrado.nombreHelado}")
                                println("ID: ${heladoEncontrado.idPlaneta}")
                                println("Sabor 1: ${heladoEncontrado.sabor1}")
                                println("Sabor 2: ${heladoEncontrado.sabor2}")
                                println("Precio: ${heladoEncontrado.precio}")
                                println("Chispas: ${heladoEncontrado.chispas}")

                            } else {
                                println("\nNo se encontró ningún helado con ese nombre.\n")
                            }
                        }
                        "4" -> {
                            print("\nIngresa el nombre del helado a eliminar: ")
                            val nombreEliminacion = readLine().toString()
                            val resultadoEliminacion = helados.removeIf { it.nombreHelado.equals(nombreEliminacion, ignoreCase = true) }
                            if (resultadoEliminacion) {
                                println("\nHelado eliminado exitosamente.\n")
                            } else {
                                println("\nNo se encontró ningún helado con ese nombre.\n")
                            }
                        }

                        "5" -> {
                            flagHelados = false
                        }
                        "6" -> {
                            flagHelados = false
                            return
                        }
                        else -> {
                            println("Opción inválida seleccionada.")
                        }
                    }
                }
            }

            "3" -> {
                println("¡Gracias!")
                return
            }

            else -> {
                println("Opción inválida seleccionada.")
            }
        }
    }
}

fun ingresarHeladeria(): Heladeria {
    println("\n--- Ingresar Heladeria ---")
    print("Nombre: ")
    val nombre = readLine().toString()
    print("Direccion: ")
    val direccion = readLine().toString()
    print("Telefono: ")
    val telefono = readLine().toString()
    print("Calificacion: ")
    val calificacion = readLine()?.toDouble()
    print("Capacidad: ")
    val capacidad = readLine()?.toInt()

    return Heladeria( nombre, direccion, telefono, calificacion?: 0.0, capacidad?: 0.0)
}

fun ingresarHelado(): Helados {
    println("\n--- Ingresar Helado ---")
    print("ID del Helado: ")
    val idHelado = readLine().toString()
    print("Nombre del Helado: ")
    val nombreHelado = readLine().toString()
    print("Primer Sabor: ")
    val sabor1 = readLine().toString()
    print("Segundo Sabor: ")
    val sabor2 = readLine().toString()
    print("Precio: ")
    val precio = readLine()?.toDouble()
    print("Chispas: ")
    val chispas = readLine()?.toInt()
    return Helados (idHelado, nombreHelado, sabor1, sabor2, precio ?: 0.0, chispas?: 0.0)
}



class FileManager {
    fun saveTextFile(fileName: String, content: String) {
        val file = File(fileName)
        file.writeText(content)
    }

    fun readTextFile(fileName: String): String {
        val file = File(fileName)
        return file.readText()
    }
}