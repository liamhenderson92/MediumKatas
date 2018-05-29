val list1 = List(2,0,2)

val zipppedList = list1.zipWithIndex

list1.zipWithIndex.collect {
  case (element, index) if element==0 && index==0 => 0*0
  case (element, index) if element !=0 && index !=0 && element%index== 0 => element
}





