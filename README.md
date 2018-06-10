# primes-finder
  The actor system is made of a super actor that creates a pool of workers
  The super actor receives a range of integers and dispatches each one of the numbers to a worker actor
  The worker actor determines if a received number is prime and sends back the result to the super actor
  The super actor prints the result




