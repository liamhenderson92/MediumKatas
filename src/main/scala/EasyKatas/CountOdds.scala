package EasyKatas

object CountOdds {
  def count(input: Int): List[Int] = {
    val inputList = (0 until input).toList
    inputList.flatMap(x => if (x % 2 == 0) Nil else List(x))
  }

}
