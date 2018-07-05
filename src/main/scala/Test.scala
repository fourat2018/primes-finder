
import  akka.actor._


object Test {


  def main(args: Array[String]) {
    val primeSystem = ActorSystem("Prime_Numbers_System")

    val superActor = primeSystem.actorOf(Props[SuperActor],"Prime_Actor_Chief")
    superActor ! (1 to 1000)
  }


}


