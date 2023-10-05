programa
{
	inclua biblioteca Matematica --> m
	funcao inicio()
	{
		inteiro n1, n2, diferenca
		escreva("Quantidade de gols do time 1:")
		leia(n1)
		escreva("Quantidade de gols do time 2:")
		leia(n2)
		diferenca = m.valor_absoluto(n1-n2)
		escolha (diferenca){
			caso 0: escreva("O placar deu empate") pare
			caso 1: escreva("O placar foi normal") pare
			caso 2: escreva("O placar foi normal") pare
			caso 3: escreva("O placar foi normal") pare 
			caso contrario: escreva("O placara foi uma goleada")
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 451; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */