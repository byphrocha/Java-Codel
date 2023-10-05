programa
{
	
	funcao inicio()
	{
	//Usando a função (se e senao) seria assim: 
		inteiro n1,n2
		escreva("Escreva o primeiro número: ")
		leia (n1)	
		escreva("Escreva o segundo número: ")
		leia (n2)

	se (n1 == n2)
		escreva("O primeiro número é igual o segundo número")
	senao 
		escreva("O primeiro número é diferente do segundo e ")
		se (n1 > n2)
			escreva("o primeiro número é maior que o segundo!")
		se (n2 > n1)
			escreva("o segundo número é maior que o primeiro!") 	
			
	/* Não usando função seria assim:	
		real n1 , n2	 
		escreva("Escreva o primeiro número: ")
		leia (n1)	
		escreva("Escreva o segundo número: ")
		leia (n2)

		 escreva("\n n1 é Maior que n2: ") + (n1>n2))
		 escreva("\n n2 é Maior que n1> ") + 	
		 */
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 743; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */