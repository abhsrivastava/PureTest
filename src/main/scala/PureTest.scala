/**
  * Created by ASrivastava on 3/27/17.
  */

import scala.concurrent._
import scala.concurrent.ExecutionContext.Implicits.global
import cats._
import cats.data._
import cats.implicits._
import cats.syntax.all._
import cats.instances.all._

object PureTest extends App {
   type FutureOption[T] = OptionT[Future, T]
   case class Foo(i: Int)
   case class Bar(s: String)
   val x = 1.pure[FutureOption]
   val y = "1".pure[FutureOption]
   val z = (1, "1").pure[FutureOption]
   val z1 = (Foo(1), Bar("x")).pure[FutureOption]
}
