package one.digitalInnovation.digionebank

import one.digitalInnovation.digionebank.testes.ImprimeRelatorioFuncionario
import one.digitalInnovation.digionebank.testes.TesteAutenticacao

fun main(){
    val maria = Gerente("Maria do Carmo", "64646775499", 5000.0, "senha12")
    ImprimeRelatorioFuncionario.imprime(maria)
    TesteAutenticacao().autentica(maria)
}






