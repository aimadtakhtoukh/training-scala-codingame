object A_SeqExercise extends App {

  case class Person(name : String, age : Int)

  def backTeam = Seq(
    Person("Aimad", 27),
    Person("Boris", 28),
    Person("Hakim", 35),
    Person("Johan", 29),
    Person("Baptiste", 12),
    Person("Simon", 44),
    Person("Cyrille", 2200)
  )

  // Filtered members
  for (member <- backTeam) {
    if (member.age % 2 != 0) {
      if (member.name.length <= 5) {
        println(member.name)
      }
    }
  }

  // Sum of ages
  var totalSum = 0
  for (member <- backTeam) {
    totalSum += member.age
  }
  println(totalSum)

  // Average of ages
  var total = 0
  var backTeamSize = backTeam.size
  for (member <- backTeam) {
    total += member.age
  }
  println(total / backTeamSize)

}
