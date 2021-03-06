package nz.daved.elysium.core

import scala.collection.mutable.ArrayBuffer

case class RenamingTestObject(var numbers: ArrayBuffer[Int] = new ArrayBuffer()) {

  @operator("+|")
  def prepend(i: Int): Unit = numbers.prepend(i)

  @alias("add")
  def append(i: Int): Unit = numbers.append(i)

  @operator("++")
  def combine(is: Seq[Int]): ArrayBuffer[Int] = numbers ++= is

  @negate("nonEmpty")
  def isEmpty: Boolean = numbers.isEmpty

}
