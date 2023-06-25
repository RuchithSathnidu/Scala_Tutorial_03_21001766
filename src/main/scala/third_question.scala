object third_question {
  def main(args: Array[String]): Unit = {
    println("Average :- " + average(15,12))
  }

  def average(num1: Int, num2: Int): Double = {
    val average: Double = (num1 + num2) / 2.0
    val  rounded_average:Double = BigDecimal(average).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble

    return  rounded_average

  }


}
