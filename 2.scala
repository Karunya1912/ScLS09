object Que2{

  //check if a number is even
  val isEven: Int => Boolean = _ % 2 == 0

  //match a number to a specific case
  val matchNumber: Int => String = {
    case x if x <= 0 => "Zero/ Negative"
    case x if isEven(x) => "Even"
    case x => "Odd"
  }

  //print a message based on the matched number
  val printMessage: Int => Unit = num => println(matchNumber(num) + " number is given!")

  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val inputNum = scala.io.StdIn.readInt()

    printMessage(inputNum)
  }
}
