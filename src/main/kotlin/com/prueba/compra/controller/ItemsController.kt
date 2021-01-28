package com.prueba.compra.controller

import com.prueba.compra.dao.ProductoRepository
import com.prueba.compra.models.Products
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*
import javax.servlet.http.HttpServletRequest
import javax.swing.text.html.parser.Entity
import kotlin.collections.ArrayList

@RestController
@RequestMapping("/add")
class ItemsController (val productoRepository: ProductoRepository,val productController: ProductController) {


    @GetMapping("/{id}")
    fun items(@PathVariable ("id") id:Long,s:HttpServletRequest): ResponseEntity<Optional<Products>> {
        val arrayList : ArrayList<Products>

        return try{
            ResponseEntity(productoRepository!!.findById(id),HttpStatus.OK)
            //ResponseEntity(,HttpStatus.OK)
        }catch (e:Exception){
            ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR)
        }

    }


}