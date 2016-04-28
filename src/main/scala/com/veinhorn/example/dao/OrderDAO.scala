package com.veinhorn.example.dao

import com.veinhorn.example.entities.{User, Order}

/**
  * Created by veinhorn on 28.4.16.
  */
trait OrderDAO {
  def findOrdersByUserId(user: User): Option[Seq[Order]]
}
