package inheritance

class Parent {
  def inheritedName = "Same"
  def overriddenName = "Parent"
}

object Parent {
  def apply() = new Parent()
}
