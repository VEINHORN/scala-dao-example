package com.veinhorn.example.dao

/**
  * Created by veinhorn on 27.4.16.
  */
trait DAO[T] {
  def getAll(): Option[Seq[T]]
  def create(entity: T): Option[T]
  def findById(entity: T): Option[T]
  //def delete(entity: T): Option[T]
  //def update(entity: T): Option[T]
}
