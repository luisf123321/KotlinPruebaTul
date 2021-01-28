package com.prueba.compra.controller

import com.prueba.compra.dao.CartRepository
import com.prueba.compra.models.Carts
import com.prueba.compra.utils.Constant
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import java.util.*


@RestController
@RequestMapping(Constant.URL_CARTS)
class CartController(val cartRepository: CartRepository) {

    @GetMapping("")
    fun list():List<Carts>{
        return cartRepository!!.findAll()
    }

    @GetMapping("/{id}")
    fun buscar(@PathVariable ("id") idCarts:Long): Optional<Carts>{
        return cartRepository!!.findById(idCarts)
    }

    @PostMapping("")
    fun guardar(@RequestBody carts: Carts):Carts{
        cartRepository!!.save(carts)
        return carts
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun eliminar(@PathVariable ("id") idCarts: Long){
        cartRepository!!.deleteById(idCarts)
    }

    @PutMapping("")
    @ResponseStatus(HttpStatus.OK)
    fun actualizar(@RequestBody carts: Carts){
        cartRepository!!.save(carts)

    }
}