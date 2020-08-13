fun main(args: Array<String>) {
    var input1: String = "pales"
    var input2: String = "pale"

    println(VerificaErroDigitacao(input1, input2))
}

fun VerificaErroDigitacao(inp1: String, inp2: String): String {

    var lista1 = inp1.toCharArray()
    var lista2 = inp2.toCharArray()
    var falso: Int = 0
    var j: Int = 0
    
    if (lista1.size == lista2.size || lista2.size == lista1.size - 1) {
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
    } else {
        if (lista1.size == lista2.size - 1) {
            for (i in lista2.indices) {
                if (i > lista1.size) {
                    break
                } else {
                    if (lista2[i] != lista1[j]) {
                        falso++
                    } else {
                        j++
                    }
                }
            }
        }

    }
    return if (falso <= 1 && (lista1.size == lista2.size || lista2.size == lista1.size - 1 || lista1.size == lista2.size - 1)) {
        "True"
    } else {
        "False"
    }
}