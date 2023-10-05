programa
{
	
	funcao inicio()
	{
		inteiro n1
		escreva("Digite o código de sua encomenda:")
		leia (n1)
		escolha (n1) {
			caso 1: escreva("O código informado se refere ao CD-ROM (700 MB)")
			caso 2: escreva("O código informado se refere ao DVD-ROM (4.7 GB)")
			caso 3: escreva("O código informado se refere ao DVD-09 (8.54 GB)")
			caso 4: escreva("O código informado se refere ao Blu-Ray (25 GB)")
			caso contrario: escreva("O código informado não se refere à nenhum produto")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 489; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */