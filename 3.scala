object Que3 {
  
  //convert strings to uppercase and lowercase
  val toUpper: String => String = _.toUpperCase()
  val toLower: String => String = _.toLowerCase()


  def formatNames(name: String)(format: String => String): String = format(name)

  def main(args: Array[String]): Unit = {

    val names = List("Benny", "Niroshan", "Saman", "Kumara")
    
    println("Names: " + names)

    println(formatNames(names(0))(toUpper)) // Convert to uppercase
    println(s"${names(1).charAt(0)}${formatNames(names(1).charAt(1).toString())(toUpper)}${names(1).substring(2)}")//Convert second letterto uppercase
    println(formatNames(names(2))(toLower)) // Convert to lowercase
    println(s"${names(3).substring(0, names(3).length - 1)}${formatNames(names(3).last.toString())(toUpper)}") // Convert last letterto uppercase
  }
}
