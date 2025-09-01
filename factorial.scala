@main def run(): Unit = {
import scala.io.StdIn.readInt
print("Enter a number: ")
val num = readInt()

def factorial(n: Int): Int = {
  if (n == 0 || n == 1) 1
  else n * factorial(n - 1)
}

println(s"Factorial of $num is: " + factorial(num))
}