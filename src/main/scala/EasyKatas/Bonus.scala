package EasyKatas

object Bonus {
  def bonusChecker(salary: Int, bonus: Boolean): String = {

    if (bonus == true) {
      val sum = salary * 1.2
      val total = sum.toInt
      s"£$total"
    } else s"£$salary"
  }

}
