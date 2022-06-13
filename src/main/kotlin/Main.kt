import example.myapp.Aquarium

// Primary constructor call
fun buildAquarium() {
    val myAquarium = Aquarium()
    myAquarium.printSize()

    val myAquarium1 = Aquarium(numberOfFish = 29)
    myAquarium1.printSize()
}

// Method initialization for main()
//  Entry point of the program
fun main() {
    buildAquarium()
}