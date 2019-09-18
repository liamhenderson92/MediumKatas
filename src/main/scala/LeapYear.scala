object LeapYear {

  def isLeapYear(year: Int): Boolean = {
      year match {
        case 1 if year <= 0 => false
        case 2 if year % 400 == 0 => true
        case 3 if year % 100 == 0 && year % 400 != 0 => false
        case 4 if year % 4 == 0 && year % 100 != 0 => true
        case 5 if year % 4 != 0 => false
        case _ => false
      }

  }
}
