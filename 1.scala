object Que1 {

  // calculate interest based on deposit and rate
  val calcInterest: (Double, Double) => Double = (deposit, rate) => deposit * rate / 100

  //find the interest rate based on the deposit amount
  val findInterest: Double => Double = {
    case x if x <= 20000 => calcInterest(x, 2)
    case x if x <= 200000 => calcInterest(x, 4)
    case x if x <= 2000000 => calcInterest(x, 3.5)
    case x => calcInterest(x, 6.5)
  }

  def main(args: Array[String]): Unit = {
    print("Deposit amount: ")
    val depositInput = scala.io.StdIn.readDouble()

    println("Yearly interest amounts to: " + findInterest(depositInput))
  }
}
