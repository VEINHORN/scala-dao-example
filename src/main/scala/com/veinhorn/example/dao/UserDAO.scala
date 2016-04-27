package com.veinhorn.example.dao

import com.veinhorn.example.HibernateHolder
import com.veinhorn.example.entities.User
import scala.collection.JavaConverters._

/**
  * Created by veinhorn on 27.4.16.
  */
class UserDAO extends DAO[User] {


  override def getAll: Option[Seq[User]] = HibernateHolder.getSessionFactory match {
    case Some(sessionFactory) =>
      val session = sessionFactory.openSession()
      val users = toScalaSeq(session.createCriteria(new User().getClass).list())
      session.close()
      Some(users)
    case None =>
      None
  }

  private def toScalaSeq(list: java.util.List[_]): Seq[User] = {
    list.asScala.asInstanceOf[Seq[User]]
  }

}
