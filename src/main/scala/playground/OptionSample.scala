package playground

object OptionSample {
  val maybeInt: Option[Int] = Some(3)

  def maybeAdd(maybeInt: Option[Int]): Option[Int] = {
    if(maybeInt.isDefined)
      Option(maybeInt.get + 1)
    else
      maybeInt
  }

  def maybeAddWithMap(maybeInt: Option[Int]): Option[Int] = {
    // x.map(i => i + 1) はこのように書ける
    maybeInt.map(_ + 1)
  }

  def maybeAddWithFlatMap(maybeInt: Option[Int]) = {
    maybeInt.flatMap(a => Option(a + 1))
  }

  def sumWithMap(maybeIntA: Option[Int], maybeIntB: Option[Int]): Option[Int] = {
    maybeIntA.map(a =>
      maybeIntB.map(b => a + b).getOrElse()
    )
  }

  def sumWithFlatMap(maybeIntA: Option[Int], maybeIntB: Option[Int]): Option[Int] = {
    maybeIntA.flatMap(a =>
      maybeIntB.flatMap(b => Option(a + b))
    )
  }

  def sumWithForYield(maybeIntA: Option[Int], maybeIntB: Option[Int]): Option[Int] = {
    for {
      a <-maybeIntA
      b <- maybeIntB
    } yield a + b
  }

  def maybeAddWithFor(maybeInt: Option[Int]): Option[Int] = {
    for {
      x  <- maybeInt
    } yield x + 1
  }

  maybeAdd(maybeInt)

  // Option(something)のままsomethingを処理する
  val mayParsableInt: Option[String] = Some("1")

  val result: Option[Int] = mayParsableInt.map(_.toInt)

  val yetAnotherResult: Option[Int] = for {
    o <- Some(1)
  } yield o.toInt
}
