package org.dahua.utils

import scala.util.Random

object Demo {

  def main(args: Array[String]): Unit = {
  var random=new Random()
    val i :Int=random.nextInt(20)
    println(i)
  }
}
