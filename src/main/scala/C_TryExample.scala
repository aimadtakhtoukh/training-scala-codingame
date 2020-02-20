object C_TryExample extends App {

  def numberStringList = List("1", "2", "three", "quatre", "5")

  for (numberString <- numberStringList) {
    try {
      println(numberString.toInt)
    } catch {
      case e : NumberFormatException =>
        println("Nope")
    }
  }

}
