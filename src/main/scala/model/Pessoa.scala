package model

/**
  * Created by dmodena on 03/05/16.
  */
class Pessoa(var nome : String, var idade : Int) extends Impressao {

  def getNome() : String = nome
  def getIdade() : Int = idade

  def setNome(nome : String): Unit = {
    this.nome = nome
  }
  def setIdade(idade : Int): Unit = {
    this.idade = idade
  }

  override
  def imprimir : String = s"Nome: $nome - Idade: $idade"

}
