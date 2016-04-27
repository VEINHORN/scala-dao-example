package com.veinhorn.example

import com.veinhorn.example.dao.UserDAO

object Main extends App {
  HibernateHolder.init()

  val users = new UserDAO().getAll

  println("hi")
}
