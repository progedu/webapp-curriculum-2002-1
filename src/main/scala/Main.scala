import scala.annotation.tailrec

object Main {
  //  2001-1
  @tailrec
  def fact(n: Int, acc: Int): Int = if (n <= 1) acc else fact(n - 1, acc * n)

  //  2001-2
  case class Switch(var isOn: Boolean)

  def toggle(switch: Switch): Unit = {
    if (switch.isOn) Switch(false) else Switch(true)
  }

  //  2001-3
  def twice(f: Int => Int): Int => Int = (x) => f(f(x))

  //  2002-1
  case class Pair[T1, T2](t1: T1, t2:T2)
}
