package compositionwithoutinheritance

import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class DelegateTest extends Specification {
  "The delegate's name that will be used by the wrapper" should {
    "be Same" in {
      Delegate().delegatedName must be_==("Same")
    }
  }

  "The delegate's name that will be different from the wrapper" should {
    "be Delegate" in {
      Delegate().implementedName must be_==("Delegate")
    }
  }
}
