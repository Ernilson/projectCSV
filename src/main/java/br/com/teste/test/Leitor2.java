package br.com.teste.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Leitor2 {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\edaniel\\Documents\\Projetos\\relatorio.txt";
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
		} catch (IOException e) {
			System.out.println("Erro: "+ e.getMessage());
		}

	}

}
