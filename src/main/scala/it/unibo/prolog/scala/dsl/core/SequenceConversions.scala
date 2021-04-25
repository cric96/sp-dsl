package it.unibo.prolog.scala.dsl.core

import it.unibo.tuprolog.core.Term
import it.unibo.tuprolog.core.{List => PList}

trait SequenceConversions {
  self: ImplicitConversions =>

  implicit def iterableConverters[E: C](rep: Iterable[E]): Term =
    PList.of(rep.map(prologConverter[E]).toSeq: _*)
}
