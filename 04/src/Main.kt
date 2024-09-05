// Tabuada do número 1 ao 10


fun main() {

    println("DIGITE A TABUADA QUE VOCÊ DESEJA VER:")

    var selection = readLine()!!.toInt()



    when (selection) {
        1 -> tabuada(1)
        2 -> tabuada(2)
        3 -> tabuada(3)
        4 -> tabuada(4)
        5 -> tabuada(5)
        6 -> tabuada(6)
        7 -> tabuada(7)
        8 -> tabuada(8)
        9 -> tabuada(9)
        10 -> tabuada(10)

        else -> println("número inválido!!")
    }
}

fun tabuada(numero: Int){
    for (i in 1..10){
        println("$numero x $i = ${numero * i}")
    }
}
