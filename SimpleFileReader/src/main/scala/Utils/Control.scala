package Utils

import scala.language.reflectiveCalls
import scala.reflect.Selectable.reflectiveSelectable
object Control {
  def using[A <: { def close(): Unit }, B](resource: A)(f: A => B): B =
    try {
      f(resource)
    } finally {
      resource.close()
    }
}
