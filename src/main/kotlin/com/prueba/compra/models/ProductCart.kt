package com.prueba.compra.models

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.*


@Entity
@Table(name="productcars")
data class ProductCart ( val quantity:Long ){
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id:Long?=null

    @ManyToOne
    @JoinColumn(name = "product_id")
    @JsonIgnoreProperties
    var product: Products? = null

    @ManyToOne
    @JoinColumn(name = "cart_id")
    @JsonIgnoreProperties
    var carts: Carts? = null


}