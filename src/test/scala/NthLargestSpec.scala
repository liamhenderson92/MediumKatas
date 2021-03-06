import org.scalatest.{MustMatchers, WordSpec}

class NthLargestSpec extends WordSpec with MustMatchers {

  "NthLargest" must {
    "return the correct elements" when {
      "given 2 different numbers and n equal to 2" in {
        NthLargest.calculation(List(1, 2), 2) mustEqual 1
      }

      "given 2 different numbers and n equal to 1" in {
        NthLargest.calculation(List(1, 2), 1) mustEqual 2
      }

      "given a small list and n equal to 2" in {
        NthLargest.calculation(List(1, 2, 3, 4, 5), 2) mustEqual 4
      }

      "given a largest list and n equal to 4" in {
        NthLargest.calculation(List(1, 4, 6, 7, 2, 3, 1, 5, 4, 5), 4) mustEqual 4
      }

      "given a larger distinct list and n equal to 3" in {
        NthLargest.calculation(List(3, 3, 4, 4, 5, 5), 3) mustEqual 3
      }
    }

    "throw an Illegal Argument Exception" when {
      "when given a list of 2 numbers and n equal to 3" in
        intercept[IllegalArgumentException] {
          NthLargest.calculation(List(1, 2), 3)
        }
    }
  }

}
