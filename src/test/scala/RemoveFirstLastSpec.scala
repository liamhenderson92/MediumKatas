import org.scalatest.{MustMatchers, WordSpec}

import scala.util.Random

class RemoveFirstLastSpec extends WordSpec with MustMatchers {

  val random = new Random
  val randomNum = random.nextInt(10)

//  def createRandomString = random.nextString(3)

  "RemoveFirstLast" must {

    "return an empty list when given an empty list" in {
      RemoveFirstLast.remove(List()) mustEqual Nil
    }

    "return an empty list when given a list with one element" in {
      RemoveFirstLast.remove(List(1)) mustEqual Nil
    }

    "return an empty list when given a list with two elements" in {
      RemoveFirstLast.remove(List(1,2)) mustEqual Nil
    }

    "return a list with 2 being the only element when given a list of 1,2,3" in {
      RemoveFirstLast.remove(List(1,2,3)) mustEqual List(2)
    }

    s"return a list of ${randomNum-1} elements where x is a random value when given a list of 0 to ${randomNum}" in {

      val list = (0 to randomNum).toList
      val expectedResult = (1 to randomNum-1).toList
      RemoveFirstLast.remove(list) mustEqual expectedResult
    }

//    "return a list of strings without the first and last elements when a random list of strings is given" in {
//
//      val list = for(x  <- 0 to randomNum) yield createRandomString
//      val expectedResult = list.filterNot(x => x == list(randomNum-2)).toList

//      RemoveFirstLast.remove[String](list.toList) mustEqual expectedResult
//    }
  }

}
