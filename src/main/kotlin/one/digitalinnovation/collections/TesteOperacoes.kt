package one.digitalinnovation.collections

fun main(){
    val salarios = doubleArrayOf(1000.0,2250.0, 4000.0)

    for(salario in salarios) {
        println(salario)
    }

    println("---------------------------------")
    //max e min não funcionaram pois estão descontinuados na versão atual do kotlin
    println("Maior Salário: ${salarios.maxOrNull()}")
    println("Menor Salário: ${salarios.minOrNull()}")
    println("Média de Salarial: ${salarios.average()}")

    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }

    salariosMaiorQue2500.forEach { println(it) }
    println("---------------------------------")

    println(salarios.count{it in 2000.0..5000.0})

    println("---------------------------------")

    println(salarios.find{it == 2250.0})
    println(salarios.find{it == 500.0})

    println("---------------------------------")

    println(salarios.any{it == 2250.0})
    println(salarios.any{it == 500.0})
}