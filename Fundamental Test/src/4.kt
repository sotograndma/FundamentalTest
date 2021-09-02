package app

class ProofContravariant<in T>{
    fun sayHello(name: T){
        println("Hai $name")
    }

}

fun main() {
    val contravariantAny = ProofContravariant<Any>()
    val contravariantString: ProofContravariant<String> = contravariantAny

    contravariantString.sayHello("Eko")
}