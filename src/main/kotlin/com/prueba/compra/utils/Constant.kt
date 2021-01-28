package com.prueba.compra.utils

class Constant {

    companion object{

        private const val URL_API_BASE = "/api"
        private const val URL_API_VERSION="/v1"
        private const val URL_BASE = URL_API_BASE+ URL_API_VERSION

        const val URL_PRODUCTS ="$URL_BASE/products"
        const val URL_CARTS ="$URL_BASE/carts"
        const val URL_PRODUCTCARTS = "$URL_BASE/productcarts"

    }
}