package com.veinhorn.example.dao.impl

import com.veinhorn.example.dao.{OrderDAO, DAOExecutor}
import com.veinhorn.example.entities.{User, Order}

/**
  * Created by veinhorn on 28.4.16.
  */
class OrderDAOImpl extends DAOExecutor[Order] with OrderDAO {

  def findOrdersByUserId(user: User): Option[Seq[Order]] = {
    executeWithSession[Seq[Order]] { session =>
      val orders = toScalaSeq(session.createQuery(s"FROM Order WHERE User_idUser = ${ user.idUser }").list())
      orders.nonEmpty match {
        case true =>
          Some(orders)
        case false =>
          None
      }
    }
  }

}
