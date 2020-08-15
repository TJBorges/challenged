import kotlin.math.sign

fun main(args: Array<String>) {

    val topico1 = "Contas a pagar"
    val topico2 = "Viagem de Ferias"

    val conteudo1 = "Email de contas a pagar"
    val conteudo2 = "Contas a pagar recebidas hoje"

    val conteudo4 = "Marcamos sua viagem"
    val conteudo5 = "Marcamos sua segunda viagem"

    var email1 = Email(topico1, conteudo1)
    var email2 = Email(topico1, conteudo2)
    var email3 = Email(topico1, conteudo1)
    var email4 = Email(topico2, conteudo4)
    var email5 = Email(topico2, conteudo5)
    var email6 = Email(topico2, conteudo1)

    var emails = mutableListOf<Email>()
    emails.add(email1)
    emails.add(email2)
    emails.add(email3)
    emails.add(email4)
    emails.add(email5)
    emails.add(email6)

    var emailsTratados = removerDuplicadas(emails)

    for (email in emailsTratados) {
        println("Topico: " + email.topico)
        println("Conteudo: " + email.conteudo + "\n")
    }
}

class Email(var topico: String, var conteudo: String) {
}

fun removerDuplicadas(emails: MutableList<Email>): MutableList<Email> {

    var emailsLocais = emails
    var i = 1
    for (email1 in emails.indices) {
        while (i < emails.size) {
            if (emails[email1].topico.equals(emailsLocais[i].topico)
                    && emails[email1].conteudo.equals(emailsLocais[i].conteudo)) {
                emailsLocais.removeAt(i); i++
            } else i++
        }
    }
    return emailsLocais
}