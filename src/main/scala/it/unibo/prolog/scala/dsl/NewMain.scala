package it.unibo.prolog.scala.dsl

import it.unibo.prolog.scala.dsl.core.ImplicitConversions
import it.unibo.tuprolog.core.Term

object NewMain extends App {
  //options
  //1. import "all" from dsl package
  { //used to enclose the implicit conversions
    import it.unibo.prolog.scala.dsl.Implicits.all._
    val work: Term = 1
    println(work)
  }

  //2. using new as scala.fx
  new ImplicitConversions {
    val work: Term = 2.0
    println(work)
  }
  //val doNotWork: Term = 1
}
