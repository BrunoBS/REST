package br.com.brunobs.loja.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import br.com.brunobs.loja.dao.ParoquiaFactory;
import br.com.brunobs.loja.framework.FetchService;
import br.com.brunobs.loja.modelo.Paroquia;

@Path("paroquias")
@Consumes({ "text/xml", "application/json" })
@Produces({ "text/xml", "application/json" })
public class ParoquiaResource {

	@GET
	public List<Paroquia> busca() throws Exception {
		List<Paroquia> paroquias = ParoquiaFactory.criar();
		FetchService.execute(paroquias);
		return paroquias;
	}

	@GET
	@Path("{id}/limit/{limit}")
	public Response busca(@PathParam("id") long id, @PathParam("limit") int limit) throws Exception {
		List<Paroquia> paroquias = ParoquiaFactory.criar();
		Paroquia p = paroquias.get(0);
		FetchService.execute(p, limit);

		Response resposta = Response.ok(p).build();
		Response.serverError();
		return resposta;
	}
}
