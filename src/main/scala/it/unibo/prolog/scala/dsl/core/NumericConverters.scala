package it.unibo.prolog.scala.dsl.core

import it.unibo.tuprolog.core.Term
import it.unibo.tuprolog.core.Integer
import it.unibo.tuprolog.core.Real

trait NumericConverters {

  implicit object IntConverter extends PrologConverter[Int] {
    override def toTerm(rep: Int): Term = Integer.of(rep)
  }

  implicit object ByteConverter extends PrologConverter[Byte] {
    override def toTerm(rep: Byte): Term = Integer.of(rep)
  }

  implicit object DoubleConverter extends PrologConverter[Double] {
    override def toTerm(rep: Double): Term = Real.of(rep)
  }

  implicit object FloatConverter extends PrologConverter[Float] {
    override def toTerm(rep: Float): Term = Real.of(rep)
  }

}
