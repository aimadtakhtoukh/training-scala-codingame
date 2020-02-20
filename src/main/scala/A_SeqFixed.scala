import A_SeqExercise.backTeam

object A_SeqFixed extends App {

  // Filtered members
  backTeam
    .filter(_.age % 2 != 0)
    .filter(_.name.length <= 5)
    .map(_.name)
    .foreach(println)

  // Sum of ages
  println(
    backTeam
      .map(_.age)
      .sum
  )

  // Average of ages
  val (sum : Int, count : Int) = backTeam
    .map(_.age)
    .map(_ -> 1)
    .reduce((first, second) => (first._1 + second._1) -> (first._2 + second._2))
  println(sum / count)
}
