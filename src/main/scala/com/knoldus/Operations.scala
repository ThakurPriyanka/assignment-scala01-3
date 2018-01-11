package com.knoldus

class Operations {
  def doublingListElement(list: List[Int]): List[Int] = {
    list.map(item => item * 2)
  }

  def addingTwoList(list1: List[Int], list2: List[Int]): List[Int] = {
    val list1Length = list1.length
    val list2Length = list2.length
    if (list1Length < list2Length) {
      val resultList = for (i <- 0 until list1Length) yield list1(i) + list2(i)
      resultList.to[List]:::list1.drop(list2Length)
    }
    else if (list1Length > list2Length) {
      val resultList = for (i <- 0 until list2Length) yield list1(i) + list2(i)
      resultList.to[List]:::list1.drop(list2Length)
    }
    else if (list1Length == list2Length) {
      val resultList = for (i <- 0 until list2Length) yield list1(i) + list2(i)
      resultList.to[List]
    }
    else {
      List()
    }
  }

  def area(shape: String, first: Int, second: Int): String = {
    val shapeInput = shape.toLowerCase
    def areaFinal(num1: Int,num2: Int,f:(Int,Int) => Int): Int ={
      f(num1,num2)
    }
    shapeInput match {
      case "parallelogram" => {
        val result = areaFinal(first,second,(first, second)=> 1/2 *  first*second)
        s"Area of parallelogram is $result"
      }
      case "rectangle" | "rhombus" => {
        val result = areaFinal(first,second,(first, second)=> first*second)
        s"Area of Rectangle is $result"
      }
      case _ => s"Not defined for $shape "
    }
  }
def numberOfElement(list: List[Int]): Int = {
  def counter(list: List[Int],count: Int): Int ={
    list match {
      case head::tail => counter(tail,count + 1)
      case Nil => count
    }
  }
  val count = 0
  counter(list,count)
}
  def kthElement(list: List[Int], position: Int): Int = {
    if(position < list.length && list != Nil) {
      list match {
        case head :: tail if position > 0 => kthElement(tail, position - 1)
        case head :: tail if (position == 0) => head
      }
    }
    else {
      -1
    }
  }

  def reverse(list: List[Int]): List[Int] = {
    if(list != Nil) {
      val resultList = for (i <- list.length - 1 to 0 by -1) yield list(i)
      resultList.to[List]
    }
    else {
      List()
    }
  }
  def fibonacci( num : Int) : List[Int] = {
    def fib(num: Int): Int = {
      def fibTail(num: Int, first: Int, second: Int): Int = num match {
        case 0 => first
        case _ => fibTail(num - 1, second, first + second)
      }
      fibTail(num, 0, 1)
    }

  val result =  for (i <- 0 until num) yield  { fib(i) }
  result.to[List]
  }

  def addingTwoLists(list1: List[Int], list2: List[Int]): List[Int] = {
    val length1 = list1.length
    val length2 = list2.length
    val index=0
    def adding(list:List[Int],index: Int): List[Int] = {
      list match {
        case head::tail if index < length2 => val num = head + list2(index);print(num); adding(num::tail,index + 1)
        case head::tail if index >= length2 => list
      }
    }
    if (length1 == length2) {
      val resultList = for (i <- 0 to list1.length - 1) yield list1(i) + list2(i)
      resultList.to[List]
    }
    else if (length1 > length2){
    adding(list1,index)
    }
    else {
      adding(list2,index)
    }


  }
}

