fun main(args: Array<String>) {
    //var input1: String = "moon"
    //var input2: String = "nmoo"

    var input1: String = "TesteDeEscrita"
    var input2: String = "testeDescritaE"

    println(InputsIguais(input1, input2))
}

fun InputsIguais(inp1: String, inp2: String): String {

    var lista1 = inp1.toCharArray()
    var lista2 = inp2.toCharArray()
    var falso: Int = 0


    return if (inp1.length != inp2.length) {
        "False"
    } else {
        if (inp1.substring(0, 2) == inp2.substring(0, 1)) {
            "True"
        } else {
            if (inp1.length > 3) {
                for (i in lista1.indices) {
                    if (lista1[i] != lista2[i]) {
                        falso++
                    }
                }
            }
            if (falso <= ((inp1.length / 3) * 2)) {
                "True"
            } else {
                "False"
            }
        }
    }
}
