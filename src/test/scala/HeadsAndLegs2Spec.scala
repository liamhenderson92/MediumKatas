import org.scalatest.{MustMatchers, WordSpec}

class HeadsAndLegs2Spec extends WordSpec with MustMatchers {

  "HeadsAndLegs2" must {
    "return 1 cow and 0 chickens when given 1 head and 4 legs" in {
      HeadsAndLegs2.calculator(1, 4) mustEqual "1 cow and 0 chicken"
    }

    "return 2 cow and 0 chickens when given 2 head and 8 legs" in {
      HeadsAndLegs2.calculator(2, 8) mustEqual "2 cow and 0 chicken"
    }

    "return 0 cow and 1 chicken when given 1 head and 2 legs" in {
      HeadsAndLegs2.calculator(1, 2) mustEqual "0 cow and 1 chicken"
    }

    "return 1 cow and 1 chicken when given 2 heads and 6 legs" in {
      HeadsAndLegs2.calculator(2,6) mustEqual "1 cow and 1 chicken"
    }

    "return 4 cow and 6 chicken when given 10 heads and 28 legs" in {
      HeadsAndLegs2.calculator(10,28) mustEqual "4 cow and 6 chicken"
    }
    "return 'No solution found' when given an incorrect amount of heads and legs" in {
      HeadsAndLegs2.calculator(2,100) mustEqual "No solution found"
    }

    "return 'No solution found' when given an odd amount of legs" in {
      HeadsAndLegs2.calculator(20, 97) mustEqual "No solution found"
    }
  }

}
