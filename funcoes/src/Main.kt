/*
//-------------------------------------------------------Exercicio 01---------------------------------------------------------------//
fun cumprimentar(nome: String){println("Olá meu Amigo $nome")}


fun main(){cumprimentar("Rogers")}

fun calcularDesconto(preco: Double, desconto: Int): Double{
    val des = desconto / 100.0
    val valorDesconto = preco * des
    val final = preco - valorDesconto
    return final
}

//-------------------------------------------------------Exercicio 02---------------------------------------------------------------//
fun main (){
    val valor = 100.0
    val desc = 10
    val cal = calcularDesconto(valor, desc)
    println ("Você teve um desconto de: $desc% ")
    println("Então o preço com desconto é: R$ $cal")
}

//-------------------------------------------------------Exercicio 03---------------------------------------------------------------//
data class resultadoOperacoes(val soma: Int, val subtracao: Int, val multiplicacao: Int, val divisao: Int)

fun main (){
    val result = executarOperacao(5, 5)
    println(result)
}


fun soma (a: Int, b: Int): Int{return a + b}
fun subtracao (a: Int, b: Int): Int{return a - b}
fun multiplicacao (a: Int, b: Int): Int{return a * b}
fun divisao (a: Int, b: Int): Int{return a / b}


fun executarOperacao(a: Int, b: Int, ): resultadoOperacoes {
    return resultadoOperacoes (soma(a, b), subtracao(a, b), multiplicacao(a, b), divisao(a, b))
}

//-------------------------------------------------------Exercicio 04---------------------------------------------------------------//


fun String.isPalindrome(): Boolean{
    //remove espaços e converte para minúsculas
    val limpa = this.replace(" ","").lowercase()

    // Compara a string limpa com a sua versão invertida
    return limpa == limpa.reversed()
}

fun main(){
    val palavra1 = "Radar"
    val palavra2 = "A man a plan a canal Panama"
    val palavra3 = "Kotlin"

    println("\"$palavra1\" é palíndromo? ${palavra1.isPalindrome()}") // true
    println("\"$palavra2\" é palíndromo? ${palavra2.isPalindrome()}") // true
    println("\"$palavra3\" é palíndromo? ${palavra3.isPalindrome()}") // false
}
*/
//-------------------------------------------------------Exercicio 05---------------------------------------------------------------//

fun main (){

    println(fibonacci(8))
}

fun fibonacci (n: Int): Int{
    return when (n){
        0 -> 0
        1 -> 1
        else -> fibonacci(n - 1) + fibonacci(n - 2)
    }
}

