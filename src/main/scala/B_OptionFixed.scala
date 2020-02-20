import B_OptionExercise.{plateformeStore, statusList}

object B_OptionFixed {

  //récupérer une valeur existante dans une map
  println(plateformeStore.getOrElse("REC3", "non trouvé"))

  //Trouver dans un liste
  println(statusList.find(_ equals "dev").getOrElse("non trouvé"))

}
