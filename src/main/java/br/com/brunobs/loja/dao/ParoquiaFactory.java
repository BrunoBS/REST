package br.com.brunobs.loja.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.brunobs.rest.modelo.Encontrista;
import br.com.brunobs.rest.modelo.Grupo;
import br.com.brunobs.rest.modelo.Paroquia;

@Component
public class ParoquiaFactory {
	private static long quantidadeRegistro = 2;

	public List<Paroquia> criar() {
		List<Paroquia> paroquias = new ArrayList<Paroquia>();
		for (int i = 0; i < quantidadeRegistro; i++) {
			Paroquia paroquia = new Paroquia("PAROQUIA ");
			paroquia.setId(i + 1l);

			for (int j = 0; j < quantidadeRegistro; j++) {
				Grupo grupo = new Grupo("GRUPO " + j);
				paroquia.addGrupo(grupo);

				for (int k = 0; k < quantidadeRegistro; k++) {
					Encontrista encontrista = new Encontrista("ENCONTRISTA_" + k, "ENCONTRISTA_" + k + "@EMAIL.COM");
					grupo.addEncontrista(encontrista);
				}
			}
			paroquias.add(paroquia);

		}
		return paroquias;
	}

}
