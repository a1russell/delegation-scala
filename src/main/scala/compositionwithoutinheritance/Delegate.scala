package compositionwithoutinheritance

class Delegate {
  def delegatedName = "Same"
}

object Delegate {
  def apply() = new Delegate()
}
