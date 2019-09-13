import org.scalatest.{MustMatchers, WordSpec}

class LeapYearSpec extends WordSpec with MustMatchers {

  "LeapYear" must {

    "return true if year can be divisible by 400" in {
      LeapYear.isLeapYear(2000) mustEqual true
    }

    "return false if year can't be divisible by 400" in {
      LeapYear.isLeapYear(1993) mustEqual false
    }

    "return false if year can be divided by 100 but not 400" in {
      LeapYear.isLeapYear(1900) mustEqual false
    }

    "return true if the year can be divided by 4 or 400 but not 100" in {
      LeapYear.isLeapYear(2020) mustEqual true
    }

    "return false if the year is odd" in {
      LeapYear.isLeapYear(1999) mustEqual false
    }

    "return false when given an impossible year" in {
      LeapYear.isLeapYear(-10) mustEqual false
    }

    "return true when given 1996" in {
      LeapYear.isLeapYear(1996) mustEqual true
    }

    "return true when given 2000" in {
      LeapYear.isLeapYear(2000) mustEqual true
    }
  }

}
