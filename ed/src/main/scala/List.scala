package br.unb.cic.ed

trait List {
  def size(): Int
  def insert(pos: Int, value: Int): Unit //Unit é o equivalente a void
  def elementAt(pos: Int): Option[Int]
  def find(value: Int): Option[Int]
  def delete(pos: Int) : Unit
}