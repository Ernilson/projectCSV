package br.com.teste.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.teste.Model.Produto;

public class Leitor4 {

	public static void main(String[] args) {		
		
		String path = "C:\\Users\\ernil.LAPTOP-FID40H3U\\OneDrive\\Documentos\\adt.txt";
		
		List<Produto> list = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			line = br.readLine();
			while (line != null) {
				String[] vect = line.split(",");
				String descricao = vect[0];
				Double preco = Double.parseDouble(vect[1]);
				Integer qtd = Integer.parseInt(vect[2]);
				
				Produto prod = new Produto(null, descricao, preco, qtd);
								
				list.add(prod);
				
				line = br.readLine();
			}
			
			System.out.println("Produto: ");
			for (Produto produto : list) {
				System.out.println(produto);
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}


	}


