@main def run(): Unit = {
val v1 = Vector(1, 2, 3)

// Append
val v2 = v1 :+ 4
println(s"Append 4: $v2")

// Prepend
val v3 = 0 +: v1
println(s"Prepend 0: $v3")

// Concatenation
val v4 = v1 ++ Vector(4, 5, 6)
println(s"Concatenate: $v4")

// Access by index
println(s"Element at index 1: ${v1(1)}")

// Update value (creates new Vector)
val v5 = v1.updated(1, 99)
println(s"After updating index 1: $v5")
}