package com.veinhorn.example.dao

/**
  * Created by veinhorn on 27.4.16.
  */
trait DAO[T] {
  def getAll: Option[Seq[T]]
}
