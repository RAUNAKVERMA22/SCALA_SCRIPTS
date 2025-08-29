// import scala.io.StdIn.readLine
@main def run(): Unit = {
import scala.io.StdIn.readLine
val data = Map(("a", 24), ("b", 25), ("c", 52), ("d", 43))

print("Enter a key (a, b, c, d): ")
val userKey = readLine()

if (data.contains(userKey)) {
  val value = data(userKey)
  println("Value for " + userKey + " is " + value)

  if (value % 2 == 0)
    println(value + " is Even")
  else
    println(value + " is Odd")
} else {
  println("Key " + userKey + " not found in the map.")
}
}