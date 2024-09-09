// Verificar se um número é primo

fun main (){

    val numero = readLine()?.toIntOrNull()?: return

    if (numero <= 1){
        println("O número deve ser maior que 1.")
    }
    else {

    var primo = true

    for (i in 2 until Math.sqrt(numero.toDouble()).toInt() + 1){
        if (numero % i == 0){
            primo = false
            break
        }
    }

        if (primo){
            println("$numero é um número primo.")
        }
        else {
            println("$numero NÃO é um número primo.")
            
        }
    }

}