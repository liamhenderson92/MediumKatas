import scala.collection.immutable
import scala.util.Random

val a = List(1,2,3,4)

val b = List(1,2,3,6)

val c = a.zip(b)

val d = c.map(x => if (x._1 == x._2) 4 else 0).sum


val random = new Random
val randomNum = random.nextInt(10)

def createRandomString = random.nextString(3)

val list: immutable.Seq[String] = for(x  <- 0 to randomNum) yield createRandomString
//
//val expectedResult: immutable.Seq[String] = list.filterNot(x => x == list(randomNum-1))

list.filter(x => x == list)

//val expectedResult = list.filterNot(x => x == list(randomNum-1)).toList


