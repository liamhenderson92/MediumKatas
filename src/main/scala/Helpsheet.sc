val list1 = List(2,0,2)

val zipppedList = list1.zipWithIndex

list1.zipWithIndex.collect {
  case (element, index) if element==0 && index==0 => 0*0
  case (element, index) if element !=0 && index !=0 && element%index== 0 => element
}

val nthList = List(3)
val nth = 3

nthList.distinct.reverse

nthList.distinct.reverse(nth-1)





