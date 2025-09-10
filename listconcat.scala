@main def run(): Unit = {
val list1 = List(1, 2, 3)
val list2 = List(4, 5, 6)

// Using ++
val combined1 = list1 ++ list2

// Using :::
val combined2 = list1 ::: list2

println(s"Using ++  : $combined1")
println(s"Using ::: : $combined2")
}