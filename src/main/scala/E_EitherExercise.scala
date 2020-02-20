import scala.util.{Failure, Success, Try}

object E_EitherExercise extends App {

  def numberStringList = List("1", "2", "three", "quatre", "5")

  def toIntTry(numberString : String): Try[Int] =
    Try {numberString.toInt}

  for (numberString <- numberStringList) {
    toIntTry(numberString) match {
      case Success(value) => println(value)
      case Failure(exception) => println(s"Nope : ${exception.getMessage}")
    }
  }
}
