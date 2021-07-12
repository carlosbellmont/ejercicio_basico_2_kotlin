fun main() {

    // Escribe un programa que permita jugar a adivinar un numero.
    //
    // El resultado por pantalla deber ser el siguiente
    // Encuentra un numero entre 0..9
    // Escribe tu numero
    // 1 <- Valor introducido por el usuario
    // El numero buscado es mas grande
    // Escribe tu numero
    // 9 <- Valor introducido por el usuario
    // El numero buscado es mas peque
    // Escribe tu numero
    // 5 <- Valor introducido por el usuario
    // El numero buscado es mas peque
    // Escribe tu numero
    // 3 <- Valor introducido por el usuario
    // Enhorabuena! El numero era 3

}

fun readIntFromKeyboard(): Int {
    var result : Int?
    do {
        val selectedOption = readLine()
        result = try {
            selectedOption?.toInt()
        } catch (e: NumberFormatException) {
            println("Lo que has introducido no es un número.")
            null
        }
    } while (result == null)
    return result
}

fun getRandomNumber(rango: IntRange): Int {
    return rango.random()
}