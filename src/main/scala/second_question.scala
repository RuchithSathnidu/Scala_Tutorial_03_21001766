object second_question {
  def main(args: Array[String]): Unit = {
      val stringlist:List[String] = List("amal","nimal","school","university","ant")
      println("The strings that have a length greater than 5 :- " + string_length(stringlist))

  }

  def string_length(stringlist: List[String]): List[String] = {

    var i:Int = 0;
    var newlist:List[String] = List ()
    while (stringlist.length>i)
      {
         if(stringlist(i).length>5)
           {
             newlist = newlist :+ stringlist(i)

           }

        i = i + 1
      }

    return  newlist
  }


}
