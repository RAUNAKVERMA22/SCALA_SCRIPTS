@main def run(): Unit = {
import scala.collection.mutable.ArrayBuffer

var myarray = ArrayBuffer(1, 2, 3, 4, 5)
println(s"Initial: $myarray")

myarray += 6
println(s"After adding 6: $myarray")

myarray -= 3
println(s"After removing 3: $myarray")

myarray.remove(0)
println(s"After removing element at index 0: $myarray")

myarray.insert(1, 99)
println(s"After inserting 99 at index 1: $myarray")

myarray.clear()
println(s"After clearing: $myarray")
}