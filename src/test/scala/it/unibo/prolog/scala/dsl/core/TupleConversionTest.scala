package it.unibo.prolog.scala.dsl.core

import it.unibo.tuprolog.core.Integer
import it.unibo.tuprolog.core.Tuple
import org.junit.Test

import java.util

class TupleConversionTest {

  @Test
  def scalaTuple2Conversion(): Unit = {
    import TupleConversionTest.myConversion._
    val tuple: Tuple = (1, 2)
    val prologTuple  = prologTupleFromRange(1 to 2)
    assert(tuple == prologTuple)
  }

  @Test
  def scalaTuple3Conversion(): Unit = {
    import TupleConversionTest.myConversion._
    val tuple: Tuple = (1, 2, 3)
    val prologTuple  = prologTupleFromRange(1 to 3)
    assert(tuple == prologTuple)
  }

  @Test
  def scalaTuple4Conversion(): Unit = {
    import TupleConversionTest.myConversion._
    val tuple: Tuple = (1, 2, 3, 4)
    val prologTuple  = prologTupleFromRange(1 to 4)
    assert(tuple == prologTuple)
  }

  @Test
  def scalaTuple5Conversion(): Unit = {
    import TupleConversionTest.myConversion._
    val tuple: Tuple = (1, 2, 3, 4, 5)
    val prologTuple  = prologTupleFromRange(1 to 5)

    assert(tuple == prologTuple)
  }

  @Test
  def scalaTuple6Conversion(): Unit = {
    import TupleConversionTest.myConversion._
    val tuple: Tuple = (1, 2, 3, 4, 5, 6)
    val prologTuple  = prologTupleFromRange(1 to 6)
    assert(tuple == prologTuple)
  }

  private def prologTupleFromRange(iterable: Range): Tuple = {
    val elements = iterable.map(Integer.of)
    Tuple.of(util.Arrays.asList(elements: _*))
  }
}

object TupleConversionTest {
  object myConversion extends PrologImplicitConversion with NumericConversion with TupleConversion
}
