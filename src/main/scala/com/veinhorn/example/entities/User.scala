package com.veinhorn.example.entities

import java.util.Date
import javax.persistence._

import org.hibernate.annotations.GenericGenerator

/**
  * Created by veinhorn on 27.4.16.
  */

@Entity
@Table(schema = "example-db", name = "User")
class User {

  @Id
  @GenericGenerator(name = "gen", strategy = "increment")
  @GeneratedValue(generator = "gen")
  @Column(name = "idUser", unique = true)
  var idUser: Int = _

  @Column(name = "email")
  var email: String = _

  @Column(name = "username")
  var username: String = _

  @Column(name = "created")
  var created: Date = _
}
