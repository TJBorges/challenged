fun main(args: Array<String>) {
    var input1: String = "pale"
    var input2: String = "Pales"

    println(VerificaErroDigitacao(input1, input2))
}

fun VerificaErroDigitacao(inp1: String, inp2: String): Boolean {

    var lista1 = inp1.toLowerCase().toCharArray()
    var lista2 = inp2.toLowerCase().toCharArray()
    var falso: Int = 0
    var j: Int = 0


    for (i in lista1.indices) {
        if (i > lista2.size - 1 || i > lista1.size) {
            break
        } else {
            if (lista1[i] != lista2[j] && lista1.size == lista2.size) {
                falso++; j++
            } else
                if (lista1[i] != lista2[j]) {
                    falso++
                } else {
                    j++
                }
        }
    }
    return (falso <= 1)
}