package com.veinhorn.example.entities

import java.util.Date
import javax.persistence._

import org.hibernate.annotations.GenericGenerator

/**
  * Created by veinhorn on 28.4.16.
  */

@Entity
@Table(schema = "example-db", name = "User")
class Order {

  @Id
  @GenericGenerator(name = "gen", strategy = "increment")
  @GeneratedValue(generator = "gen")
  @Column(name = "idOrder")
  var idOrder: Int = _

  @Column(name = "User_idUser")
  var idUser: Int = _

  @Column(name = "orderDate")
  var orderDate: Date = _
}
