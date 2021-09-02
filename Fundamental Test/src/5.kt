//
//Invariant
//

//class Invariant<T>(var data: T)
//fun main() {
//    val invariantString = Invariant("String")
//
//    // val invariantAny: Invariant<Any> = invariantString // bisa
//    // invariantAny.data = 100  // bahaya
//}


// Generic
//fun main(args: Array<String>) {
//    var objet1 = panggilTest<String>("String")
//    var object2 = panggilTest<Double>(10.00)
//    println(objet1)
//    println(object2)
//}
//
//
//
//class panggilTest<out T>(input:T) {
//    init {
//        println("Bagian ini Memanggil Nilai dari $input")
//    }
//}

//Perbandingannya adalah Invariant menggunakan dataClass sedangkan Generic variant menggunakan Class yang berfungsi menjalankan sistemnya