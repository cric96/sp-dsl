package it.unibo.prolog.scala.dsl.core

/**
 * declare the standard conversions excepted in a "vanilla" prolog dsl
 */
trait ImplicitConversions
    extends NumericConversion     //type classes
    with PrologImplicitConversion //conversions
    with TupleConversion
    with SequenceConversions {}
