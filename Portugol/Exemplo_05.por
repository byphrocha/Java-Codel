programa
{
	inclua biblioteca Matematica --> m
	
	funcao inicio()
	{
		real n1, n2, maior, menor
		
		escreva("Informe o primeiro número: ")
		leia(n1)
		escreva("Informe outro valor: ")
		leia(n2)
		
		maior = m.maior_numero(n1, n2)
		escreva("O maior número é: " + maior)
		menor = m.menor_numero(n1, n2)
		escreva(" e o menor número é: " + menor)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 353; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */