package view

import model.Pessoa
import model.Produto

/**
  * Created by dmodena on 03/05/16.
  */
object TesteCadastro {
  def main(args : Array[String]): Unit = {
    val pe = new Pessoa("John", 25)
    val pr = new Produto("Viola", 25, 2.70)

    println(pe.imprimir)
    println(pr.imprimir)

  }
}
