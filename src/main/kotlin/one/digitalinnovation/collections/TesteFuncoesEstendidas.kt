package one.digitalinnovation.collections

//requer FuncoesEstendida.kt (classe )

/*
Conteudo

package one.digitalinnovation.collections

import java.math.BigDecimal

fun Array<BigDecimal>.somatoria() = this.reduce {
  acc, valor ->  acc + valor
}

fun Array<BigDecimal>.media() = 
    if (this.Empty()) BigDecimal.ZERO
    else 
    this.somatoria() / this.size.toBigDecimal()

*/

fun main(){
  
  val salarios = arrayOf(
    "2000".toBigDecimal(),
    "1500".toBigDecimal(),
    "4000".toBigDecimal()
  )  
  
    println("-----------------------------------")
    println(salarios.somatoria())
  
    println("-----------------------------------")
    println(salarios.media())
}
