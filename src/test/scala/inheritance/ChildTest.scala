package inheritance

import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ChildTest extends Specification {
  "The child's name that is inherited from its parent" should {
    "be Same" in {
      Child().inheritedName must be_==("Same")
    }
  }

  "The child's name that overrides its parent's" should {
    "be Child" in {
      Child().overriddenName must be_==("Child")
    }
  }
}
