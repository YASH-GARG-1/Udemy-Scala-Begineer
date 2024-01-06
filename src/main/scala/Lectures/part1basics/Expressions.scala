package Lectures.part1basics

object Expressions extends App{

  val x = 1 + 2 // Expression
  println(x)

  println(2 + 3 * 6)
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(1 == x)
  // == != <= >= > <

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /= ... side effects (changing a variable is called side effect)
  println(aVariable)

  //Instructions (tell a computer to do something) Vs Expressions (Something having a value)
}
