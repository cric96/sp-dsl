package it.unibo.prolog.scala.dsl.core

//utility to collect standard converters
trait PrologConverters extends NumericConverters with ImplicitConversions {}

object PrologConverters {
  val all: PrologConverters = new PrologConverters {}
}
