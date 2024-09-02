fun main() {

    var num1 = readLine()!!.toInt()
    var num2 = readLine()!!.toInt()


    if (num1 > num2){
        println("$num1 é maior que $num2")
    }

    else if ( num1 < num2){
        println("$num2 é MAIOR que $num1")
    }

    else if ( num1 == num2){
        println("Eles são iguais")
    }

}