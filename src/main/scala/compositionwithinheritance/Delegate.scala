package compositionwithinheritance

class Delegate extends Interface {
  def delegatedName = "Same"
  def implementedName = "Delegate"
}

object Delegate {
  def apply() = new Delegate()
}
