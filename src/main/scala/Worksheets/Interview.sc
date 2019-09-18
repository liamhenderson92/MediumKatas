lazy val x = {
  println("computing x")
  3
}

val y = {
  println("computing y")
  10
}

def add(n: Int): Int = n + 1
add(2)

case class MyCaseClass(number: Int, text: String, others: List[Int])

//new MyCaseClass(1,"liam", List(1,2,3,4,5))

val l1 = new MyCaseClass(1,"txt", List.empty)
val l2 = new MyCaseClass(1,"txt", List.empty)

l1 == l2