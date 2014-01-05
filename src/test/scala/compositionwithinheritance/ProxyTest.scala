package compositionwithinheritance

import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ProxyTest extends Specification {
  "The proxy's name that is delegated" should {
    "be Same" in {
      Proxy().delegatedName must be_==("Same")
    }
  }
}
