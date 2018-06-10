
import  akka.actor._




class SuperActor extends Actor {

  var workPool = List[ActorRef]()

  override def preStart() = {
    (1 to 5).foreach { i => var actorRef = context.actorOf(Props[PrimeCalculatorActor],"actor_"+i)

      workPool ::= actorRef

    }
  }

  override def receive = {
    case range:Range => val workers =  Iterator.continually(workPool).flatten
                  range.foreach{ number:Int => workers.next ! number}

    case (number:Int, predicate : Boolean ) => if(predicate) println(number + " is Prime") else println(number + " is not prime")

  }



}
