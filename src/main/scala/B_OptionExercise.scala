import util.control.Breaks._

object B_OptionExercise extends App {

  def plateformeStore = Map(
    "REL1" -> "dev",
    "REL2" -> "dev",
    "REL3" -> "dev",
    "REC1" -> "integ",
    "REC2" -> "integ",
    "REC3" -> "integ",
    "PRD6" -> "prod",
    "PRD7" -> "prod"
  )

  //récupérer une valeur existante dans une map
  val key : String = "REC3"
  val plateforme : String =
    if (plateformeStore.contains(key)) {
      plateformeStore(key)
    } else {
      "non trouvé"
    }
  println(plateforme)

  //Trouver dans un liste
  def statusList = List("dev", "integ", "prod")

  var result = "non trouvé"
  breakable {
    for (status <- statusList) {
      if (status == "dev") {
        result = status
        break
      }
    }
  }
  println(result)


}
