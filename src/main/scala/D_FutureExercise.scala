object D_FutureExercise extends App {

  def uselessJob(string : String): String = {
    Thread.sleep(1000)
    string
  }

  for (_ <- 1 to 10) {
    println(uselessJob("Useless job is useless"))
  }

}
