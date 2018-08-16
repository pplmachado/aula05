package br.com.db1;

import java.util.ArrayList;
import java.util.Collections;

public class ExercicioDeColecao {

	public static void main(String[] args) {
		exercicio2();
		exercicio1();
		exercicio3();
		exercicio4();
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.println("Números inteiros de 1 à 20:");
        for (int i=0; i<arr.length; i++ )
        {
                System.out.print(arr[i]+" ");
        }
        System.out.println("\nNúmeros  pares da lista:");
        for (int i = 0;i<arr.length ;i++ )
        {
                if (arr[i]%2 == 0)
                {
                        System.out.print(arr[i]+" ");
                }
        }
        System.out.println("\nNúmeros ímpares da lista:");
        for (int i = 0;i<arr.length ;i++ )
        {
                if (arr[i] % 2 != 0)
                {
                 System.out.print(arr[i]+" ");
                }
        }
	}

	public static Integer exercicio2() {
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Patrícia");
		nomes.add("Lucas");
		
		System.out.println(nomes.size());
		return nomes.size();
	}

	public static ArrayList<String> exercicio1() {
		ArrayList<String> cores = new ArrayList<String>();
		cores.add("purple");
		cores.add("pink");
		cores.add("cyan");
		
		System.out.println(cores);
		return cores;
	}
	
	public static ArrayList<String> exercicio3() {
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("francisco");
		nomes.add("sônia");
		nomes.add("fábio");
		nomes.add("fernando");
		
		  System.out.println("Lista antes de remoção:");
	       for(String var: nomes){
	            System.out.println(var);
	       }
	       
	       Collections.sort(nomes, Collections.reverseOrder());
	       
	       System.out.println("Lista em ordem decrescente:");
	       for(String str: nomes){
	    	   System.out.println(str);
	       }
	       
	       //Removing 1st element
	       nomes.remove(0);
	       //Removing 2element from the remaining list
	       nomes.remove(0);
	      
	       System.out.println("Lista depois da remoção:");
	       for(String var2: nomes){
	             System.out.println(var2);
	       }
	       
		return nomes;
	}
	
	public static ArrayList<String> exercicio4() {
		ArrayList<String> cidades = new ArrayList<String>();
		cidades.add("Maringá");
		cidades.add("Curitiba");
		cidades.add("Londrina");
		
		System.out.println(cidades);
		
		cidades.remove(1);
		
		System.out.println(cidades);
		return cidades;
	}
}
