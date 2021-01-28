package com.prueba.compra.models

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.*


@Entity
@Table(name="products")
data class Products (val nombre:String?="",val sku:String?="",val descripcion:String?="") {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null





}