object Q3 { 
	def main(args: Array[String]): Unit = { 
		println(formatNames("Benny", toUpper))  
		
		println(formatNames("Niroshan", str => str.substring(0, 1).toUpperCase + str.substring(1)))
		
		println(formatNames("Saman", toLower))  
		
		println(formatNames("Kumara", str => str.substring(0, str.length - 1).toLowerCase + str.substring(str.length - 1).toUpperCase))

		} 
  
	def toUpper(str: String): String = str.toUpperCase 
	
	def toLower(str: String): String = str.toLowerCase 
	
	def formatNames(name: String, formatter: String => String): String = { 
		formatter(name)  
	}
}