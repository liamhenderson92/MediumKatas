import org.scalatest.{MustMatchers, WordSpec}

class OrangesAndApplesSpec extends WordSpec with MustMatchers {

  "OrangesAndApples" must {
    "return correct price when given no apples or oranges" in {
      OrangesAndApples.supermarket(0,0) mustEqual "£0.00"
    }

    "return correct price when given one apple and no oranges" in {
      OrangesAndApples.supermarket(1,0) mustEqual "£0.50"
    }

    "return correct price when given two apples and no oranges" in {
      OrangesAndApples.supermarket(2,0) mustEqual "£1.00"
    }

    "return the correcr price when given no apples and one orange" in {
      OrangesAndApples.supermarket(0,1) mustEqual "£0.75"
    }

    "return correct price when given three apples and no oranges" in {
      OrangesAndApples.supermarket(3,0) mustEqual "£1.00"
    }

    "return correct price when given four apples and no oranges" in {
      OrangesAndApples.supermarket(4,0) mustEqual "£1.50"
    }

    "return correct price when given no apples and two oranges" in {
      OrangesAndApples.supermarket(0,2) mustEqual "£0.75"
    }

    "return correct price when given no apples and three oranges" in {
      OrangesAndApples.supermarket(0,3) mustEqual "£1.50"
    }

    "return correct price when given five apples and five oranges" in {
      OrangesAndApples.supermarket(5,5) mustEqual "£4.75"
    }

  }

}
