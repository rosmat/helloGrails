package grailsapp

import com.mycompany.Service
import grails.util.Environment

class ProductsController {

    static scope = 'singleton'


    public def index() {
        [products: Service.getProducts(params.n.toInteger())]
    }

    public def env() {
        render Environment.getCurrent().getName()
    }
}
