
//Kotlin inheritance
open class Car {
    var Volt = "V7"
    var Tyre = "leather"
    open fun getInfo() {
        println("Engine volt is $Volt and Tyre type is ${Tyre}")
    }
}

class Sportcar: Car(){
    var Height = 200
}

// Overriding Method
class Salooncar: Car(){
    override fun getInfo(){
        println("hello Sallon")
    }
}

fun main() {
    println("Hello World!")

    // inheritance
    var spH = Sportcar().Volt
    println(spH)

    Salooncar().getInfo()
}