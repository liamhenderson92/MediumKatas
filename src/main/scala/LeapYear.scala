object LeapYear {

  def isLeapYear(year: Int): Boolean = {
      year match {
        case x if year <= 0 => false
        case x if year % 400 == 0 => true
        case x if year % 100 == 0 && year % 400 != 0 => false
        case x if year % 4 == 0 && year % 100 != 0 => true
        case x if year % 4 != 0 => false
        case _ => false
      }

  }
}
