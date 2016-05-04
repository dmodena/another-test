package model

/**
  * Created by dmodena on 03/05/16.
  */
class Produto(var descricao : String, var quantidade : Int, var valor : Double) extends Impressao {

  def getDescricao() : String = descricao
  def getQuantidade() : Int = quantidade
  def getValor() : Double = valor

  def setDescricao(descricao : String): Unit = {
    this.descricao = descricao
  }

  def setQuantidade(quantidade : Int): Unit = {
    this.quantidade = quantidade
  }

  def setValor(valor : Double): Unit = {
    this.valor = valor
  }

  override
  def imprimir : String = s"Produto: $descricao - Qtd: $quantidade - Valor: $valor"
}
