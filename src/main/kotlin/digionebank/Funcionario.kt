package one.digitalInnovation.digionebank

import java.math.BigDecimal

/**
Classes abstract nunca serão trafegadas como instancia
os membros de uma classe são seus construtores, propriedades e funções
Herança é um mecanismo que permite que caracteristicas comuns a diversas classes,
sejam fatoradas em uma classe base, ou superclasse. A partir de uma classe base, outras
classes pode ser especificadas
*/
abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double

) : Pessoa(nome, cpf) {
   // somente a classe funcionario e classes filhas podem acessar esse metodo protected
   protected abstract  fun calculoAuxilio(): Double; // compartamento espeficido por tipo de funcionarios

    // sobreescrevendo a fun toString da classe funcionario
    override fun toString(): String =  """
     Nome: $nome
     Cpf:  $cpf
     Salario: $salario
     Auxilio: ${calculoAuxilio()}

    """.trimIndent()
}