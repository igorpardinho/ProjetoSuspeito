package org.suspeito;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Suspeito {

	public static void main(String[] args) {
		List<String> perguntas = new ArrayList<>();

		System.out.println();

		Scanner sc = new Scanner(System.in);

		System.out.println("Responda com 'sim' ou 'nao' : ");

		System.out.println("Telefonou para vitima? ");
		String resposta = sc.nextLine().toLowerCase();
		perguntas.add(resposta);

		System.out.println("Esteve no local do crime? ");
		String resposta2 = sc.nextLine().toLowerCase();
		perguntas.add(resposta2);

		System.out.println("Mora perto da vitima? ");
		String resposta3 = sc.nextLine().toLowerCase();
		perguntas.add(resposta3);

		System.out.println("Devia para vitima? ");
		String resposta4 = sc.nextLine().toLowerCase();
		perguntas.add(resposta4);

		System.out.println("Já trabalhou com a vitima? ");
		String resposta5 = sc.nextLine().toLowerCase();
		perguntas.add(resposta5);

		sc.close();
		
		Iterator<String> iterator = perguntas.iterator();
		int count = 0;
		while (iterator.hasNext()) {
			if (iterator.next().contains("s")) {
				count++;
			}
		}
		switch (count) {
		case 1:
			System.out.println("Inocente");
			break;
		case 2:
			System.out.println("Suspeito");
			break;
		case 3:
		case 4:
			System.out.println("Cumplice");
			break;
		case 5:
			System.out.println("Assasino");

		}
	}

}
