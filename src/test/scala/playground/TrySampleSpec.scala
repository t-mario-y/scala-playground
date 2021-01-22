package playground

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class TrySampleSpec extends AnyWordSpec with Matchers {
  "letsTry" should {
    "run successful when separated with a dot" in {
      val actual = TrySample.letsTry("a.b").isSuccess

      actual should be(true)
    }

    "be failed when doesn't contain 2 or more dots" in {
      val actual = TrySample.letsTry("a.b.c").isFailure

      actual should be(true)
    }

    "be failed when doesn't contain dot" in {
      val actual = TrySample.letsTry("a").isFailure

      actual should be(true)
    }
  }
}
