object OrangesAndApples extends App {

  def supermarket(numApples: Int, numOranges: Int): String = {

    val applesPrice: Double = 0.5
    val orangesPrice: Double = 0.75

    def totalApplesPrice(numApples: Int): Double = {
      numApples match {
        case x if x < 3 => numApples * applesPrice
        case x if x % 3 == 0 => numApples * applesPrice * 2 / 3
        case _ => (numApples * 2 / 3 * applesPrice) + (numApples % 3) * applesPrice
      }
    }

    def totalOrangesPrice(numOranges: Int): Double = {
      numOranges match {
        case x if x < 2 => numOranges * orangesPrice
        case x if x % 2 == 0 => numOranges * orangesPrice / 2
        case _ => (numOranges / 2 * orangesPrice) + orangesPrice
      }
    }
    val totalBill: Double = totalApplesPrice(numApples) + totalOrangesPrice(numOranges)

    f"£$totalBill%1.2f"
  }

}
