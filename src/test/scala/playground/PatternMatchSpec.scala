package playground

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class PatternMatchSpec extends AnyWordSpec with Matchers {
  "matchWithType" should {
    "parse whole number" in {
      val actual = {
        new PatternMatch().matchWithType(12.toLong)
      }

      val expected = "This is a whole number:12"
      actual should be(expected)
    }

    "parse string" in {
      val actual = {
        new PatternMatch().matchWithType("hello")
      }

      val expected = "This is a String:hello"
      actual should be(expected)
    }

    "no parse invalid argument" in {
      val actual = {
        new PatternMatch().matchWithType(List("a"))
      }

      val expected = "can not parse: List(a)"
      actual should be(expected)
    }
  }
}
