package EasyKatas

import org.scalatest.{MustMatchers, WordSpec}

class CountOddsSpec extends WordSpec with MustMatchers{

  "CountOdds" must {

    "return an empty list when given 0 as the input" in {
      CountOdds.count(0) mustEqual Nil
    }

    "return an empty list when given 1 as the input" in {
      CountOdds.count(1) mustEqual Nil
    }

    "return a list of 1 when given 2 as the input" in {
      CountOdds.count(2) mustEqual List(1)
    }

    "return a list of 1,3 when given 5 as the input" in {
      CountOdds.count(5) mustEqual List(1,3)
    }

    "return a list of 1,3,5,7,9,11,13 when given 15 as the input" in {
      CountOdds.count(15) mustEqual List(1,3,5,7,9,11,13)
    }

    "return a list of 0 when given -5 as the input" in {
      CountOdds.count(-5) mustEqual Nil
    }

    "return a list of 0 when given -15 as the input" in {
      CountOdds.count(-15) mustEqual Nil
    }


  }

}
