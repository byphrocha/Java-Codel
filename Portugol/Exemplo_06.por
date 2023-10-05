programa
{
	inclua biblioteca Util --> u
	
	funcao inicio()
	{
		inteiro vi , vf , vs 
		
		escreva("Informe o valor incial: ")
		leia(vi)
		escreva("Informe o valor final: ")
		leia(vf)
		
		vs = u.sorteia(vi, vf)

		escreva("O valor sorteado foi o: " + vs)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 262; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */