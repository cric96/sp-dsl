package it.unibo.prolog.scala.dsl

import it.unibo.tuprolog.core.Atom
import it.unibo.tuprolog.core.Integer
import it.unibo.tuprolog.core.Struct
import it.unibo.tuprolog.core.Term
import it.unibo.tuprolog.core.Var

class PrologScopePoF {}

object PrologScopePoF {
  //implicit def stringToAtom(string: String): Atom = Atom.of(string)
  implicit def intToInteger(int: Int): Integer = Integer.of(int)

  implicit def anyToTerm(obj: Any): Term = obj match {
    case string: String => Atom.of(string)
    case int: Int       => int
    case _ =>
      throw new IllegalArgumentException(
        s"Cannot convert $obj to ${classOf[Term].getSimpleName}"
      )
  }
  def __ : Var = Var.anonymous()

  implicit class VarHelper(val sc: StringContext) extends AnyVal {
    def v(args: Any*): Var = Var.of(args.mkString)
  }

//  implicit class StructHelper(val functor: String)(implicit val scope: PrologScope) {
//    def apply(args: Any*): Term = Struct.of(functor, args.map[Term](scope.anyToTerm): _*)
//  }

  implicit class StructHelper(val functor: String) {

    def apply(args: Any*): Struct =
      Struct.of(functor, args.map[Term](anyToTerm): _*)
  }

  def prolog[R](arg: => R): R = arg
}
