import C_TryExample.numberStringList

import scala.util.{Failure, Success, Try}

object C_TryFixed extends App {
  numberStringList
    .map(numberString => Try {numberString.toInt})
    .foreach({
      case Success(number: Int) => println(number)
      case Failure(e : NumberFormatException) => println("Nope")
      case Failure(_) => // Ignoré
    })
}
