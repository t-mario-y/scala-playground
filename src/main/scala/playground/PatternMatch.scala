package playground

class PatternMatch {
  def matchWithString(source: Long): String = {
    source match {
      case a if a >= 100 && a <= 150 => "small"
      case a if a <= 180 => "medium"
      case a if a >= 200 => "large"
      case _ => s"can not parse:${source}"
    }
  }

  def matchWithList(source: List[Any]): String = {
    source match {
      case list@List(_, _) =>
        s"This is a list of size ${list.size}. "
      case _ => "can not parse."
    }
  }

  def matchWithType(source: Any): String = {
    source match {
      case string: String => s"This is a String:${string}"
      case wholeNumber: Long => s"This is a whole number:${wholeNumber}"
      case bool: Boolean => s"This is a boolean:${bool}"
      case _ => s"can not parse: ${source.toString}"
    }
  }

  def fizzbuzz: Unit = {
    (1 to 100).toList.foreach {
      case i if i % 15 == 0 => println("fizzbuzz")
      case i if i % 3 == 0 => println("fizz")
      case i if i % 5 == 0 => println("buzz")
      case i => println(i)
    }
  }
}
