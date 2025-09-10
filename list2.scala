@main def run(): Unit = {

val list = List(2, 3, 4)

val prepend = 1 :: list        // adds at front
val append  = list :+ 5        // adds at end
println("list prepend")
println(prepend)   // List(1, 2, 3, 4)
println("list append")
println(append)    // List(2, 3, 4, 5)
}
