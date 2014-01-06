package compositionwithoutinheritance

import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class WrapperTest extends Specification {
  "The wrapper's name that is delegated" should {
    "be Same" in {
      Wrapper().delegatedName must be_==("Same")
    }
  }

  "The wrapper's name that is implemented" should {
    "be Wrapper" in {
      Wrapper().implementedName must be_==("Wrapper")
    }
  }
}
