package playground

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class HelloScalaSpec extends AnyWordSpec with Matchers {
  "hello" should {
    "run well" in {
      val actual = HelloScala.hello

      val expected = "ok"
      actual should be(expected)
    }
  }
}
