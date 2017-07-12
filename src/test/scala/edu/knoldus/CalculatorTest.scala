package edu.knoldus

import org.scalatest.FunSuite

class CalculatorTest extends FunSuite {

  test("Check for add in calculator") {
    assert(new Calculator().add(2,3) == 5)
  }


  test("Check for subtract in calculator") {
    assert(new Calculator().sub(2,3) === -1)
  }


  test("Check for multiply in calculator") {
    assert(new Calculator().multiply(2,3) === 6)
  }


  test("Check for divide in calculator") {
    intercept[java.lang.IllegalArgumentException]{
      new Calculator().divide(1,0)
    }
  }

  test("Check for second time divide in calculator") {
    assert(new Calculator().divide(2,4) === 0.5)
  }

  test("Check for third time divide in calculator") {
    assert(new Calculator().divide(27,9) === 3)
  }

  test("Check for power in calculator") {
    assert(new Calculator().power(2,3) === 8)
  }

  test("Check second time for power in calculator") {
    assert(new Calculator().power(2,0) === 1)
  }

  test("Check third time for power in calculator") {
    assert(new Calculator().power(2,-3) === 0.125)
  }

  test("Check for modulus in calculator") {
    assert(new Calculator().modulus(4,3) === 1)
  }

  test("Check for second time modulus in calculator") {
    assert(new Calculator().modulus(3,4) === 3)
  }

  test("Check for third time modulus in calculator") {
    assert(new Calculator().modulus(-4,-3) === 1)
  }

  test("Check for fourth time modulus in calculator") {
    assert(new Calculator().modulus(-4,3) === 2)
  }

  test("Check for fifth time modulus in calculator") {
    assert(new Calculator().modulus(4,-3) === 3)
  }

  test("Check for absolute in calculator") {
    assert(new Calculator().absolute(-4) === 4)
  }

  test("Check for second time absolute in calculator") {
    assert(new Calculator().absolute(4) === 4)
  }

  test("Check for maxTwo in calculator") {
    assert(new Calculator().maxTwo(2,3) === 3)
  }

  test("Check second time for maxTwo in calculator") {
    assert(new Calculator().maxTwo(3,2) === 3)
  }

  test("Check for minTwo in calculator") {
    assert(new Calculator().minTwo(2,3) === 2)
  }


  test("Check second time for minTwo in calculator") {
    assert(new Calculator().minTwo(3,2) === 2)
  }

}
