/*
 */
import java.util.*;

public class ON2 {
	
	public static void main (String[] args) {
		
		// execução do método
		int tamanho = 50000;
		
		int[] X1 = new int [tamanho];
		int[] X2 = new int [tamanho];
		int[] X3 = new int [tamanho];
		int[] aux1 = new int[tamanho];
		int n, i, aux, j, eleito,menor, pos, cont;
		//Scanner entrada = new Scanner (System.in);
		
		//carregando os números do vetor
		for (i=0; i <= X1.length - 1 ; i++){

			//System.out.println("Digite o "+(i+1)+"o.numero: ");
			X1[i] = (int)(Math.random() * tamanho);
			X2[i] = X1[i];
			X3[i] = X2[i];
			//System.out.print(X1[i] + " - ");
		}
		
		//System.out.println("");
		
		double tempoInicial = System.currentTimeMillis();
		
		
		//ordenando de forma crescente
		//laço com a quantidade de elementos do vetor
		for (n=1; n <= X1.length; n++) {
				//laço que percorre da 1a a penultima
				//posição do vetor
				for (i=0; i<=X1.length-2; i++){
					if (X1[i] > X1[i+1]){
						aux = X1[i];
						X1[i] = X1[i+1];
						X1[i+1] = aux;
					}
				}
		}
		
		double tempoFinal = System.currentTimeMillis();
		
		//mostrando o vetor ordenado
		//for (i=0; i<=X.length-1;i++) {
		//	System.out.println((i+1)+"o. numero: "+X[i]);
		//}
		
		System.out.println("\nO metodo BUBBLE ordenou em " + (tempoFinal - tempoInicial) + " milissegundos");
		
		n = i = aux = j = eleito = menor = pos = 0;
		tempoInicial = System.currentTimeMillis();
		for (i=1 ; i<=X2.length-1; i++){
				eleito = X2[i];
				j =i -1;
				//laço que percorre os elementos a esquerda do nr. 
				//eleito ou até encontrar a posição para recolocação
				//no número eleito respeitando a ordenação procurada
				while (j>=0 && X2[j] > eleito){
						X2[j+1] = X2[j];
						j = j-1;
				}
				X2[j+1] = eleito;
		}
		tempoFinal = System.currentTimeMillis();
		System.out.println("\nO metodo INSERT ordenou em " + (tempoFinal - tempoInicial) + " milissegundos");
		
		n = i = aux = j = eleito = menor = pos = 0;
		tempoInicial = System.currentTimeMillis();
		for(i=0;i<=X3.length-2;i++){
			eleito = X3[i];
			//encontrando o menor nr a direita do eleito com sua
			//respectiva posição
			//posição do eleito = 1
			//1o nr a direita do eleito na posicao = i + 1
			menor = X3[i+1];
			pos = i +1;
			//laço que percorre os elementos que estão a direita do 
			//nr eleito, retornando o menor nr a direita e sua posição
			for (j=i+2;j<=X3.length-1;j++){
				if (X3[j] < menor){
					menor = X3[j];
					pos = j;
				}	
			}
			//troca do nr eleito com o nr da posição pos
			//o nr da posição pos é o menor nr à direita do nr eleito
			if(menor< eleito){
				X3[i] = X3[pos];
				X3[pos] = eleito;
			}
		}
		tempoFinal = System.currentTimeMillis();
		System.out.println("\nO metodo SELECTION ordenou em " + (tempoFinal - tempoInicial) + " milissegundos");


		/*VETORES JA ORDENADOS*/

		//BUBBLE
		tempoInicial = System.currentTimeMillis();
		//ordenando de forma crescente
		//laço com a quantidade de elementos do vetor
		for (n=1; n <= X1.length; n++) {
				//laço que percorre da 1a a penultima
				//posição do vetor
				for (i=0; i<=X1.length-2; i++){
					if (X1[i] > X1[i+1]){
						aux = X1[i];
						X1[i] = X1[i+1];
						X1[i+1] = aux;
					}
				}
		}
		
		tempoFinal = System.currentTimeMillis();
		//mostrando o vetor ordenado
		//for (i=0; i<=X.length-1;i++) {
		//	System.out.println((i+1)+"o. numero: "+X[i]);
		//}
		
		System.out.println("\nO metodo BUBBLE varreu o vetor JA ORDENADO em " + (tempoFinal - tempoInicial) + " milissegundos");
		
		//INSERT
		n = i = aux = j = eleito = menor = pos = 0;
		tempoInicial = System.currentTimeMillis();
		for (i=1 ; i<=X2.length-1; i++){
				eleito = X2[i];
				j =i -1;
				//laço que percorre os elementos a esquerda do nr. 
				//eleito ou até encontrar a posição para recolocação
				//no número eleito respeitando a ordenação procurada
				while (j>=0 && X2[j] > eleito){
						X2[j+1] = X2[j];
						j = j-1;
				}
				X2[j+1] = eleito;
		}
		tempoFinal = System.currentTimeMillis();
		System.out.println("\nO metodo INSERT varreu o vetor JA ORDENADO em " + (tempoFinal - tempoInicial) + " milissegundos");
		
		//SELECTION
		n = i = aux = j = eleito = menor = pos = 0;
		tempoInicial = System.currentTimeMillis();
		for(i=0;i<=X3.length-2;i++){
			eleito = X3[i];
			//encontrando o menor nr a direita do eleito com sua
			//respectiva posição
			//posição do eleito = 1
			//1o nr a direita do eleito na posicao = i + 1
			menor = X3[i+1];
			pos = i +1;
			//laço que percorre os elementos que estão a direita do 
			//nr eleito, retornando o menor nr a direita e sua posição
			for (j=i+2;j<=X3.length-1;j++){
				if (X3[j] < menor){
					menor = X3[j];
					pos = j;
				}	
			}
			//troca do nr eleito com o nr da posição pos
			//o nr da posição pos é o menor nr à direita do nr eleito
			if(menor< eleito){
				X3[i] = X3[pos];
				X3[pos] = eleito;
			}
		}
		tempoFinal = System.currentTimeMillis();
		System.out.println("\nO metodo SELECTION varreu o vetor JA ORDENADO em " + (tempoFinal - tempoInicial) + " milissegundos");
		
		
		/*COLOCANDO OS DADOS EM ORDEM DECRESCENTE*/
		
		cont = 0;
		//1 5 9 11
		for( int a = 0 ; a <= X1.length - 1; a++){
			aux1[a] = X1[a];
		}
		
		//roda o arrays X1 X2 X3 de forma decrescente 
		for (int a = X1.length - 1; a >= 0 ; a--){
				X1[a] = aux1[cont]; //3 x 0 / 2 x 1 / 1 x 2 / 0 x 3
				X2[a] = aux1[cont];
				X3[a] = aux1[cont];
				//System.out.print(X1[a] + " - ");
				cont++;

		}
		
		
		/*passando pelos arrays em ordem decrescente e ordenando-os*/
		//BUBBLE
		tempoInicial = System.currentTimeMillis();
		//ordenando de forma crescente
		//laço com a quantidade de elementos do vetor
		for (n=1; n <= X1.length; n++) {
				//laço que percorre da 1a a penultima
				//posição do vetor
				for (i=0; i<=X1.length-2; i++){
					if (X1[i] > X1[i+1]){
						aux = X1[i];
						X1[i] = X1[i+1];
						X1[i+1] = aux;
					}
				}
		}
		
		tempoFinal = System.currentTimeMillis();
		//mostrando o vetor ordenado
		//for (i=0; i<=X.length-1;i++) {
		//	System.out.println((i+1)+"o. numero: "+X[i]);
		//}
		
		System.out.println("\nO metodo BUBBLE ordenou o ARRAY DESCRESCENTE em " + (tempoFinal - tempoInicial) + " milissegundos");
		
		//INSERT
		n = i = aux = j = eleito = menor = pos = 0;
		tempoInicial = System.currentTimeMillis();
		for (i=1 ; i<=X2.length-1; i++){
				eleito = X2[i];
				j =i -1;
				//laço que percorre os elementos a esquerda do nr. 
				//eleito ou até encontrar a posição para recolocação
				//no número eleito respeitando a ordenação procurada
				while (j>=0 && X2[j] > eleito){
						X2[j+1] = X2[j];
						j = j-1;
				}
				X2[j+1] = eleito;
		}
		tempoFinal = System.currentTimeMillis();
		System.out.println("\nO metodo INSERT ordenou o ARRAY DESCRESCENTE em " + (tempoFinal - tempoInicial) + " milissegundos");
		
		//SELECTION
		n = i = aux = j = eleito = menor = pos = 0;
		tempoInicial = System.currentTimeMillis();
		for(i=0;i<=X3.length-2;i++){
			eleito = X3[i];
			//encontrando o menor nr a direita do eleito com sua
			//respectiva posição
			//posição do eleito = 1
			//1o nr a direita do eleito na posicao = i + 1
			menor = X3[i+1];
			pos = i +1;
			//laço que percorre os elementos que estão a direita do 
			//nr eleito, retornando o menor nr a direita e sua posição
			for (j=i+2;j<=X3.length-1;j++){
				if (X3[j] < menor){
					menor = X3[j];
					pos = j;
				}	
			}
			//troca do nr eleito com o nr da posição pos
			//o nr da posição pos é o menor nr à direita do nr eleito
			if(menor< eleito){
				X3[i] = X3[pos];
				X3[pos] = eleito;
			}
		}
		tempoFinal = System.currentTimeMillis();
		System.out.println("\nO metodo SELECTION ordenou o ARRAY DESCRESCENTE em " + (tempoFinal - tempoInicial) + " milissegundos");
		
	}

}
