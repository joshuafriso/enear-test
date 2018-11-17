
package co.enear

import scala.language.postfixOps

object Numerals extends App {

  /**
   * Given a string containing a correct roman Numeral, returns its integer value
   *
   */

  def numeralsToInteger(numerals: String): Unit = {
    var ini: Int = 0
    var decimal: Int = 0

    while(ini < numerals.length){
      var num = letterToNumber(numerals.toUpperCase.charAt(ini))

      ini += 1

      if(ini == numerals.length) {
        decimal += num
      }
      else {
        var nextNum: Int = 0
        if(ini < numerals.length) {
          nextNum = letterToNumber(numerals.toUpperCase.charAt(ini))
        }
        if (nextNum > num) {
          decimal += (nextNum - num)
          ini += 1
        } else {
            decimal += num
        }
      }

    }
    if(decimal > 3000) println("The number needs be less than 3000")
    else println(s'The roman number ${numerals.toUpperCase} = ${decimal}')
  }

  def letterToNumber(c: Char): Int ={
    c match{
      case 'I' => 1
      case 'V' => 5
      case 'X' => 10
      case 'L' => 50
      case 'C' => 100
      case 'D' => 500
      case 'M' => 1000
      case _ => -1
    }
  }
  numeralsToInteger("mmxiv")
  numeralsToInteger("MCMXC")
  numeralsToInteger("MCMLIV")
  numeralsToInteger("MMMD")
}
