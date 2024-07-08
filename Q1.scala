object Q1 { 
def main(args: Array[String]): Unit = { 
    // Initialize sample inventory 
    val itemNames = Array("Biscuit","chocalate","Candy packets","Book","Blue Pen","Red pen","Black pen","Pencil","Highlighter","Paper Clip","Stapler","Scissors","Envelop","Rular","Pastle","Eraser","School Bag","Pencil Box","A4 Bundle","Cutter")
    
	val itemQuantities =  Array(12,15,30,25,34,20,25,22,9,120,6,10,78,18,4,51,8,7,11,15)
	
	displayInventory(itemNames, itemQuantities) 
	
	restockItem(itemNames,itemQuantities, "Pencil Box",10)
 
	restockItem(itemNames,itemQuantities, "Pastle",12) 
	
	sellItem(itemNames,itemQuantities, "Envelop",18)
	
	sellItem(itemNames,itemQuantities, "Paper Clip",14)

	println("Updated Inventory:")
	
	displayInventory(itemNames, itemQuantities) 
 } 

	def displayInventory(itemNames: Array[String], itemQuantities: Array[Int]): Unit = { 
		if (itemNames.length != itemQuantities.length) { 
		println("Error: Item names and quantities arrays must have the same length.") 
		return 
		} 
		println("Inventory:") 
		for (i <- 0 until itemNames.length) { 
			println(s"${itemNames(i)}: ${itemQuantities(i)}") 
		} 
	} 

	def restockItem(itemNames: Array[String], itemQuantities: Array[Int], itemName: String, quantity: Int): Unit = { 
		val index = itemNames.indexOf(itemName) 
		if (index != -1) { 
			itemQuantities(index) += quantity 
			println(s"\n$itemName restocked with $quantity units.") 
		} else { 
		println(s"\n$itemName not found.") 
		} 
	} 

	def sellItem(itemNames: Array[String], itemQuantities: Array[Int], itemName: String, quantity: Int): Unit = { 
		val index = itemNames.indexOf(itemName) 
		if (index != -1) { 
			if (itemQuantities(index) >= quantity) { 
				itemQuantities(index) -= quantity 
				println(s"\n$quantity units of $itemName sold.") 
			} else { 
			println(s"\nNot enough $itemName in stock to sell $quantity units.") 
			} 
		} else { 
			println(s"$itemName not found.") 
		} 
	} 

} 