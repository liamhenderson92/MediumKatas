import org.scalatest.{MustMatchers, WordSpec}

class HeadsAndLegsSpec extends WordSpec with MustMatchers {

  "HeadsAndLegs" must {

    "return the correct elements" when {

      "when given amount for 1 cow and no chickens (1 head and 4 legs)" in {
        HeadsAndLegs.calculation(1, 4) mustEqual(0, 1)
      }

      "when given amount for 1 chicken and no cows (1 head and 4 legs)" in {
        HeadsAndLegs.calculation(1, 2) mustEqual(1, 0)
      }

      "when given the amount for 17 chickens and 48 cows (65 heads and 226 legs)" in {
        HeadsAndLegs.calculation(65, 226) mustEqual(17, 48)
      }

    }

    "return no solution found" when {

      "when given a small amount of incorrect heads and legs" in {
        HeadsAndLegs.calculation(3, 11) mustEqual "No solution found"
      }

      "when given a larger amount of incorrect heads and legs" in {
        HeadsAndLegs.calculation(1245, 44557) mustEqual "No solution found"
      }

    }
  }

}
