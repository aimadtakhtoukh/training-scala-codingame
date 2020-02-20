import D_FutureExercise.uselessJob

import scala.concurrent.{Await, Future}
import scala.concurrent.duration.Duration

object D_FutureFixed {

  import scala.concurrent.ExecutionContext.Implicits.global

  (1 to 10)
    .map(_ => Future{println(uselessJob("Useless job is useless"))})
    .foreach(Await.ready(_, Duration.Inf))

}
