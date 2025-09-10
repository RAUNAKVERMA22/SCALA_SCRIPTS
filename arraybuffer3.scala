@main def run(): Unit = {
import scala.collection.mutable.ArrayBuffer

var myarray = ArrayBuffer(1, 2, 3, 4, 5, 6)
println(s"Initial: $myarray")

// Remove last element
myarray.remove(myarray.length - 1)
println(s"After removing last element: $myarray")

// Remove element at 2nd index (indexing starts at 0)
myarray.remove(2)
println(s"After removing element at index 2: $myarray")

// Clear the ArrayBuffer
myarray.clear()
println(s"After clearing: $myarray")
}