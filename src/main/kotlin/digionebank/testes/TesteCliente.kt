package one.digitalInnovation.digionebank.testes

import one.digitalInnovation.digionebank.Cliente
import one.digitalInnovation.digionebank.ClienteTipo

fun main(){

    val jose = Cliente("Jose da Silva",
        cpf = "123.456.789-15",
        clienteTipo = ClienteTipo.PF,
        senha = "1234561"
    )

    println(jose)

    TesteAutenticacao().autentica(jose)
}