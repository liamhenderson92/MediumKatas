val input = -5

val until = (0 until input).toList

val to = (0 to input).toList

until.flatMap(x => if (x % 2 == 0) Nil else List(x))




val num = 5




