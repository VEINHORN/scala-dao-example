package com.veinhorn.example

import java.util.Date

import com.veinhorn.example.dao.UserDAO
import com.veinhorn.example.entities.User

object Main extends App {
  HibernateHolder.init()

  val userDao = new UserDAO()
  val users = userDao.getAll()

  val user = new User()
  user.email = "test3@mail.ru"
  user.username = "gogen3"
  user.created = new Date()
  val user2 = userDao.create(user)

  println("hi")
}
