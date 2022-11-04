package com.omar.matriz;

public class App {

	public static void main(String[] args) {
		
		Integer fila = 4;
		Integer columna = 5;
		Integer counter = 1;
		
		Integer [][] matriz = new Integer[fila][columna];
		
		for (Integer i = 0; i<fila; i++) {
			for (Integer j=0; j<columna; j++) {
				matriz[i][j]=counter;
				counter ++;
			}
		}
		
		System.out.println("Matriz Por Filas");
		
		System.out.println("**********************");
		
		
		for (Integer i = 0; i<fila; i++) {
			for (Integer j=0; j<columna; j++) {
				System.out.printf("%-5s", matriz[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("**********************");
		
		System.out.println("");
		
		System.out.println("Matriz Por Columnas");
		
		System.out.println("**********************");
		
		for (Integer i = 0; i<columna; i++) {
			for (Integer j=0; j<fila; j++) {
				System.out.printf("%-6s", matriz[j][i]);
			}
			System.out.println();
		}
		
		System.out.println("**********************");

	}

}
