val a = List(1,2,3,4,5)

val b = List(2,3,4)

val aNoFL = a.tail.dropRight(1)

a.filterNot(x => x == a)
a.filter(x => x == a)