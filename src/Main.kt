fun main(){
    println("Hello Kotlin")
    //val it's an immutable variable
    // var it's a mutable variable
    val price: Double = 31.90
    val isOpen:Boolean = true
    var age: Int  = 20
    var product: String = "Imac"

    println(price::class)
    println(product::class)
    println(age::class)
    println(isOpen::class)
}