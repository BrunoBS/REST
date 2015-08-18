package br.com.brunobs.modelo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.brunobs.framework.annotations.ExecuteFetch;
import br.com.brunobs.loja.dao.ParoquiaFactory;
import br.com.brunobs.rest.modelo.Paroquia;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class ProfilingTest {
	private final Logger log = LoggerFactory.getLogger(ProfilingTest.class);

	@Autowired
	private ParoquiaFactory f;

	@Test
	@ExecuteFetch
	public void testProfiling() {
		List<Paroquia> paroquias = this.f.criar();
	}

}
