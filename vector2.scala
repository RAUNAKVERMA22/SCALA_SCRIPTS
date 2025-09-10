@main def run(): Unit = {
val vec1  = Vector(1, 2, 3, 4, 5)
val vec2  = Vector.empty[Int]
val vec3  = Vector("a", "b", "c")

val vec4  = vec3 :+ "d"       // append "d"
val vec5  = "Z" +: vec4       // prepend "Z"

val nvec  = Vector("e", "f")
val nvec1 = vec5 ++ nvec      // concatenate

println(nvec1)
nvec1.foreach(println)
}