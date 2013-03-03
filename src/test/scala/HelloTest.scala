/*
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.Suite

@RunWith( classOf[JUnitRunner] )
class TestSuite extends Suite {
  def test() {
    val a = 1 + 2;
    assert(a == 3)
  }
}
*/

import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import default.Hello

@RunWith( classOf[JUnitRunner] )
class HelloSuite extends FunSuite {
  test("name should return name") {
    val hello = new Hello("Mike")
    assert("Mike" == hello.name)
  }
  test("get should return hello string") {
    val hello = new Hello("Mike")
    assert("Hello Mike!" == hello.get)
  }
}
