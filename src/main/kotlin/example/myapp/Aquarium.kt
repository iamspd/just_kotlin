package example.myapp

class Aquarium(width: Int = 20, height: Int = 40, length: Int = 100) {
    // Dimensions in cm
    var width: Int = width
    var height: Int = height
    var length: Int = length

    fun printSize() {
        println(
            "Width: $width " +
                    "Height: $height " +
                    "Length: $length",
        )
    }
}