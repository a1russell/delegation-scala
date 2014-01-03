package inheritance

class Child extends Parent {
  override def overriddenName = "Child"
  def extraName = "Extra"
}

object Child {
  def apply() = new Child()
}