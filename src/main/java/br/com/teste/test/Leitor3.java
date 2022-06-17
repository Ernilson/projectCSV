package br.com.teste.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Leitor3 {

	public static void main(String[] args) {

		String path = "C:\\Users\\edaniel\\Documents\\Projetos\\relatorio.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}