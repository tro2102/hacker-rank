package com.github.tro2102.hackerrank

/**
 * Created on 11/5/14.
 * @author Taylor Owens
 */
object SumInput extends App {
    println(io.Source.stdin.getLines().take(2).map(_.toInt).sum)
}

object ListFilterPosition extends App {
  println(HRList.filterOdd(List(0,1,2,3,4,5,6,7,8,9)))
}

object CreateRandom extends App {
  println(HRList.random(10))
}

object RepeatYourself extends App {
  def f(n: Int) = for (i <- 1 to n) println("Hello World")
}