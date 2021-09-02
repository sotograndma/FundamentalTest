class ProofCovariant<out T>(val data: T) {

    fun data(): T {
        return data
    }
}

fun main() {
    val covariantString = ProofCovariant<String>("Eko")
    val covariantAny: ProofCovariant<Any> = covariantString

    println(covariantAny.data())
}