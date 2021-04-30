package it.unibo.prolog.scala.dsl.core

//utility to collect standard converters
trait PrologConversion extends NumericConversion with PrologImplicitConversion {}

object PrologConversion {
  val all: PrologConversion = new PrologConversion {}
}
