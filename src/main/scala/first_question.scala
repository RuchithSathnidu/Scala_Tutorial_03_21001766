object first_question {
  def main(args: Array[String]): Unit = {
    var str:String = "Hello World"
    println("Reverse string :- " + reverse_string(str))

  }


  def reverse_string (str: String): String = {
    if (str.isEmpty) {""}
    else {
         reverse_string(str.tail) + str.head
    }

  }

}
