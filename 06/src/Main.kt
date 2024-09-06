// Calcule o fatorial de um número

fun fator (n: Int): Long{
    var result = 1L
    for (i in 2..n){
        result *= i
    }
    return result
}

fun main (){
    println("Digite o número:")

    val entrada = readLine()!!
    val numero = entrada.toInt()
    val resultado = fator(numero)

    println("O fatorial de $numero é: $resultado")
}