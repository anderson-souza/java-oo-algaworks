package com.algaworks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

import com.algaworks.model.Pessoa;

public class DeserializandoObjeto {

	public static void main(String[] args) {

		try (ObjectInput in = new ObjectInputStream(new FileInputStream("joao.obj"))) {
			try {
				Pessoa p = (Pessoa) in.readObject();
				System.out.println("Nome: " + p.getNome());
				System.out.println("Idade: " + p.getIdade());
				System.out.println("Profissão: " + p.getProfissao());
			} catch (ClassNotFoundException e) {
				System.err.println("Não foi possível encontrar a classe Pessoa");
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.err.println("Não foi possível encontrar o arquivo");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
