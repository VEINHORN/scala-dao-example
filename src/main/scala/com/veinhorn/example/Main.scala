package com.veinhorn.example

import com.veinhorn.example.dao.impl.OrderDAOImpl
import com.veinhorn.example.dao.{DAO, OrderDAO, UserDAO}
import com.veinhorn.example.entities.User

object Main extends App {
  HibernateHolder.init()
  val userDAO: DAO[User] = new UserDAO()
  val orderDAO: OrderDAO = new OrderDAOImpl()

  val orders = orderDAO.findOrdersByUserId(new User(2))

  println("hi")
}
