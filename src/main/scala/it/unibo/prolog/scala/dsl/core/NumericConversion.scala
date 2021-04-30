package it.unibo.prolog.scala.dsl.core

import it.unibo.tuprolog.core.Integer
import it.unibo.tuprolog.core.Real
import it.unibo.tuprolog.core.Term

trait NumericConversion {
  implicit def intConversion(rep: Int): Term       = Integer.of(rep)
  implicit def byteConversion(rep: Byte): Term     = Real.of(rep)
  implicit def doubleConversion(rep: Double): Term = Real.of(rep)
  implicit def floatConversion(rep: Float): Term   = Real.of(rep)
}
