import spray.json._

trait MyJsonProtocol extends DefaultJsonProtocol {
  implicit val format: RootJsonFormat[User] = jsonFormat3(User)
}

case class User(name: String, address: String, age: Int)

object MyJsonParser extends App with MyJsonProtocol {
  def encode(user: User): String = {
    user.toJson.prettyPrint
  }

  def decode(jsonString: String): User = {
    jsonString.parseJson.convertTo[User]
  }
}
