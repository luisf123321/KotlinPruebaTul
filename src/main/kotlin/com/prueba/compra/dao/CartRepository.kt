package com.prueba.compra.dao

import com.prueba.compra.models.Carts
import org.springframework.data.jpa.repository.JpaRepository

interface CartRepository:JpaRepository<Carts,Long> {
}