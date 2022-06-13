package example.myapp

class Aquarium(var width: Int = 20, var height: Int = 40, var length: Int = 100) {
    init {
        println("Aquarium initializing");
    }
    init {
        println("volume: ${(width * height * length) / 1000} l")
    }
    fun printSize() {
        println(
            "Width: $width Height: $height Length: $length",
        )
    }
}