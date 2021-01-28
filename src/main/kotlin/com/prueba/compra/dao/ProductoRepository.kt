package com.prueba.compra.dao

import com.prueba.compra.models.Products
import org.springframework.data.jpa.repository.JpaRepository

interface ProductoRepository: JpaRepository<Products,Long> {

    fun findBySku(sku : String): Products
}