programa
{
	inclua biblioteca Matematica --> m
	
	funcao inicio()
	{
		real base, expoente, resultado , raiz
		
		escreva("Informe a base: ")
		leia(base)
		escreva("Informe o expoente: ")
		leia(expoente)
		
		resultado = m.potencia(base, expoente)
		escreva("\nA potencia é igual a: " + resultado)

		raiz = m.raiz(resultado, 2.0)
		escreva("\nA raiz quadradade de " + resultado + " é " + raiz)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 403; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */