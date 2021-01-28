package com.prueba.compra.controller

import com.prueba.compra.dao.ProductoRepository
import com.prueba.compra.models.Products
import com.prueba.compra.utils.BusException
import com.prueba.compra.utils.Constant
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*


@RestController
@RequestMapping(Constant.URL_PRODUCTS)
class ProductController(val productoRepository:ProductoRepository) {

    @GetMapping("")
    fun list(): ResponseEntity<List<Products>>{
        productoRepository!!.findAll()
        return try{
            ResponseEntity(productoRepository!!.findAll(),HttpStatus.OK)
        }catch (e:Exception){
            ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }

    @GetMapping("/{id}")
    fun buscar(@PathVariable ("id") idProducto: Long): ResponseEntity<Optional<Products>>{
        return try {
            ResponseEntity(productoRepository!!.findById(idProducto),HttpStatus.OK)
        }catch (e:Exception){
            ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }

    @GetMapping("/sku/{sku}")
    fun buscarSku(@PathVariable ("sku") skuProducts: String): ResponseEntity<Products>{
        return try {
            ResponseEntity(productoRepository!!.findBySku(skuProducts),HttpStatus.OK)
        }catch (e:Exception){
            ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }

    @PostMapping("")
    fun guardar (@RequestBody products : Products): ResponseEntity <Products>{

        return try{
            productoRepository!!.save(products)
            ResponseEntity(products,HttpStatus.OK)
        }catch (e:Exception){
            ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun eliminar (@PathVariable ("id") idProducto:Long){
        productoRepository!!.deleteById(idProducto)
    }

    @PutMapping("")
    fun actualizar(@RequestBody products: Products): ResponseEntity<Products> {
        productoRepository!!.save(products)
        return try {
            productoRepository!!.save(products)
            ResponseEntity(products,HttpStatus.OK)
        }catch (e:Exception){
            ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }



}