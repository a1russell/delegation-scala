package compositionwithinheritance

class Delegate {
  def delegatedName = "Same"
}

object Delegate {
  def apply() = new Delegate()
}
