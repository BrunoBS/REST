package br.com.brunobs.rest;

import java.io.IOException;
import java.net.URI;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration("classpath:applicationContext.xml")
public class Servidor {

	public static void main(String[] args) throws IOException {
		HttpServer server = IniciarServidor();
		System.out.print("Servidor Rodando");
		System.in.read();
		server.stop();
	}

	static HttpServer IniciarServidor() {
		ResourceConfig config = new ResourceConfig().packages("br.com.brunobs.rest.resource");

		URI uri = URI.create("http://localhost:7070/");

		HttpServer server = GrizzlyHttpServerFactory.createHttpServer(uri, config);
		return server;
	}
}
