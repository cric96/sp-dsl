package it.unibo.prolog.scala.dsl.core

import it.unibo.tuprolog.core.Struct
import it.unibo.tuprolog.core.Term

trait PrologStdLib {
  self: PrologScope =>

  implicit class BasicOperator[A](me: A)(implicit converter: A => Term) { //tell that, in same place, exist a conversion between A (Any) and Term.
    def ?==(right: Term): Struct = Struct.of("==", converter(me), right)
    def ?=(right: Term): Struct  = Struct.of("=", converter(me), right)
  }

}
