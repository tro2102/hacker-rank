package com.github.tro2102.hackerrank

/**
 * Created on 11/5/14.
 * @author Taylor Owens
 */
object HRMath {
  def factorial(n:Int):Int = if(n==0) 1 else n * factorial(n-1)
  def eToThe(x: Double):Double = 1f + x + (for (i <- 2 to 10) yield Math.pow(x,i)/factorial(i)).sum
}
