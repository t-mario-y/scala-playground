import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class MyJsonParserSpec extends AnyWordSpec with Matchers {
  "encode" should {
    "convert from Scala object to JSON string" in {
      val user = User(
        name = "Taro",
        address = "Tokyo",
        age = 14
      )

      val actual = MyJsonParser.encode(user)

      val expected =
        """{
          |  "address": "Tokyo",
          |  "age": 14,
          |  "name": "Taro"
          |}""".stripMargin
      actual should be(expected)
    }
  }

  "decode" should {
    "convert from JSON string to Scala object" in {
      val userString =
        """{
          |  "address": "Tokyo",
          |  "age": 14,
          |  "name": "Taro"
          |}""".stripMargin

      val actual = MyJsonParser.decode(userString)

      val expected = User(
        name = "Taro",
        address = "Tokyo",
        age = 14
      )
      actual should be(expected)
    }
  }
}
