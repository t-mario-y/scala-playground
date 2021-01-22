package playground

import scala.util.{Failure, Success, Try}

object TrySample {
  def letsTry(parameter: String): Try[String] = {
    parameter.split('.') match {
      case Array(_, _) => Success("length:2")
      case _ =>
        Failure(new IllegalArgumentException(s"invalid parameter: ${parameter}"))
    }
  }
}
