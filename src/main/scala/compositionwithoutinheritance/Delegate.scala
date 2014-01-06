package compositionwithoutinheritance

class Delegate {
  def delegatedName = "Same"
  def implementedName = "Delegate"
}

object Delegate {
  def apply() = new Delegate()
}
