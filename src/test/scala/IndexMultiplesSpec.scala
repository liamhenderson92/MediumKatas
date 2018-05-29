import org.scalatest.{MustMatchers, WordSpec}

class IndexMultiplesSpec extends WordSpec with MustMatchers {

  "IndexMultiples" must {

    "return nil when given an empty list" in {
      IndexMultiples.calculation(List()) mustEqual Nil
    }

    "return a single number list when given a list with 1 matching number" in {
      IndexMultiples.calculation(List(0)) mustEqual List(0)
    }

    "return a single number list when given a list with 1 matching number and 1 non matching number" in {
      IndexMultiples.calculation(List(1,2)) mustEqual List(2)
    }

    "return a list with two numbers when given a list with 2 matching numbers" in {
      IndexMultiples.calculation(List(0,1)) mustEqual List(0,1)
    }

    "return a list with two numbers when given a small list with 2 matching numbers and 2 non matching numbers" in {
      IndexMultiples.calculation(List(1,0,4,9)) mustEqual List(4,9)
    }

    "return a list with two numbers when given a medium list with 2 matching numbers and 3 non matching numbers" in {
      IndexMultiples.calculation(List(2,4,7,9,10)) mustEqual List(4,9)
    }

    "return a list with five numbers when given a large list with 5 matching numbers and 5 non matching numbers" in {
      IndexMultiples.calculation(List(0,2,3,7,9,10,12,11,24,4)) mustEqual List(0,2,10,12,24)
    }

  }

}
