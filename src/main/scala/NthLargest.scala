object NthLargest {

  def calculation(input: List[Int], nth: Int): Int = {

    nth match {
      case x if x <= input.length => input.sorted.distinct.reverse (nth - 1)
      case _ => throw new IllegalArgumentException
    }
  }

}
