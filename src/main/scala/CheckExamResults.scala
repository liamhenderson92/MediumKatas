object CheckExamResults {

  def checkExamResults(correctAnswers: List[String], answers: List[String]): Int = {
    val answerComparison: Seq[(String, String)] = correctAnswers.zip(answers)

    answerComparison.map(x =>
      x match {
        case x if (x._1 == x._2) && (x._2 != "") => 4
        case x if (x._1 != x._2) && (x._2 != "") => -1
        case _ => 0
      }
    ).sum
  }
}