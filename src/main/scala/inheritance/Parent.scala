package inheritance

class Parent {
  def inheritedName = "Same"
}

object Parent {
  def apply() = new Parent()
}
