package com.prueba.compra.models

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.*


@Entity
@Table(name="carts")
data class Carts (val status:String?="") {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id:Long?=null



}