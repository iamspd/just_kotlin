package example.myapp

// Initializing primary constructor in the class declaration
//  with named parameters and default values
class Aquarium(var width: Int = 20, var height: Int = 40, var length: Int = 100) {

    // Initialization block will be called each time the
    //  class instance is created
    init {
        println("Aquarium initializing");
    }
    init {
        println("volume: ${(width * height * length) / 1000} l")
    }

    // Initializing second constructor which is called after
    //  primary constructor is executed {this()}
    constructor(numberOfFish: Int) : this() {
        // 2000 cm*3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (width * length)).toInt()
    }
    fun printSize() {
        println(
            "Width: $width Height: $height Length: $length",
        )
    }
}