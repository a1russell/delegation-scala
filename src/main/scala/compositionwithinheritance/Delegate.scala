package compositionwithinheritance

class Delegate extends Interface {
  def delegatedName = "Same"
}

object Delegate {
  def apply() = new Delegate()
}
