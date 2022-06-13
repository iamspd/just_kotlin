import example.myapp.Aquarium

fun buildAquarium() {
    val myAquarium = Aquarium()
    myAquarium.printSize()

    val myAquarium1 = Aquarium(numberOfFish = 29)
    myAquarium1.printSize()
}

fun main() {
    buildAquarium()
}