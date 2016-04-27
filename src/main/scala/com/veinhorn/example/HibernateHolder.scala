package com.veinhorn.example

import org.hibernate.SessionFactory
import org.hibernate.cfg.Configuration

/**
  * Created by veinhorn on 26.4.16.
  */
object HibernateHolder {

  private var sessionFactory: Option[SessionFactory] = None

  def init() = sessionFactory match {
    case None => sessionFactory = Some(new Configuration().configure().buildSessionFactory())
    case _ => sessionFactory = None
  }

  def getSessionFactory: Option[SessionFactory] = sessionFactory

}
