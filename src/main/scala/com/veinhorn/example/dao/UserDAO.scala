package com.veinhorn.example.dao

import com.veinhorn.example.entities.User



/**
  * Created by veinhorn on 27.4.16.
  */
class UserDAO extends DAOExecutor[User] with DAO[User] {

  override def getAll(): Option[Seq[User]] = {
    executeWithSession[Seq[User]] { session =>
      val users = toScalaSeq(session.createCriteria(classOf[User]).list())
      users.nonEmpty match {
        case true => Some(users)
        case false => None
      }
    }
  }

  override def create(user: User): Option[User] = {
    executeWithTransaction[User] { session =>
      session.save(user)
      Some(user)
    }
  }

  override def findById(user: User): Option[User] = {
    executeWithSession[User] { session =>
      session.get(classOf[User], user.idUser) match {
        case user: User => Some(user)
        case null => None
      }
    }
  }

}
