object RemoveFirstLast extends App {

//  def remover(input: List[Int]): List[Int] = {
//    if (input == Nil) {
//      Nil
//    } else {
//      val x = input.tail
//      x.dropRight(1)
//    }
//  }

  def remove[T](input: List[T]): List[T] = {

    input match {
      case Nil => Nil
      case _ => input.tail.dropRight(1)
    }
  }

}
