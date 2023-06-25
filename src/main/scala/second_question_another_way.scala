object second_question_another_way {
  def main(args: Array[String]): Unit = {
    val stringlist: List[String] = List("amal", "nimal", "school", "university", "ant")
    println("The strings that have a length greater than 5 :- " + string_length(stringlist))

}
  def string_length(stringlist: List[String]): List[String] = {
           stringlist.filter(_.length > 5)
    }

  }