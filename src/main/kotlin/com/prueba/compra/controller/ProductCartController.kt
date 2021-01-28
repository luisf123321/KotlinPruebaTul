package com.prueba.compra.controller

import com.prueba.compra.dao.ProductCartRepository
import com.prueba.compra.models.ProductCart
import com.prueba.compra.utils.Constant
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import java.util.*


@RestController
@RequestMapping(Constant.URL_PRODUCTCARTS)
class ProductCartController(val productCartRepository: ProductCartRepository) {

    @GetMapping("")
    fun list():List<ProductCart>{
        return productCartRepository!!.findAll()
    }

    @GetMapping("/{id}")
    fun buscar(@PathVariable ("id") idProductCart: Long):Optional<ProductCart>{
        return productCartRepository!!.findById(idProductCart)

    }

    @PostMapping("")
    fun guardar(@RequestBody productCart: ProductCart): ProductCart{
        productCartRepository!!.save(productCart)
        return productCart
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun eliminar(@PathVariable ( "id") idProductCart: Long){
        productCartRepository!!.deleteById(idProductCart)
    }

    @PutMapping("")
    @ResponseStatus(HttpStatus.OK)
    fun actualizar (@RequestBody productCart: ProductCart){
        productCartRepository.save(productCart)

    }





}