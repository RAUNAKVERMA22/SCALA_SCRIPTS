@main def run(): Unit = {


import scala.io.StdIn.readLine

val a = readLine("Enter str 1: ")
val b = readLine("Enter str 2: ")

def addstr(x: String, y: String): String = {
  x + " " + y
}

println(addstr(a, b))
}
