package compositionwithinheritance

/* There is still no nice way of doing this.
 * Improvements will come with macro annotations, which are only available in 2.10
 * via the macro paradise plugin.
 * Delegation proof of concept by Adam Warski:
 * https://github.com/adamw/scala-macro-aop
 */
class Proxy private(private val delegate: Delegate) extends Interface {
  def delegatedName: String = delegate.delegatedName
  def implementedName = "Proxy"
  def extraName = "Extra"
}

object Proxy {
  def apply() = new Proxy(Delegate())
}
