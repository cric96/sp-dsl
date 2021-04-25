package it.unibo.prolog.scala.dsl.core

import it.unibo.tuprolog.core.Term

trait ImplicitConversions {
  type C[A] = PrologConverter[A] //shorthand
  implicit def prologConverter[E: C](rep: E): Term = implicitly[C[E]].toTerm(rep)
}
