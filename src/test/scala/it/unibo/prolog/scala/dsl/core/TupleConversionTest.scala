package it.unibo.prolog.scala.dsl.core

import it.unibo.tuprolog.core.Integer
import it.unibo.tuprolog.core.Tuple
import org.junit.Test

class TupleConversionTest {

  @Test
  def scalaTuple3Conversion(): Unit = {
    import TupleConversionTest.myConversion$._
    val tuple: Tuple = (1, 2, 3)
    val prologTuple  = Tuple.of(Integer.of(1), Integer.of(2), Integer.of(3))
    assert(tuple == prologTuple)
  }
}

object TupleConversionTest {
  object myConversion$ extends ImplicitConversions with NumericConverters with TupleConversion
}
