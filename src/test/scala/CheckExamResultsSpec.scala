import org.scalatest.{MustMatchers, WordSpec}

class CheckExamResultsSpec extends WordSpec with MustMatchers {

  "checkExamResults" must {
    "return correct score" when {
      "person answers all questions blank" in {
        CheckExamResults.checkExamResults(List("a", "b", "c", "d"), List("", "", "", "")) mustEqual 0
      }

      "person answers one correct answer and leaves the remaining blank" in {
        CheckExamResults.checkExamResults(List("a", "b", "c", "d"), List("a", "", "", "")) mustEqual 4
      }

      "person answers four correct answer" in {
        CheckExamResults.checkExamResults(List("a", "b", "c", "d"), List("a", "b", "c", "d")) mustEqual 16
      }

      "person answers one correct answer and one incorrect answer then the remaining blank" in {
        CheckExamResults.checkExamResults(List("a", "b", "c", "d"), List("a", "a", "", "")) mustEqual 3
      }

      "person answers two correct answer and one incorrect answer then one remaining blank" in {
        CheckExamResults.checkExamResults(List("a", "b", "c", "d"), List("a", "a", "c", "")) mustEqual 7
      }
    }
  }
}
