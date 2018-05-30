import org.scalatest.{MustMatchers, WordSpec}

class HeadsAndLegsSpec extends WordSpec with MustMatchers {

  "HeadsAndLegs" must {

    "return no solution found when given an incorrect amount of heads and legs" in {
      HeadsAndLegs.calculation(3,11) mustEqual "No solution found"
    }

    "return 1 cow (0,1) when given amount for 1 cow (1 head and 4 legs)" in {
      HeadsAndLegs.calculation(1,4) mustEqual (0,1)
    }

    "return 1 chicken (1,0) when given amount for 1 chicken (1 head and 4 legs)" in {
      HeadsAndLegs.calculation(1,2) mustEqual (1,0)
    }

    "return no solution found when given a larger amount of incorrect heads and legs" in {
      HeadsAndLegs.calculation(1245, 44557) mustEqual "No solution found"
    }

    "return 17 chickens and 48 cows (17,48) when given 65 heads and 226 legs" in {
      HeadsAndLegs.calculation(65,226) mustEqual (17,48)
    }

  }

}
