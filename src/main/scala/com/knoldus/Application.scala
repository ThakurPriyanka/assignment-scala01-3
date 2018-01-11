package com.knoldus

object Application {
  def main(args: Array[String]): Unit = {
    val num1 = 1
    val num2 = 2
    val num3 = 4
    val num4 = 6
    val num5 = 8
    val num6 = 1
    val num7 = 2
    val num8 = 4
    val num9 = 6
    val num0 = 8
    val list1 = List(num1, num2, num3, num4, num5)
    val list2 = List(num6, num7, num8, num9, num0)
    val operationObject = new Operations
    print(s"Sum of two list ${operationObject.addingTwoList(list1,list2)} \n")

    val shape = "parallelogram"
    val areaResult = operationObject.area(shape,num1,num2)
    print(s"Area $areaResult \n")
    val resultList = operationObject.doublingListElement(list1)
    if( resultList!= List()) {
         print(s"Doubling the list element  ${resultList} \n")
    }
    else {
      print(s"Can not calculate it \n")
    }
    print(s"Number of Element  ${operationObject.numberOfElement(list1)} \n")
    print(s"kTH Element  ${operationObject.kthElement(list1,num2)} \n")

    print(s"Reverse List  ${operationObject.reverse(list1)} \n")

    print(s"Fibonacci  ${operationObject.fibonacci(num3)} \n")
    val lis = List(num1,num2,num3,num4)
    print(s"Sum of two list ${operationObject.addingTwoList(list1,lis)} \n")
  }
}
