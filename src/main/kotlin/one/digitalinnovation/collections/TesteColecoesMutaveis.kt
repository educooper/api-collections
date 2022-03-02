package one.digitalinnovation.collections

val joao = Funcionario("João", 1000.0, "CLT")
val pedro = Funcionario("Pedro", 2000.0, "PJ")
val maria = Funcionario("Maria", 4000.0, "CLT")

fun main(){

   val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println("---------------------------------------")

    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("---------------------------------------")

    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("------------------SET-----------------")

    val funcionarioSet = mutableSetOf(joao)
    funcionarios.forEach { println(it) }

    println("---------------------------------------")

    funcionarios.add(pedro)
    funcionarios.add(maria)
    funcionarios.forEach { println(it) }

    println("---------------------------------------")

    funcionarios.remove(maria)
    funcionarios.forEach { println(it) }

}