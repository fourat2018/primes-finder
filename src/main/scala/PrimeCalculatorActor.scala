import  akka.actor._



class PrimeCalculatorActor  extends Actor {


  def isPrime(number:Int):Boolean = {
    var result = true ;
    for(i <- 2 to number-1){
      result &= (number%i !=0)
    }
    result
  }


  override def receive ={
    case value: Int => sender() ! value -> isPrime(value)

  }
  
}
