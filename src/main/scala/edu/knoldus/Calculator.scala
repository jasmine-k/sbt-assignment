package edu.knoldus

class Calculator {

  def add(a:Int, b:Int):Int={
    a + b
  }

  def sub(a:Int, b:Int):Int={
    a-b
  }

  def multiply(a:Int, b:Int):Int ={
    a*b
  }

  def divide(a:Int, b:Int):Double ={
    require(b != 0)
    a.toDouble/b
  }

  def power(a:Int, b:Int):Double ={
    def calcPower(a:Int, b:Int, c:Int):Int ={
      if(b == 0) {
        1
      }
      else if(b == 1) {
        c
      }
      else {
        calcPower(a,b-1,c*a)
      }
    }

    if(b>=0){
      calcPower(a,b,a)
    }
    else{
      val res = calcPower(a,-b,a)
      1.0/res
    }

  }

  def modulus(a:Int, b:Int):Int ={
    require(b!=0)
    if(a>=0 && b>0){
      a%b
    }
    else if (a<0 && b<0) {
      val a1 = a*(-1)
      val b1 = b*(-1)
      a1%b1
    }
    else if(a<0 && b>0) {
      val a1 = a*(-1)
      val rem = a1 % b
      b-rem
    }
    else  {
      val b1 = b * (-1)
      val rem = a % b1
      a-rem
    }

  }

  def absolute(a:Int):Int ={
    if (a<0){
      a*(-1)
    }
    else{
      a
    }
  }

  def maxTwo(a:Int, b:Int):Int ={
    if(a<b){
      b
    }
    else{
      a
    }
  }

  def minTwo(a:Int, b:Int):Int ={
    if(a<b){
      a
    }
    else{
      b
    }
  }

}
