package Lectures.part1basics

object ValuesVariablesTypes extends App{

  val x: Int = 42 // var's are immutable. they behave as constants or finals
  // or val x = 42 // compiler can infer types (smart to apply the correct type)
  println(x)

  val aString: String = "Hello" // semicolons aren't necessary

  val aBoolean : Boolean = false // true or false

  val aChar : Char = 'a'

  val anInt: Int = x // Assigning from one variable to another variable

  val aShort: Short = 4321 // 2 Bytes

  val aLong: Long = 4554121222544545L // Given 8 Bytes

  val aFloat: Float = 4.445f

  val aDouble: Double = 4.5544

  // variables : Values can be reassigned

  var aVariable: Int = 4
  aVariable = 55 // Side Effects :
}
