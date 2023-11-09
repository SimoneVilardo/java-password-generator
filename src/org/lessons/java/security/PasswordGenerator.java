package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String strName = in.nextLine();
		
		System.out.print("Cognome: ");
		String strSurname = in.nextLine();
		
		System.out.print("Colore Preferito: ");
		String strColor = in.nextLine();
		
		System.out.print("Giorno Di Nascita: ");
		String strBirthday = in.nextLine();
		int intBirthday = Integer.valueOf(strBirthday);
		
		System.out.print("Mese Di Nascita: ");
		String strMonth = in.nextLine();
		int intMonth = Integer.valueOf(strMonth);
		
		
		System.out.print("Anno Di Nascita: ");
		String strYear = in.nextLine();
		int intYear = Integer.valueOf(strYear);
		
		in.close();
		
		int sum = intBirthday + intMonth + intYear;
		
		System.out.println("La tua password è:" + strName + "-" + strSurname + "-" + strColor +"-" + sum);
		
	}

}
