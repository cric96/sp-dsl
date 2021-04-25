package it.unibo.prolog.scala.dsl.core

//utility to collect standard converters
trait PrologConverters extends NumericConverters with PrologImplicitConversion {}

object PrologConverters {
  val all: PrologConverters = new PrologConverters {}
}
