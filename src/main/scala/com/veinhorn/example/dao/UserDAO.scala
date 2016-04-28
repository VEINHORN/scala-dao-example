package com.veinhorn.example.dao

import com.mysql.cj.api.Session
import com.veinhorn.example.entities.User



/**
  * Created by veinhorn on 27.4.16.
  */
class UserDAO extends DAOExecutor with DAO[User] {

  override def getAll(): Option[Seq[User]] = {
    executeWithSession[Seq[User]] { session =>
      val users = session.createCriteria(classOf[User]).list()
      Some(toScalaSeq(users))
    }
  }

  override def create(user: User): Option[User] = {
    executeWithTransaction[User] { session =>
      session.save(user)
      Some(user)
    }
  }
}
