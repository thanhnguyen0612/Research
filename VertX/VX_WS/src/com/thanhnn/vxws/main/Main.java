package com.thanhnn.vxws.main;

import com.thanhnn.vxws.util.DeloyUtil;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;

public class Main extends AbstractVerticle {
	public static void main(String[] args) {
		DeloyUtil.deploySingleVerticle("com.thanhnn.vxws.main.Main");
	
	}
	//test git
	public void start(Future<Void> startFuture) {
		vertx.createHttpServer()
			 .requestHandler(r -> {
				 r.response().end("<h1>Hello from my first " +
			              "Vert.x 3 application</h1>");
			 })
			 .listen(8081, result -> {
				 if (result.succeeded()) {
					startFuture.complete();
				 } else {
					 startFuture.fail(result.cause());
				 }
			 });
	}
	
	public void stop(Future<Void> stopFuture) {
		
	}
} 



