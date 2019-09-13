object HeadsAndLegs2 {

  def calculator(heads: Int, legs: Int): String = {


    val numCows = (legs-2*heads) / 2
    val numChickens = heads-numCows

    legs match {
      case x if x%2 ==0 && numChickens >=0 && numCows >= 0 => s"$numCows cow and $numChickens chicken"
      case _ => "No solution found"
    }

  }
}
