object IndexMultiples {

  def calculation(input: List[Int]): List[Int] = {

    val zippedList = input.zipWithIndex

    zippedList.collect{
      case (0, 0) => 0
      case (element, index) if element !=0 && index !=0 && element%index== 0 => element
    }

  }

}
