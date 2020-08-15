fun main(args: Array<String>) {
    var input: String = ""
    var output: String = ""

    //input = " string de teste      "
    input = "User is not allowed      "

    output = input.trim().replace(" ", "&32").toString()

    println(output)
}