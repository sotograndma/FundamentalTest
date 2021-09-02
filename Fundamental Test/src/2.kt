interface CantAnswer {
    fun sayHello(name: String)
}

open class proofConstarin

class Manager : proofConstarin()

class HardAnswer : proofConstarin(), CantAnswer {
    override fun sayHello(name: String) {
        println("Hello can $name, help answer number 2")
    }
}

class Company<T>(val proofConstarin: T) where T : proofConstarin, T : CantAnswer

fun main() {
    val data = Company(HardAnswer())
}