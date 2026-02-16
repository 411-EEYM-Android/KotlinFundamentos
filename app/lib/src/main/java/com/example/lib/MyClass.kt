package com.example.lib

// Crear un programa que tenga un precio de comida y un porcentaje de propina.
// Imprimir el total a pagar
fun main() {
    println("Hola Mundo")
    //1.
    val price: Double = 150.0
    val porcentage: Double = 0.10
    val tip: Double = price * porcentage
    val total: Double = price * tip
    println("El costo de la comida es: $$total")

    //El portero de una discoteca. Verifica que una pursona pueda entrar
//    println("Pon una edad")
//    val input = readlnOrNull()
//    val age = input?.toIntOrNull()
    /*
    if (age == null){
        println("El numero que pusiste no es un numero válido")
    }
    else if(age>18){
        println("Eres mayor de edad puedes pasar")
    }
    else{
        println("No se puede pasar pai")
    }
}
*/
//    when (age){
//        null -> println("Ingresa un numero")
//        in 18.. Integer.MAX_VALUE -> println ("Puedes pasar")
//        else -> println("No puedes pasar")
//    }
//    var counter : Int = 12
//    while (counter <20){
//        println("El contador es menor que 20")
//        counter++
//    }
//    do{
//        println("El contador vale menos que 30")
//        counter++
//    }while (counter <30)
    //El do while primero ejecuta el bloque de codigo y despuees ejecuta la condicion
//    for (i in 1..10){
//        println(i)
//    }
//
//    for (i in 10 downTo 0 ){
//        println(i)
//    }
//
//    for ( i in 100 downTo 0 step 10){
//        println(i)
//
//    }
    println("Pon un numero")
    val input = readlnOrNull()
    val valor = input?.toIntOrNull()
    for ( i in 1..9){
        val division: Double = valor / i
        println("100 / $i = $division")
    }
    val suha = ""
    val error = 2
    //JAJAJAJAJJAJAJ
    val funcionalidad = "registrase en la app"
}