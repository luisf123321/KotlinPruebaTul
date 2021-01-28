package com.prueba.compra.dao

import com.prueba.compra.models.ProductCart
import org.springframework.data.jpa.repository.JpaRepository

interface ProductCartRepository: JpaRepository<ProductCart,Long> {


}