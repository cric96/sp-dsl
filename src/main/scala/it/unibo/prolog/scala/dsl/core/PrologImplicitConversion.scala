package it.unibo.prolog.scala.dsl.core

import it.unibo.tuprolog.core.Term

trait PrologImplicitConversion {
  type C[A] = A => Term
}
