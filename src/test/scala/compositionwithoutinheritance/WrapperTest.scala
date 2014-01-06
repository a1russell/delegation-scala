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
}
