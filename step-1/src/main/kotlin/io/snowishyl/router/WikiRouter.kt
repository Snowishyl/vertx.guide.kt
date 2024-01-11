package io.snowishyl.router

import io.vertx.core.Promise
import io.vertx.core.Vertx
import io.vertx.ext.jdbc.JDBCClient
import io.vertx.ext.web.Router
import io.vertx.ext.web.RoutingContext

class WikiRouter {

    fun createRouter(vertx: Vertx, router: Router) {
        val promise = Promise.promise<Void>()
        router.get("/").handler()

    }

    fun indexHandler(ctx: RoutingContext, dbClient: JDBCClient) {


    }
}