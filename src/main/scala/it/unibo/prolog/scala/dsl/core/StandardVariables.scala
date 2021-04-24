package it.unibo.prolog.scala.dsl.core

import it.unibo.tuprolog.core.Var

trait StandardVariables {
  self: PrologScope =>

  val A: Var   = varOf("A")
  val B: Var   = varOf("B")
  val X: Var   = varOf("X")
  val __ : Var = Var.anonymous()
}
