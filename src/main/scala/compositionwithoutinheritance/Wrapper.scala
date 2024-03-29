package compositionwithoutinheritance

import scala.language.implicitConversions

class Wrapper private(private val delegate: Delegate) {
  def implementedName = "Wrapper"
  def extraName = "Extra"
}

object Wrapper {
  implicit def wrapper2delegate(wrapper: Wrapper) = wrapper.delegate
  def apply() = new Wrapper(Delegate())
}
