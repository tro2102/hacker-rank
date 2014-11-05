package com.github.tro2102.hackerrank

import scala.util.Random

/**
 * Created on 11/5/14.
 * @author Taylor Owens
 */
object HRList {
  def blowUp(num:Int,arr:List[Int]):List[Int] = arr.flatMap( Array.fill(num)(_) )
  def filterLT(delim:Int,arr:List[Int]):List[Int] = for(x <- arr if x < delim) yield x
  def filterOdd(arr:List[Int]):List[Int] = (for ( i <- 0 to arr.length - 1 if i%2==1) yield arr(i)).toList
  def random(size:Int) : List[Int] = Array.fill(size)(Random.nextInt()).toList
  def reverse(arr:List[Int]):List[Int] = arr.reverseMap(x => x)
  def size(arr:List[Int]):Int = arr.fold(0)((x,c)=> x + 1)
  def absoluteVal(arr:List[Int]):List[Int] = arr.map( Math.abs )
}
