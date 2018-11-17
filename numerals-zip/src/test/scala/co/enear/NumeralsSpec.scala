package co.enear

import org.specs2._
import org.specs2.matcher.Matchers

// Change this spec to whatever you think is suitable to cover important or all cases
class NumeralsSpec extends mutable.Specification with Matchers {
  "Numerals object should" should {
    "Compute the integer value of the I numeral" in {
      Numerals.numeralsToInteger("I") === 1
    }
  }

  "Numerals object should" should {
    "Compute the integer value of the MCMXC numeral" in {
      Numerals.numeralsToInteger("MCMXC") === 1990
    }
  }

  "Numerals object should" should {
    "Compute the integer value of the MMML numeral" in {
      Numerals.numeralsToInteger("MMML") === 3500
    }
  }

  "Numerals object should" should{
    "Returns the integer different than 6 for the value IV" in{
      Numerals.numeralsToInteger("IV") != 6
    }
  }
}
