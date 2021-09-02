fun main(args: Array<String>) {
    var objet1 = panggilTest<String>("String")
    var object2 = panggilTest<Double>(10.00)
    println(objet1)
    println(object2)
}
class panggilTest<out T>(input:T) {
    init {
        println("Bagian ini Memanggil Nilai dari $input")
    }
}