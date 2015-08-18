package br.com.brunobs.rest.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.brunobs.framework.annotations.ExecuteFetch;
import br.com.brunobs.loja.dao.ParoquiaFactory;
import br.com.brunobs.rest.modelo.Paroquia;

@Path("paroquias")
@Component
public class ParoquiaResource {

	@Autowired
	private ParoquiaFactory f;

	@GET
	@ExecuteFetch
	@Produces(MediaType.APPLICATION_XML)
	public List<Paroquia> busca() throws Exception {
		List<Paroquia> paroquias = this.f.criar();
		return paroquias;
	}

	@GET
	@Path("{id}/limit/{limit}")
	@Produces(MediaType.APPLICATION_XML)
	@ExecuteFetch
	public Paroquia busca(@PathParam("id") long id, @PathParam("limit") int limit) throws Exception {
		List<Paroquia> paroquias = this.f.criar();
		return paroquias.get(0);
	}
}
