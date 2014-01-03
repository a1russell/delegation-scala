package inheritance

class Child extends Parent {
  override def overriddenName = "Child"
}

object Child {
  def apply() = new Child()
}