package it.unibo.prolog.scala.dsl.core

import it.unibo.tuprolog.core.Term
import it.unibo.tuprolog.core.{List => PList}

trait ImplicitConversions {
  implicit def prologConverter[E: PrologConverter](rep: E): Term = implicitly[PrologConverter[E]].toTerm(rep)

  implicit def iterableConverters[E: PrologConverter](rep: Iterable[E]): Term =
    PList.of(rep.map(prologConverter[E]).toSeq: _*)
}
