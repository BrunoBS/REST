package br.com.brunobs.loja;

import org.junit.Test;

public class ClienteTest {

	// @Before
	// public void iniciaServidor() {
	// this.server = Servidor.IniciarServidor();
	// ClientConfig confi = new ClientConfig();
	// confi.register(new LoggingFilter());
	// this.cliente = ClientBuilder.newClient(confi);
	// this.target = this.cliente.target("http://localhost:7070");
	//
	// }
	//
	// @After
	// public void paraServidor() {
	// this.server.stop();
	// }

	// @Test
	// public void testeQueBuscaUmCarinhoEsperado() {
	// String conteudo =
	// this.target.path("/carrinhos/1").request().get(String.class);
	// Carrinho carrinho = (Carrinho) new XStream().fromXML(conteudo);
	// Assert.assertEquals(carrinho.getRua(), "Rua Vergueiro 3185, 8 andar");
	//
	// }
	//
	// @Test
	// public void testaQueAConexaoComOServidorFunciona() throws Exception {
	// Client client = ClientBuilder.newClient();
	// WebTarget target = client.target("http://www.mocky.io");
	// String conteudo =
	// target.path("/v2/52aaf5deee7ba8c70329fb7d").request().get(String.class);
	// Assert.assertTrue(conteudo.contains("<rua>Rua Vergueiro 3185"));
	//
	// }
	//
	// @Test
	// public void testeQueBuscaUmProjeto() {
	// String conteudo =
	// this.target.path("/projetos/1").request().get(String.class);
	// Projeto projeto = (Projeto) new XStream().fromXML(conteudo);
	// Assert.assertEquals(projeto.getNome(), "Rua Vergueiro 3185, 8 andar");
	//
	// }

	@Test
	public void a() throws Exception {
		String a = "paroquias/{id}/grupos";
		int b = a.indexOf("1");
		int c = a.indexOf("}");
		if (b == -1 || c == -1) {
			throw new Exception("recurso incorreto!");
		}
		System.err.println(b);
		System.err.println(c);
		String primeira = a.substring(0, b);
		String segunda = a.substring(++c, a.length());
		System.err.println(primeira + "01" + segunda);

	}

}
