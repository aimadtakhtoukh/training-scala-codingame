import E_EitherExercise.{numberStringList, toIntTry}

object E_EitherFixed extends App {

  numberStringList
    .map(numberString => (numberString -> toIntTry(numberString)))
    .map{case (string, intTry) => string -> intTry.toEither}
    .map{case (string, either) => either match {
      case Left(_) => Left(string)
      case r : Right[Throwable, Int] => r
    }}
    .foreach(println)
}
