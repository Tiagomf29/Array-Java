package br.com.matrizes;

public class ArrayJava {

	public static void main(String[] args) {
		
		// Colchetes pode ser declarado antes da variável e caso o tamanho não seja definido pode ser inicializado as variáveis 
		int[]array1 = new int[] {1,2,3,5,40,80,90};
		
		// Colchetes pode ser declarado depois da variável e caso o tamanho não seja definido pode ser inicializado as variáveis
		int array2[] = new int[] {10,50,60,80,70};
		
		// Pode-se criar a matriz declarando os valores sem informar o operador new
		int array3[] = {20,50,90,80,70,30};
		
		// Pode-se criar a matriz declarando o tamnho do mesmo. Desta forma não é permitido a inicialização de valores no mesmo.
		int[] array4 = new int[10];
		
		
		for(int valores : array1) System.out.print(valores+" ");
		System.out.println("");
		
		for(int valores : array2) System.out.print(valores+" ");
		System.out.println("");
		
		for(int valores : array3) System.out.print(valores+" ");
		System.out.println("");
		
		for(int valores : array4) System.out.print(valores+" ");
		System.out.println("");		
				
		System.out.println("\nMatrizes multidimensionais\n");
		
		int[][]matriz1 = new int[][] {{1,2,8,9},{13,25,2,14,48}};
		int matriz2[][] = new int [][] {{31,32,83,92},{113,25,20,14,78}};
		int matriz3[][] = {{10,20,30},{50,80,70}};
		int matriz4[][] = new int [1][]; 
		
		
		for (int i = 0; i < matriz1.length; i++) 
		  for(int a = 0; a < matriz1[i].length; a++) 
		    System.out.print(matriz1[i][a]+" ");
		System.out.println("");
		
		for (int i = 0; i < matriz2.length; i++) 
	      for(int a = 0; a < matriz2[i].length; a++) 
		  	System.out.print(matriz2[i][a]+" ");
		System.out.println("");
			
		for (int i = 0; i < matriz3.length; i++) 
	      for(int a = 0; a < matriz3[i].length; a++) 
	    	System.out.print(matriz3[i][a]+" ");
		System.out.println("");	
		
		matriz4[0][0] = 15;
		
		// Erro pois não foi atribuido o tamanho da dimensão dois da matriz
		for (int i = 0; i < matriz4.length; i++) 
		  for(int a = 0; a < matriz4[i].length; a++) 
		    System.out.print(matriz4[i][a]+" ");
		System.out.println("");		
			
			
			
			
		
		
		

	}

}
