package inheritance

import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ParentTest extends Specification {
  "The parent's name that will be inherited by children" should {
    "be Same" in {
      Parent().inheritedName must be_==("Same")
    }
  }

  "The parent's name that will be overridden by children" should {
    "be Parent" in {
      Parent().overriddenName must be_==("Parent")
    }
  }
}
