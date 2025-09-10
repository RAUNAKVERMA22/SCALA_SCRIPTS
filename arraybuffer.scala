import scala.collection.mutable.ArrayBuffer

// Creating Object
object GFG {
    
    // Main Method with explicit return type 'Unit'
    def main(args: Array[String]): Unit = {
        // Create a mutable ArrayBuffer of strings
        var name = ArrayBuffer[String]()
        
        // Add elements to the ArrayBuffer
        name += "GeeksForGeeks"
        name += "gfg"
        name += "Chandan"
        
        // Print the contents of the ArrayBuffer
        println(name)
    }
}
