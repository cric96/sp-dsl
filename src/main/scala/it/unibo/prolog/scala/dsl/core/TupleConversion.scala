package it.unibo.prolog.scala.dsl.core

import it.unibo.tuprolog.core.Term
import it.unibo.tuprolog.core.Tuple

trait TupleConversion {
  self: PrologImplicitConversion =>

  implicit def convert1[A1: C](tuple: Tuple1[A1]): Term              = tuple._1
  implicit def convert2[A1: C, A2: C](t: (A1, A2)): Tuple            = Tuple.of(t._1, t._2)
  implicit def convert3[A1: C, A2: C, A3: C](t: (A1, A2, A3)): Tuple = Tuple.of(t._1, t._2, t._3)

  implicit def convert4[A1: C, A2: C, A3: C, A4: C](t: (A1, A2, A3, A4)): Tuple =
    Tuple.of(t._1, t._2, t._3, t._4)

  implicit def convert5[A1: C, A2: C, A3: C, A4: C, A5: C](t: (A1, A2, A3, A4, A5)): Tuple =
    Tuple.of(t._1, t._2, t._3, t._4, t._5)

  implicit def convert6[A1: C, A2: C, A3: C, A4: C, A5: C, A6: C](t: (A1, A2, A3, A4, A5, A6)): Tuple =
    Tuple.of(t._1, t._2, t._3, t._4, t._5, t._6)

}
