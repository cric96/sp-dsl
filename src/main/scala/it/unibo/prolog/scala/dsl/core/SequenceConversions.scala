package it.unibo.prolog.scala.dsl.core

import it.unibo.tuprolog.core.Term
import it.unibo.tuprolog.core.{List => PList}

trait SequenceConversions {
  self: PrologImplicitConversion =>

  implicit def iterableConverters[E](rep: Iterable[E])(implicit e: E => Term): Term =
    PList.of(rep.map(e(_)).toSeq: _*)
}
