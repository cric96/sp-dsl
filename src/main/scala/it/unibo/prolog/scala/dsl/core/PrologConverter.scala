package it.unibo.prolog.scala.dsl.core

import it.unibo.tuprolog.core.Term

trait PrologConverter[E] {
  def toTerm(rep: E): Term
}
