object Q2 {
	def main(args : Array[String]) : Unit = {
	PatternMaching()
	}
	def PatternMaching() : Unit = {
		println("Input the integer: ")
		val integer = scala.io.StdIn.readInt()
		println("The value of a is " + integer)
		
		integer match {
			case x if x <= 0 => println("Negative/Zero is input")
			case x if x%2 == 0 => println("Even number is given")
			case _ => println("odd number is given")
		}
	}
	
}