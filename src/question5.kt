fun main(args: Array<String>) {

    val topico1 = "Contas a pagar"
    val topico2 = "Contas para pagar"
    val conteudo1 = "Email sobre contas a pagar sbdhsd"
    val conteudo2 = "Email de contas a pagar sbdhsd"
    val conteudo3 = "Email sobre contas a pagar sbdhsd"

    val conteudo4 = "Email de contas a pagar sbdhsd"

    var email1 = Email(topico1, conteudo1)
    var email2 = Email(topico1, conteudo2)
    var email3 = Email(topico1, conteudo3)
    var email4 = Email(topico2, conteudo4)

    var emails = mutableListOf<Email>()
    emails.add(email1)
    emails.add(email2)
    emails.add(email3)
    emails.add(email4)

    var emailsTratados = removerDuplicadas(emails)

    for (email in emailsTratados) {
        println("Topico: " + email.topico)
        println("Conteudo: " + email.conteudo + "\n")
    }

    /*for (email in emailsTratados) {
        println("Topico: " + email.topico)
        for (email2 in emailsTratados) {
            if (email2.topico == email.topico) {
                println("Conteudo: " + email.conteudo)
            }
        }
        println("")
    }*/


}

class Email(var topico: String, var conteudo: String) {
}

fun removerDuplicadas(emails: MutableList<Email>): MutableList<Email> {

    var email2 = emails

    var i = 0
    for (email1 in emails.indices) {
        while (i < emails.size) {
            if (emails[email1].topico.equals(email2[i].topico)
                    && emails[email1].conteudo.equals(email2[i].conteudo)) {
                emails.removeAt(i); i++
            } else i++
        }

    }

    return emails
}