fun main() {

    do{
        println(""" Bienvenidos a CreadordeRecetas \n
            Menu :
            Selecciona la Opcion deseada:
            1.Hacer una Receta
            2.Ver mis Recetas
            3.salir
            """.trimMargin())
        println("\n")
        println("Ingrese la Opcion Deseada")
        val respose : String? = readLine()

        when(respose){
            "1" -> println("Ha Seleccionado Crear Receta ")
            "2" -> println("Ha Seleccionado ver mis Recetas ")
            "3" -> println("Adios")
            else -> println("Numero de opcion no Valido")
        }
    }while (respose != "3")
}