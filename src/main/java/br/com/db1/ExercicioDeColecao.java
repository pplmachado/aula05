package br.com.db1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExercicioDeColecao {

	public static void main(String[] args) {
		exercicio1();
		exercicio2();
		exercicio3();
		exercicio4();
		exercicio5();
		exercicio6();
		exercicio7();
//		exercicio8();
//		exercicio9();
		
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
        
        String a;
        Scanner obj = new Scanner(System.in);
        System.out.println("\nDigite os nomes:");
        a = obj.nextLine();
        System.out.println("Essa é a lista com os nomes ordenados:" + a);
//        Collections.sort(obj, Collections.reverseOrder());
//	       
//	       System.out.println("Lista em ordem decrescente:");
//	       for(String str: obj){
//	    	   System.out.println(str);
	}

	public static Scanner exercicio1() {
		new ArrayList<String>();
		System.out.println("Exercício 01:");
		
		String a;
        Scanner obj = new Scanner(System.in);
        
        System.out.println("\nDigite os nomes das cores que você mais gosta:");
        a = obj.nextLine();
       
        System.out.println("Essa é a lista com os nomes de cores digitadas:" + a);
		return obj;
	}
	
	public static Integer exercicio2() {
		System.out.println("Exercício 02:");
		
		ArrayList<String> nomes = new ArrayList<String>();
		System.out.println("Lista:");
		nomes.add("Patrícia");
		nomes.add("Lucas");
		System.out.println(nomes);

		System.out.println("Quantidade de itens da lista:");
		System.out.println(nomes.size());
		return nomes.size();
	}

	public static ArrayList<String> exercicio3() {
		System.out.println("Exercício 03:");
		
		ArrayList<String> nomes = new ArrayList<String>();
		System.out.println("Nome dos meus parentes:");
		nomes.add("francisco");
		nomes.add("sônia");
		nomes.add("fábio");
		nomes.add("fernando");
		System.out.println(nomes);
		
		  System.out.println("Lista dos meus parentes antes de remoção:");
	       for(String var: nomes){
	            System.out.println(var);
	       }
	       
	       //Removing 1st element
	       nomes.remove(0);
	       //Removing 2element from the remaining list
	       nomes.remove(0);
	      
	       System.out.println("Lista dos meus parentes depois da remoção dos nomes dos meus pais:");
	       for(String var2: nomes){
	             System.out.println(var2);
	       }
	       
		return nomes;
	}
	
	public static ArrayList<String> exercicio4() {
		System.out.println("Exercício 04:");
		
		ArrayList<String> cidades = new ArrayList<String>();
		System.out.println("Nome de 3 cidades do estado em que nasci:");
		cidades.add("Maringá");
		cidades.add("Curitiba");
		cidades.add("Londrina");
		
		System.out.println(cidades);
		
		cidades.remove(1);
		
		System.out.println("Removida a cidade de segunda posição:");
		System.out.println(cidades);
		return cidades;
	}
	
	public static Scanner exercicio5() {
//		preciso deixar de forma ordenada
		new ArrayList<String>();
		System.out.println("Exercício 05:");
		
		String a;
        Scanner obj = new Scanner(System.in);
        
        System.out.println("\nDigite os nomes das cores que você mais gosta:");
        a = obj.nextLine();
       
        System.out.println("Essa é a lista com os nomes de cores digitadas:" + a);
		return obj;
	}
	
	public static Scanner exercicio6() {
//		preciso remover a cor que mais gosto
		new ArrayList<String>();
		System.out.println("Exercício 06:");
		
		String a;
        Scanner obj = new Scanner(System.in);
        
        System.out.println("\nDigite os nomes das cores que você mais gosta:");
        a = obj.nextLine();
       
        System.out.println("Essa é a lista com os nomes de cores digitadas:" + a);
		return obj;
	}
	
	public static ArrayList<String> exercicio7() {
		System.out.println("Exercício 07:");
		
		ArrayList<String> nomes = new ArrayList<String>();
		System.out.println("Nome dos meus parentes:");
		nomes.add("francisco");
		nomes.add("sônia");
		nomes.add("fábio");
		nomes.add("fernando");
		System.out.println(nomes);
		
		Collections.sort(nomes, Collections.reverseOrder());
	       
        System.out.println("Lista dos meus parentes em ordem decrescente:");
        for(String str: nomes){
    	   System.out.println(str);
        }
        return nomes;
	}    
}
