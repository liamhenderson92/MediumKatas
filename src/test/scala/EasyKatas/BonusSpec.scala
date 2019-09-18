package EasyKatas

import org.scalatest.{MustMatchers, WordSpec}

class BonusSpec extends WordSpec with MustMatchers {

  "Bonus" should {

    "return correct amount when salary is £0 and no bonus" in {
      Bonus.bonusChecker(0, false) mustEqual "£0"
    }

    "return correct amount when salary is £100 and no bonus" in {
      Bonus.bonusChecker(100, false) mustEqual "£100"
    }

    "return correct amount when salary is £100 and bonus" in {
      Bonus.bonusChecker(100, true) mustEqual "£120"
    }

  }

}
