@main def run(): Unit = {

import scala.io.StdIn.readInt
print("enter a number: ")
val num = readInt()

if (num % 2 == 0)
  println(num + " is Even")
else
  println(num + " is Odd")
}