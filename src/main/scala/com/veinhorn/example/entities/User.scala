package com.veinhorn.example.entities

import javax.persistence.{Table, Column, Id, Entity}

/**
  * Created by veinhorn on 27.4.16.
  */

@Entity
@Table(schema = "example-db", name = "User")
class User {
  @Id
  @Column(name = "idUser")
  var idUser: Int = _
}
