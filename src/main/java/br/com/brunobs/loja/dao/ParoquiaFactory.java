package br.com.brunobs.loja.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.brunobs.loja.modelo.Bairro;
import br.com.brunobs.loja.modelo.Cidade;
import br.com.brunobs.loja.modelo.Encontrista;
import br.com.brunobs.loja.modelo.Grupo;
import br.com.brunobs.loja.modelo.Paroquia;

public abstract class ParoquiaFactory {
	private static long quantidadeRegistro = 2;

	public static List<Paroquia> criar() {
		List<Paroquia> paroquias = new ArrayList<Paroquia>();
		for (int i = 0; i < quantidadeRegistro; i++) {
			//
			Cidade cidade = new Cidade("CIDADE" + i);
			for (int b = 0; b < quantidadeRegistro; b++) {
				cidade.addBairros(new Bairro("Bairro_" + i));
			}
			Paroquia paroquia = new Paroquia("PAROQUIA " + i, cidade);
			paroquia.setId(i + 1l);

			for (int j = 0; j < 100; j++) {
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
